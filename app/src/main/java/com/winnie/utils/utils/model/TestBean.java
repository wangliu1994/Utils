package com.winnie.utils.utils.model;

import android.support.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author : winnie
 * @date : 2018/11/7
 * @desc
 */
public class TestBean {

    public static String jsonStr = "[\n" +
            "  {\n" +
            "    \"paging\": {\n" +
            "      \"total\": 5,\n" +
            "      \"page_num\": 0,\n" +
            "      \"page_size\": 0\n" +
            "    },\n" +
            "    \"data\": [\n" +
            "      {\n" +
            "        \"id\": 116,\n" +
            "        \"code\": \"1\",\n" +
            "        \"short_name\": \"\",\n" +
            "        \"name\": \"车辆\",\n" +
            "        \"remark\": \"\",\n" +
            "        \"type_id\": 9,\n" +
            "        \"create_time\": \"2018-11-06T15:51:07.000+08:00\",\n" +
            "        \"update_time\": \"2018-11-06T15:51:07.000+08:00\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"id\": 117,\n" +
            "        \"code\": \"2\",\n" +
            "        \"short_name\": \"\",\n" +
            "        \"name\": \"车辆1\",\n" +
            "        \"remark\": \"\",\n" +
            "        \"type_id\": 9,\n" +
            "        \"create_time\": \"2018-11-06T15:51:07.000+08:00\",\n" +
            "        \"update_time\": \"2018-11-06T15:51:07.000+08:00\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"id\": 118,\n" +
            "        \"code\": \"3\",\n" +
            "        \"short_name\": \"\",\n" +
            "        \"name\": \"车辆2\",\n" +
            "        \"remark\": \"\",\n" +
            "        \"type_id\": 9,\n" +
            "        \"create_time\": \"2018-11-06T15:51:07.000+08:00\",\n" +
            "        \"update_time\": \"2018-11-06T15:51:07.000+08:00\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"id\": 119,\n" +
            "        \"code\": \"4\",\n" +
            "        \"short_name\": \"\",\n" +
            "        \"name\": \"车辆3\",\n" +
            "        \"remark\": \"\",\n" +
            "        \"type_id\": 9,\n" +
            "        \"create_time\": \"2018-11-06T15:51:07.000+08:00\",\n" +
            "        \"update_time\": \"2018-11-06T15:51:07.000+08:00\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"id\": 120,\n" +
            "        \"code\": \"99\",\n" +
            "        \"short_name\": \"\",\n" +
            "        \"name\": \"其他\",\n" +
            "        \"remark\": \"\",\n" +
            "        \"type_id\": 9,\n" +
            "        \"create_time\": \"2018-11-06T15:51:07.000+08:00\",\n" +
            "        \"update_time\": \"2018-11-06T15:51:07.000+08:00\"\n" +
            "      }\n" +
            "    ]\n" +
            "  }\n" +
            "]";
    private PagingBean paging;
    private List<DataBean> data;

    public PagingBean getPaging() {
        return paging;
    }

    public void setPaging(PagingBean paging) {
        this.paging = paging;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class PagingBean {
        /**
         * total : 5
         * page_num : 0
         * page_size : 0
         */

        private int total;
        private int page_num;
        private int page_size;

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public int getPage_num() {
            return page_num;
        }

        public void setPage_num(int page_num) {
            this.page_num = page_num;
        }

        public int getPage_size() {
            return page_size;
        }

        public void setPage_size(int page_size) {
            this.page_size = page_size;
        }
    }

    public static class DataBean {
        /**
         * id : 116
         * code : 1
         * short_name :
         * name : 车辆
         * remark :
         * type_id : 9
         * create_time : 2018-11-06T15:51:07.000+08:00
         * update_time : 2018-11-06T15:51:07.000+08:00
         */

        private int id;
        private String code;

        @SerializedName("short_name")
        private String short_name;
        private String name;
        private String remark;

//        @SerializedName("type_id")
        public int type;

        @SerializedName("create_time")
        private String createTime;

        @SerializedName("update_time")
        public String updateTime;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getShort_name() {
            return short_name;
        }

        public void setShort_name(String short_name) {
            this.short_name = short_name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

//        public int getType() {
//            return type;
//        }

//        public void setType(int type_id) {
//            this.type = type_id;
//        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String create_time) {
            this.createTime = create_time;
        }

//        public String getUpdate_time() {
//            return update_time;
//        }
//
//        public void setUpdate_time(String update_time) {
//            this.update_time = update_time;
//        }
    }
}
