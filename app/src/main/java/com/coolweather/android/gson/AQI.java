package com.coolweather.android.gson;

/**
 * @author 蒋伟伟
 * @version 1.0
 * @Date 2020/11/30 13:24
 */
public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
