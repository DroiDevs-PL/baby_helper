package pl.droidevs.babyhelper.app.dagger;

import android.content.Context;
import dagger.Module;
import dagger.Provides;
import pl.droidevs.babyhelper.app.BabyApp;

@Module
public class ApplicationModule {

    private BabyApp app;

    public ApplicationModule(BabyApp app) {
        this.app = app;
    }

    @Provides
    Context providesContext(){
        return app;
    }
}
