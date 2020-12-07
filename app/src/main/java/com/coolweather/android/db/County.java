package com.coolweather.android.db;

import org.litepal.LitePal;
import org.litepal.crud.LitePalSupport;
//import org.litepal.crud.DataSupport;

/**
 * @author 蒋伟伟
 * @version 1.0
 * @Date 2020/11/26 13:16
 */
public class County extends LitePalSupport {
    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;

    public int getId() {
        return id;
    }

    public String getCountyName() {
        return countyName;
    }

    public String getWeatherId() {
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

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

}
