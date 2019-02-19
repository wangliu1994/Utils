package com.winnie.utils.utils;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.winnie.utils.utils.model.GsonDataBean;
import com.winnie.utils.utils.model.TestBean;
import com.winnie.utils.utils.model.TestBeanResponse;
import com.winnie.utils.utils.model.TestJsonModel;

import java.util.List;

/**
 * @author winnie
 */
public class MainActivity extends AppCompatActivity {

    private TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = findViewById(R.id.content);
    }

    public void jsonObject(View view) {
        TestJsonModel model = JsonUitls.convertJson();
        mTextView.setText(model.getDeviceName());
    }

    public void jsonList(View view) {
        List<TestBean> testBeans = JsonUitls.convertJsonList();
        mTextView.setText(testBeans.toString());
    }

    public void jsonList1(View view) {
        List testBeans = JsonUitls.<TestBean>convertJsonListWithStirng(TestBean.jsonStr);
        mTextView.setText(testBeans.toString());
    }

    public void gsonList(View view) {
        List testBeans = JsonUitls.<TestBean>convertGsonList(TestBean.jsonStr);
        mTextView.setText(testBeans.toString());
    }

    public void jsonTest(View view) {
        GsonDataBean model = JsonUitls.convertJsonTest1();
        mTextView.setText(model.getMessage());
    }

    public void gsonTest(View view) {
        GsonDataBean model = JsonUitls.convertGsonTest1();
        mTextView.setText(model.getMessage());
    }
}
