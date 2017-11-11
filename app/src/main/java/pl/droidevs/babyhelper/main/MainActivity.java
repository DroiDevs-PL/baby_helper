package pl.droidevs.babyhelper.main;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import pl.droidevs.babyhelper.R;
import pl.droidevs.babyhelper.app.BabyApp;
import pl.droidevs.babyhelper.main.dagger.DaggerMainComponent;
import pl.droidevs.babyhelper.main.dagger.MainModule;
import pl.droidevs.babyhelper.main.mvp.MainPresenter;
import pl.droidevs.babyhelper.main.mvp.MainView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    MainView view;
    @Inject
    MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initDagger();
        setContentView(view);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        view.setPresenter(presenter);
        presenter.onCreate();
    }

    private void initDagger(){
        DaggerMainComponent.builder()
                .applicationComponent(BabyApp.getApplicationComponent())
                .mainModule(new MainModule(this))
                .build()
                .inject(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
    }
}
