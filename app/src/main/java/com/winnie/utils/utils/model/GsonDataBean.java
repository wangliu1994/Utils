package com.winnie.utils.utils.model;

/**
 * @author : winnie
 * @date : 2019/2/19
 * @desc
 */
public class GsonDataBean {
    /**
     * Json1解析正常
     */
    public static String json1 = "{\n" +
            "\t\"code\": \"0103020001\",\n" +
            "\t\"message\": \"系统内部异常\",\n" +
            "\t\"data\": {\n" +
            "\t\t\"message\": \"Source must not be null\"\n" +
            "\t}\n" +
            "}";

    /**
     * Json2解析报错，期望的是Object，实际上是String
     */
    public static String json2 = "{\n" +
            "\t\"code\": \"0103020001\",\n" +
            "\t\"message\": \"系统内部异常\",\n" +
            "\t\"data\": \"Source must not be null\"\n" +
            "}";

    /**
     * Json3解析正常
     */
    public static String json3 = "{\n" +
            "\t\"code\": \"0103020001\",\n" +
            "\t\"message\": \"系统内部异常\",\n" +
            "\t\"data\": null\n" +
            "}";

    /**
     * Json4解析正常
     */
    public static String json4 = "{\n" +
            "\t\"code\": \"0103020001\",\n" +
            "\t\"message\": \"系统内部异常\",\n" +
            "\t\"data\": {}\n" +
            "}";
    private String code;
    private String message;
    private DataBean data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private String message;

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
}
