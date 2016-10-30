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
    String chineseNum[]={"零", "壹", "貳", "參", "肆", "伍", "陸", "柒", "捌", "玖"};

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==passValue)
            txtView.setText(chineseNum[resultCode]);
    }

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
        txtView.setTextSize(100);
        txtView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        ll.addView(txtView);


    }
}
