package com.itdfq.qianduan.model;

import java.util.Date;

public class DatasVO {

    private  String startTime;
    private String endTime;



    private String  equipNo;
    /**
     *
     */
    private Integer id;
    /**
     * 当前时间
     */
    private Date nowtime;
    /**
     * 红外计数
     */
    private Integer hongwai;
    /**
     * 风向
     */
    private String fengxiang;
    /**
     * 风速
     */
    private String fengsu;
    /**
     * 温度
     */
    private Object wendu;
    /**
     * 湿度
     */
    private Object shidu;
    /**
     *
     */
    private Object pm;
    /**
     * 土壤温度10cm
     */
    private Object tWendu10;
    /**
     * 土壤湿度10cm
     */
    private Object tShidu10;
    /**
     * 土壤温度20cm
     */
    private Object tWendu20;
    /**
     * 土壤湿度20cm
     */
    private Object tShidu20;
    /**
     * 土壤温度30cm
     */
    private Object tWendu30;
    /**
     * 土壤湿度30cm
     */
    private Object tShidu30;

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getEquipNo() {
        return equipNo;
    }

    public Integer getId() {
        return id;
    }

    public Date getNowtime() {
        return nowtime;
    }

    public Integer getHongwai() {
        return hongwai;
    }

    public String getFengxiang() {
        return fengxiang;
    }

    public String getFengsu() {
        return fengsu;
    }

    public Object getWendu() {
        return wendu;
    }

    public Object getShidu() {
        return shidu;
    }

    public Object getPm() {
        return pm;
    }

    public Object gettWendu10() {
        return tWendu10;
    }

    public Object gettShidu10() {
        return tShidu10;
    }

    public Object gettWendu20() {
        return tWendu20;
    }

    public Object gettShidu20() {
        return tShidu20;
    }

    public Object gettWendu30() {
        return tWendu30;
    }

    public Object gettShidu30() {
        return tShidu30;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setEquipNo(String equipNo) {
        this.equipNo = equipNo;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNowtime(Date nowtime) {
        this.nowtime = nowtime;
    }

    public void setHongwai(Integer hongwai) {
        this.hongwai = hongwai;
    }

    public void setFengxiang(String fengxiang) {
        this.fengxiang = fengxiang;
    }

    public void setFengsu(String fengsu) {
        this.fengsu = fengsu;
    }

    public void setWendu(Object wendu) {
        this.wendu = wendu;
    }

    public void setShidu(Object shidu) {
        this.shidu = shidu;
    }

    public void setPm(Object pm) {
        this.pm = pm;
    }

    public void settWendu10(Object tWendu10) {
        this.tWendu10 = tWendu10;
    }

    public void settShidu10(Object tShidu10) {
        this.tShidu10 = tShidu10;
    }

    public void settWendu20(Object tWendu20) {
        this.tWendu20 = tWendu20;
    }

    public void settShidu20(Object tShidu20) {
        this.tShidu20 = tShidu20;
    }

    public void settWendu30(Object tWendu30) {
        this.tWendu30 = tWendu30;
    }

    public void settShidu30(Object tShidu30) {
        this.tShidu30 = tShidu30;
    }
}
