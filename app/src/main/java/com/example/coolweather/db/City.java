package com.example.coolweather.db;

import org.litepal.LitePal;
import org.litepal.crud.LitePalSupport;

public class City extends LitePalSupport {
    private int id;//城市记录的id
    private String cityName;//城市名称
    private int cityCode;//城市代码
    private int provinceId;//当前城市所在省给你的id

    public int getId() {
        return id;
    }

    public String getCityName() {
        return cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
