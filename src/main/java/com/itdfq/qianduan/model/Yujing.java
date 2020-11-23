package com.itdfq.qianduan.model;

import java.util.Date;

public class Yujing {
    private Integer id;
    private Date time;      //预警时间
    private String dengji;  //预警等级
    private String name;   //预警类型
    private int equipId;

    @Override
    public String toString() {
        return "Yujing{" +
                "id=" + id +
                ", time=" + time +
                ", dengji='" + dengji + '\'' +
                ", name='" + name + '\'' +
                ", equipId='" + equipId + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getDengji() {
        return dengji;
    }

    public void setDengji(String dengji) {
        this.dengji = dengji;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEquipId() {
        return equipId;
    }

    public void setEquipId(int equipId) {
        this.equipId = equipId;
    }
}
