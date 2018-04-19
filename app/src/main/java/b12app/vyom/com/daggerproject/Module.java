package b12app.vyom.com.daggerproject;


import dagger.Provides;

//in order to inject any class anywhere in any activity or fragment, we need to write @Provides.


// class level dependency.
@dagger.Module
public class Module {

    //here i have specified @Provides so this class and its method will get included in the module when we try to use the module.
    //method level dependency as we are going to use method specified in the example class.
    @Provides
    public Example getExampleInstance(){

        return new Example();
    }

    //here i have not specified @Provides so this class will not get included in the module which injecting it to some activity.
    public Example2 getExample2Instance(){

        return new Example2();
    }

}
