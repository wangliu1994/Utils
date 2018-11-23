package com.winnie.utils.utils.model;

/**
 * @author : winnie
 * @date : 2018/10/15
 * @desc
 */
public class TestJsonModel {
    /**
     * age : 20
     * alarmScore : 0.9
     * captureTime : 1539589617000
     * capturedFullImage : http://p10.yokacdn.com/pic/YOKA/2018-10-08/U445P1TS1538985313_63663.jpg
     * capturedImageUri : http://p1.yokacdn.com/pic/YOKA/2018-04-27/U10085P1TS1524815962_72560.jpg
     * certificateId : 500101199410294420
     * certificateType : 0
     * city : 重庆
     * country : 1
     * createTime : 1539595609000
     * deviceId : 1000002
     * deviceName : 高科一号摄像头
     * dispositionUserId : 8032
     * faceDispositionId : 10001
     * faceId : 65
     * faceLibraryId : lib_1001
     * faceLibraryName : 参会人员名单库
     * faceLibraryType : 2
     * gender : 1
     * name : 张三
     * targetImageUri : https://5b0988e595225.cdn.sohucs.com/images/20171124/b4a40aa308aa4d53a1db94ef62b3aba3.jpeg
     * tollgateId : gaoke_1001
     * tollgateName : 高科一号卡口
     */

    public static String jsonStr = "{\n" +
            "\t\"age\": 20,\n" +
            "\t\"alarmScore\": 0.85,\n" +
            "\t\"captureTime\": 1539589617000,\n" +
            "\t\"capturedFullImage\": \"http://p10.yokacdn.com/pic/YOKA/2018-10-08/U445P1TS1538985313_63663.jpg\",\n" +
            "\t\"capturedImageUri\": \"http://p1.yokacdn.com/pic/YOKA/2018-04-27/U10085P1TS1524815962_72560.jpg\",\n" +
            "\t\"certificateId\": \"5001011994102944x0\",\n" +
            "\t\"certificateType\": \"0\",\n" +
            "\t\"city\": \"四川\",\n" +
            "\t\"country\": \"1\",\n" +
            "\t\"createTime\": 1539595730000,\n" +
            "\t\"deviceId\": \"1000002\",\n" +
            "\t\"deviceName\": \"高科一号摄像头\",\n" +
            "\t\"dispositionUserId\": \"8032\",\n" +
            "\t\"targetImageUri\": \"https://5b0988e595225.cdn.sohucs.com/images/20171124/b4a40aa308aa4d53a1db94ef62b3aba3.jpeg\",\n" +
            "\t\"tollgateId\": \"gaoke_1001\",\n" +
            "\t\"tollgateName\": \"高科一号卡口\",\n" +
            "\t\"faceDispositionId\": 10001,\n" +
            "\t\"faceId\": \"66\",\n" +
            "\t\"faceLibraryId\": \"lib_1001\",\n" +
            "\t\"faceLibraryName\": \"参会人员名单库\",\n" +
            "\t\"faceLibraryType\": 2,\n" +
            "\t\"gender\": 1,\n" +
            "\t\"name\": \"李四\"\n" +
            "}";

    private int age;
    private double alarmScore;
    private long captureTime;
    private String capturedFullImage;
    private String capturedImageUri;
    private String certificateId;
    private String certificateType;
    private String city;
    private String country;
    private long createTime;
    private String deviceId;
    private String deviceName;
    private String dispositionUserId;
    private int faceDispositionId;
    private String faceId;
    private String faceLibraryId;
    private String faceLibraryName;
    private int faceLibraryType;
    private int gender;
    private String name;
    private String targetImageUri;
    private String tollgateId;
    private String tollgateName;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAlarmScore() {
        return alarmScore;
    }

    public void setAlarmScore(double alarmScore) {
        this.alarmScore = alarmScore;
    }

    public long getCaptureTime() {
        return captureTime;
    }

    public void setCaptureTime(long captureTime) {
        this.captureTime = captureTime;
    }

    public String getCapturedFullImage() {
        return capturedFullImage;
    }

    public void setCapturedFullImage(String capturedFullImage) {
        this.capturedFullImage = capturedFullImage;
    }

    public String getCapturedImageUri() {
        return capturedImageUri;
    }

    public void setCapturedImageUri(String capturedImageUri) {
        this.capturedImageUri = capturedImageUri;
    }

    public String getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    public String getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDispositionUserId() {
        return dispositionUserId;
    }

    public void setDispositionUserId(String dispositionUserId) {
        this.dispositionUserId = dispositionUserId;
    }

    public int getFaceDispositionId() {
        return faceDispositionId;
    }

    public void setFaceDispositionId(int faceDispositionId) {
        this.faceDispositionId = faceDispositionId;
    }

    public String getFaceId() {
        return faceId;
    }

    public void setFaceId(String faceId) {
        this.faceId = faceId;
    }

    public String getFaceLibraryId() {
        return faceLibraryId;
    }

    public void setFaceLibraryId(String faceLibraryId) {
        this.faceLibraryId = faceLibraryId;
    }

    public String getFaceLibraryName() {
        return faceLibraryName;
    }

    public void setFaceLibraryName(String faceLibraryName) {
        this.faceLibraryName = faceLibraryName;
    }

    public int getFaceLibraryType() {
        return faceLibraryType;
    }

    public void setFaceLibraryType(int faceLibraryType) {
        this.faceLibraryType = faceLibraryType;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTargetImageUri() {
        return targetImageUri;
    }

    public void setTargetImageUri(String targetImageUri) {
        this.targetImageUri = targetImageUri;
    }

    public String getTollgateId() {
        return tollgateId;
    }

    public void setTollgateId(String tollgateId) {
        this.tollgateId = tollgateId;
    }

    public String getTollgateName() {
        return tollgateName;
    }

    public void setTollgateName(String tollgateName) {
        this.tollgateName = tollgateName;
    }
}
