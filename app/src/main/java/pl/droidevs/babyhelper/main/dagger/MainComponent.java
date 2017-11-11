package pl.droidevs.babyhelper.main.dagger;

import dagger.Component;
import pl.droidevs.babyhelper.app.dagger.ApplicationComponent;
import pl.droidevs.babyhelper.main.MainActivity;

@MainScope
@Component(modules = {MainModule.class}, dependencies = {ApplicationComponent.class})
public interface MainComponent {
    void inject(MainActivity activity);
}
