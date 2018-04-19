package b12app.vyom.com.daggerproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

import dagger.Component;

//  iExample = new Example("title");
//   String data =  iExample.getData();
//

public class MainActivity extends AppCompatActivity {


    TextView tvData;
    @Inject Example example ;
    @Inject Example2 example2;
    ComponentInterface componentInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //using dagger so we do not need to instatiate classes and we can use such classes and their methods using the builder pattern.

        componentInterface = DaggerComponentInterface.builder().build();
        // dagger automatically creates an dagger instance of your component interface

        //injecting MainActivity to component interface to use component interface
        componentInterface.inject(this);

        tvData = findViewById(R.id.tvData);

        //received data from two different classes and printed them here without creating any instances of those classes
        tvData.setText(example.getName()+" "+example2.getSurname());
    }
}
