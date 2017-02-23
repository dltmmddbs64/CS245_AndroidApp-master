package cs245.concentration;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

/**
 * Created by Seungyun Lee on 2/22/2017.
 */

public class StartActivity extends AppCompatActivity {

    Button submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);


        Button submitBtn = (Button)findViewById(R.id.submitBtn);


    }


}
