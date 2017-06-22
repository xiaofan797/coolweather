package com.xiaofan.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by xiaofan on 2017/6/22.
 */

public class Province extends DataSupport {

    private  int id;

    private  String provinceName;

    private int province;


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

    public int getProvince() {
        return province;
    }

    public void setProvince(int province) {
        this.province = province;
    }

}
