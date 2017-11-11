package pl.droidevs.babyhelper.app;

import android.app.Application;
import dagger.android.DaggerApplication;
import pl.droidevs.babyhelper.app.dagger.ApplicationComponent;
import pl.droidevs.babyhelper.app.dagger.ApplicationModule;
import pl.droidevs.babyhelper.app.dagger.DaggerApplicationComponent;

public class BabyApp extends Application{
    private static ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public static ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

}
