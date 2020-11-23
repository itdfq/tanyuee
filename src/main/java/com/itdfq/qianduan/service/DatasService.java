package com.itdfq.qianduan.service;


import com.itdfq.qianduan.dao.DatasDAO;
import com.itdfq.qianduan.model.DatasVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 */
@Service
public class DatasService {

    @Resource
    private DatasDAO datasDAO;

    @Transactional
    public List<DatasVO> findByCondition(String equipId, String startTime, String endTime) {
        List<DatasVO> ls = this.datasDAO.findByCondition(equipId,startTime,endTime);
        return ls;
    }

}