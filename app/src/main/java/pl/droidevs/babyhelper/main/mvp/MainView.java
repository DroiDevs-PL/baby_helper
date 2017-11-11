package pl.droidevs.babyhelper.main.mvp;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.FloatingActionButton;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import pl.droidevs.babyhelper.R;

public class MainView extends FrameLayout {

    @BindView(R.id.fab)
    FloatingActionButton fab;
    @BindView(R.id.main_content_root)
    View mainRoot;
    @BindView(R.id.main_test_txv)
    TextView testTxv;

    private MainPresenter presenter;


    public MainView(Context context) {
        super(context);
        Log.d("MainView","construct");
        init();
    }

    public MainView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MainView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private void init(){
        View.inflate(getContext(), R.layout.activity_main, this);
        ButterKnife.bind(this);
        fab.setOnClickListener(view -> {
            presenter.fabClick();
        });
    }

    public void showText(String text){
        testTxv.setText(text);
    }

    public void setPresenter(MainPresenter presenter) {
        this.presenter = presenter;
    }
}
