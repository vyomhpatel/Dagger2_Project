package b12app.vyom.com.daggerproject;


import dagger.Module;
import dagger.Provides;

@Module
public class LoginModule {



    //we need to specify provides so that component interface can know which class can be accessed from the module and which class can not be.
    @Provides
    Example2 getExample2(){
        return new Example2();
    }


}
