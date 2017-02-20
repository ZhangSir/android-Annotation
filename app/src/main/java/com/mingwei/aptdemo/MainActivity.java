package com.mingwei.aptdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.mingwe.myanno.BindView;
import com.mingwe.myanno.OnClick;
import com.mingwe.myanno.OnLongClick;
import com.mingwei.myapi.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn1)
    public Button mBtn;
    @BindView(R.id.btn2)
    public Button mBtn2;
    @BindView(R.id.btn3)
    public Button mBtn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mBtn.setText("按钮");
        mBtn2.setText("按钮2");
    }

    @OnClick({R.id.btn1})
    public void click() {
        Toast.makeText(this, "show", Toast.LENGTH_SHORT).show();
    }

    @OnClick({R.id.btn2})
    public void click2() {
        Toast.makeText(this, "show2", Toast.LENGTH_SHORT).show();
    }

    @OnLongClick(R.id.btn3)
    public boolean longClick(){
        Toast.makeText(this, "longClick", Toast.LENGTH_SHORT).show();
        return true;
    }
}
