package com.winnie.utils.utils;

import android.util.Log;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.winnie.utils.utils.model.GsonDataBean;
import com.winnie.utils.utils.model.TestBean;
import com.winnie.utils.utils.model.TestBeanResponse;
import com.winnie.utils.utils.model.TestJsonModel;

import java.util.List;

/**
 * @author : winnie
 * @date : 2018/11/23
 * @desc
 */
public class JsonUitls {
    /**
     * json解析对象
     */
    public static TestJsonModel convertJson(){
        TestJsonModel testJsonModel = JSONObject.parseObject(TestJsonModel.jsonStr, TestJsonModel.class);
        Log.d("TAG", testJsonModel.getCapturedImageUri());
        return testJsonModel;
    }

    /**
     * json解析列表
     */
    public static List<TestBean> convertJsonList(){
        List<TestBean> testBeans = JSONObject.parseArray(TestBean.jsonStr, TestBean.class);
        for (TestBean x: testBeans) {
            List<TestBean.DataBean> dataBean = x.getData();
            for(TestBean.DataBean y:dataBean){
                Log.d("TAG", y.toString());
            }
            TestBean.PagingBean pagingBean = x.getPaging();
            Log.d("TAG", x.toString());
        }
        return testBeans;
    }

    /**
     *  json解析列表
     */
    public static List<TestBean> convertJsonListWithStirng(String json){
        List<TestBean> testBeans = JSONObject.parseObject(json, new TypeReference<List<TestBean>>(){});
        return testBeans;
    }

    /**
     *  Gson解析列表
     *  使用泛型会解析不出来
     */
//    public static <T> List<T> convertGsonList(String json1){
//        List<T> testBeans = new Gson().fromJson(json1, new TypeToken<List<T>>(){}.getType());
//        return testBeans;
//    }

    public static List<TestBean> convertGsonList(String json){
        List<TestBean> testBeans = new Gson().fromJson(json, new TypeToken<List<TestBean>>(){}.getType());
        return testBeans;
    }

    /**
     * json解析对象能够自己处理 my_name到myName的转换
     */
    public static TestBeanResponse convertJsonTest(){
        TestBeanResponse testBeanResponse = JSONObject.parseObject(TestBeanResponse.jsonStr, TestBeanResponse.class);
        Log.d("TAG", testBeanResponse.toString());
        return testBeanResponse;
    }

    public static GsonDataBean convertJsonTest1(){
        GsonDataBean gsonDataBean = JSONObject.parseObject(GsonDataBean.json2, GsonDataBean.class);
        Log.d("TAG", gsonDataBean.toString());
        return gsonDataBean;
    }

    /**
     * gson使用 @SerializedName("my_name") public String name; 将my_name对应的值映射到name字段
     */
    public static TestBeanResponse convertGsonTest(){
        TestBeanResponse testBeanResponse = new Gson().fromJson(TestBeanResponse.jsonStr, TestBeanResponse.class);
        Log.d("TAG", testBeanResponse.toString());
        return testBeanResponse;
    }

    public static GsonDataBean convertGsonTest1(){
        GsonDataBean gsonDataBean = new Gson().fromJson(GsonDataBean.json3, GsonDataBean.class);
        Log.d("TAG", gsonDataBean.toString());
        return gsonDataBean;
    }
}
