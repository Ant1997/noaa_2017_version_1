package com.example.noaa_2017_version_1;

//Data class represents each data rows in the csv file.
public class Data {
    //AEM00041194,20170101,PRCP,0,,,S,
    private final String id;
    private final String yearMonthDay;
    private final String element;
    private final String value;
    private final String mFlag;
    private final String qFlag;
    private final String sFlag;
    private final String xFlag;

    public Data(String id,
                String yearMonthDay,
                String element,
                String value,
                String mFlag,
                String qFlag,
                String sFlag,
                String xFlag){
        this.id = id;
        this.yearMonthDay = yearMonthDay;
        this.element = element;
        this.value = value;
        this.mFlag = mFlag;
        this.qFlag = qFlag;
        this.sFlag = sFlag;
        this.xFlag = xFlag;

    }


    public String getId() {
        return id;
    }

    public String getYearMonthDay() {
        return yearMonthDay;
    }

    public String getElement() {
        return element;
    }

    public String getValue() {
        return value;
    }

    public String getmFlag() {
        return mFlag;
    }

    public String getqFlag() {
        return qFlag;
    }

    public String getsFlag() {
        return sFlag;
    }

    public String getxFlag() {
        return xFlag;
    }
}
