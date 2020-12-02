package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author 蒋伟伟
 * @version 1.0
 * @Date 2020/11/30 13:12
 */
public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }

}
