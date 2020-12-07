package com.coolweather.android.db;

import org.litepal.LitePal;
import org.litepal.crud.LitePalSupport;
//import org.litepal.crud.DataSupport;

/**
 * @author 蒋伟伟
 * @version 1.0
 * @Date 2020/11/26 10:58
 */
public class Province extends LitePalSupport {
    private int id;
    private String provinceName;
    private int provinceCode;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
