package pl.droidevs.babyhelper.app.dagger;

import dagger.Component;
import pl.droidevs.babyhelper.app.BabyApp;

@AppScope
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {
    public void inject(BabyApp app);
}
