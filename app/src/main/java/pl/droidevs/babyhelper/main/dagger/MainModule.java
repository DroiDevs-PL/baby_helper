package pl.droidevs.babyhelper.main.dagger;

import android.app.Activity;
import android.content.Context;
import dagger.Module;
import dagger.Provides;
import pl.droidevs.babyhelper.main.MainActivity;
import pl.droidevs.babyhelper.main.mvp.MainModel;
import pl.droidevs.babyhelper.main.mvp.MainPresenter;
import pl.droidevs.babyhelper.main.mvp.MainView;
import pl.droidevs.babyhelper.main.mvp.MainView_ViewBinding;

@Module
public class MainModule {
    private MainActivity activity;

    public MainModule(MainActivity activity) {
        this.activity = activity;
    }

    @Provides
    Context providesContext(){
        return activity;
    }

    @Provides
    MainActivity providesActivity(){
        return activity;
    }

    @Provides
    @MainScope
    MainView providesView(Context context){
        return new MainView(context);
    }

    @Provides
    @MainScope
    MainModel providesModel(){
        return new MainModel();
    }

    @Provides
    @MainScope
    MainPresenter providesPresenter(MainView view, MainModel model){
        return new MainPresenter(view, model);
    }
}
