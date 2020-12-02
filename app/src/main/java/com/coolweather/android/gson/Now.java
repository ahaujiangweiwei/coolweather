package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author 蒋伟伟
 * @version 1.0
 * @Date 2020/11/30 13:26
 */
public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
