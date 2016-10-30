package yzu.money.buttonnewactivitynumber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static final int passValue = 0;
    private LinearLayout ll;
    private NumberPicker numPicker;
    private Button checkBtn;
    private TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ll= (LinearLayout) findViewById(R.id.activity_main);

        numPicker=new NumberPicker(this);
        numPicker.setMaxValue(9);
        numPicker.setMinValue(0);
        numPicker.setValue(0);
        ll.addView(numPicker);

        checkBtn=new Button(this);
        checkBtn.setText(R.string.checkBtn_name);
        ll.addView(checkBtn);
        checkBtn.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                int value = numPicker.getValue();
                Intent it = new Intent(MainActivity.this, SecondActivity.class);
                it.putExtra("selectedNum", value);
                startActivityForResult(it, passValue);
            }
        });

        txtView=new TextView(this);
        ll.addView(txtView);


    }
}
