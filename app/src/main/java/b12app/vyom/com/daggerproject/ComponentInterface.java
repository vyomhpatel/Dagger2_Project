package b12app.vyom.com.daggerproject;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {Module.class, LoginModule.class})
@Singleton
public interface ComponentInterface {

    void inject(MainActivity mainActivity);
}
