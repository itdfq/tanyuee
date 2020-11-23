package com.itdfq.qianduan.model;

import java.util.Date;

public class YujingVO {
    private Integer id;
    private Date time;      //预警时间
    private String dengji;  //预警等级
    private String name;   //预警类型
    private String equipNo;

    public Integer getId() {
        return id;
    }

    public Date getTime() {
        return time;
    }

    public String getDengji() {
        return dengji;
    }

    public String getName() {
        return name;
    }

    public String getEquipNo() {
        return equipNo;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public void setDengji(String dengji) {
        this.dengji = dengji;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEquipNo(String equipNo) {
        this.equipNo = equipNo;
    }
}
