package com.itdfq.qianduan.dao;

import com.itdfq.qianduan.model.DatasVO;

import java.util.List;

/**
 *
 */
 public interface DatasDAO {


    List<DatasVO> findByCondition(String equipId, String startTime, String endTime);





}