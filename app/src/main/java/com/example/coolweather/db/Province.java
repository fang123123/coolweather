package com.example.coolweather.db;

import org.litepal.crud.LitePalSupport;

public class Province extends LitePalSupport {
    private int id;//省数据的id
    private String ProvinceName;//省的名字
    private int provinceCode;//省对应的代码

    public int getId() {
        return id;
    }

    public String getProvinceName() {
        return ProvinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceName(String provinceName) {
        ProvinceName = provinceName;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
