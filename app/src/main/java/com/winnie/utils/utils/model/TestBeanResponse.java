package com.winnie.utils.utils.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author : winnie
 * @date : 2018/11/7
 * @desc
 */
public class TestBeanResponse {
    public static String jsonStr = "{\n" +
            "\t\"my_name\": \"winnie\",\n" +
            "\t\"his_name\": \"Zt\",\n" +
            "\t\"custom_data\": [{\n" +
            "\t\t\"paging\": {\n" +
            "\t\t\t\"total\": 5,\n" +
            "\t\t\t\"page_num\": 0,\n" +
            "\t\t\t\"page_size\": 0\n" +
            "\t\t},\n" +
            "\t\t\"data\": [{\n" +
            "\t\t\t\t\"id\": 116,\n" +
            "\t\t\t\t\"code\": \"1\",\n" +
            "\t\t\t\t\"short_name\": \"\",\n" +
            "\t\t\t\t\"name\": \"嫌疑车辆\",\n" +
            "\t\t\t\t\"remark\": \"\",\n" +
            "\t\t\t\t\"type_id\": 9,\n" +
            "\t\t\t\t\"create_time\": \"2018-11-06T15:51:07.000+08:00\",\n" +
            "\t\t\t\t\"update_time\": \"2018-11-06T15:51:07.000+08:00\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"id\": 117,\n" +
            "\t\t\t\t\"code\": \"2\",\n" +
            "\t\t\t\t\"short_name\": \"\",\n" +
            "\t\t\t\t\"name\": \"交通违法车辆\",\n" +
            "\t\t\t\t\"remark\": \"\",\n" +
            "\t\t\t\t\"type_id\": 9,\n" +
            "\t\t\t\t\"create_time\": \"2018-11-06T15:51:07.000+08:00\",\n" +
            "\t\t\t\t\"update_time\": \"2018-11-06T15:51:07.000+08:00\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"id\": 118,\n" +
            "\t\t\t\t\"code\": \"3\",\n" +
            "\t\t\t\t\"short_name\": \"\",\n" +
            "\t\t\t\t\"name\": \"肇事逃逸车辆\",\n" +
            "\t\t\t\t\"remark\": \"\",\n" +
            "\t\t\t\t\"type_id\": 9,\n" +
            "\t\t\t\t\"create_time\": \"2018-11-06T15:51:07.000+08:00\",\n" +
            "\t\t\t\t\"update_time\": \"2018-11-06T15:51:07.000+08:00\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"id\": 119,\n" +
            "\t\t\t\t\"code\": \"4\",\n" +
            "\t\t\t\t\"short_name\": \"\",\n" +
            "\t\t\t\t\"name\": \"被盗抢车辆\",\n" +
            "\t\t\t\t\"remark\": \"\",\n" +
            "\t\t\t\t\"type_id\": 9,\n" +
            "\t\t\t\t\"create_time\": \"2018-11-06T15:51:07.000+08:00\",\n" +
            "\t\t\t\t\"update_time\": \"2018-11-06T15:51:07.000+08:00\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"id\": 120,\n" +
            "\t\t\t\t\"code\": \"99\",\n" +
            "\t\t\t\t\"short_name\": \"\",\n" +
            "\t\t\t\t\"name\": \"其他\",\n" +
            "\t\t\t\t\"remark\": \"\",\n" +
            "\t\t\t\t\"type_id\": 9,\n" +
            "\t\t\t\t\"create_time\": \"2018-11-06T15:51:07.000+08:00\",\n" +
            "\t\t\t\t\"update_time\": \"2018-11-06T15:51:07.000+08:00\"\n" +
            "\t\t\t}\n" +
            "\t\t]\n" +
            "\t}]\n" +
            "}";

    @SerializedName("my_name")
    private String name;
    @SerializedName("his_name")
    public String hisName;
    @SerializedName("custom_data")
    public List<TestBean> customData;

    public String getMy_name() {
        return name;
    }

    public void setMy_name(String my_name) {
        this.name = my_name;
    }
}
