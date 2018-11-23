package com.winnie.utils.utils;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

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

    public void json_object(View view) {
        TestJsonModel model = JsonUitls.convertJson();
        mTextView.setText(model.getDeviceName());
    }

    public void json_list(View view) {
        List<TestBean> testBeans = JsonUitls.convertJsonList();
        mTextView.setText(testBeans.toString());
    }

    public void json_lis1(View view) {
        List testBeans = JsonUitls.<TestBean>convertJsonListWithStirng(TestBean.jsonStr);
        mTextView.setText(testBeans.toString());
    }

    public void gson_list(View view) {
        List testBeans = JsonUitls.<TestBean>convertGsonList(TestBean.jsonStr);
        mTextView.setText(testBeans.toString());
    }

    public void json_test(View view) {
        TestBeanResponse model = JsonUitls.convertJsonTest();
        mTextView.setText(model.getMy_name());
    }

    public void gson_test(View view) {
        TestBeanResponse model = JsonUitls.convertGsonTest();
        mTextView.setText(model.getMy_name());
    }
}
