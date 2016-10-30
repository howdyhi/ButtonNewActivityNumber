package yzu.money.buttonnewactivitynumber;

import android.content.Intent;
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
    String engNum[]={"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ll= (LinearLayout) findViewById(R.id.activity_second);

        Intent it = getIntent();
        int selectedNum = it.getIntExtra("selectedNum", 0);

        txtView = new TextView(this);
        txtView.setText(engNum[selectedNum]);
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
