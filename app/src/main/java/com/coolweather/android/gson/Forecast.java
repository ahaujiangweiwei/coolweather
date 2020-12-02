package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author 蒋伟伟
 * @version 1.0
 * @Date 2020/11/30 15:07
 */
public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}
