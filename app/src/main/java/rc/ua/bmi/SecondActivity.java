package rc.ua.bmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        if (extras != null) {
            TextView txtResult = (TextView) findViewById(R.id.textViewIMC);
            txtResult.setText(extras.getString("imcResult"));
        }
    }

}
