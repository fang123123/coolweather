package com.example.coolweather.db;

import org.litepal.crud.LitePalSupport;

public class County extends LitePalSupport {
    private int id;//县记录的id
    private String countyName;//县名称
    private int weatherId;//该县对应的天气的id
    private int cityId;//当前县所在城市的id

    public int getId() {
        return id;
    }

    public String getCountyName() {
        return countyName;
    }

    public int getWeatherId() {
        return weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
