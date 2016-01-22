package com.tutorialspoint;

/**
 * Created by wug on 2016/1/20 0020 18:07.
 * email wug@shinemo.com
 */
public class Address {
    private Integer provinceId;
    private String city;
    private Integer areaId;

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    @Override
    public String toString() {
        return "provinceId:" + provinceId + " city:" + city + " areaId:" + areaId;
    }
}
