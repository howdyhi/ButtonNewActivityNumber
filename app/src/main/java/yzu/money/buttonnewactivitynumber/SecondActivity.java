package yzu.money.buttonnewactivitynumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private LinearLayout ll;
    private TextView txtView;
    private Button backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ll= (LinearLayout) findViewById(R.id.activity_second);

        txtView = new TextView(this);
        //if(se)
        ll.addView(txtView);

        backBtn = new Button(this);
        backBtn.setText(R.string.backBtn_name);
        ll.addView(backBtn);
        backBtn.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                finish();
            }
        });
        //backBtn.setOnClickListener((v));

    }
}
