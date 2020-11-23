package com.itdfq.qianduan.service;


import com.itdfq.qianduan.dao.YujingDao;
import com.itdfq.qianduan.model.YujingVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class YujingService {
    @Resource
    private YujingDao yujingDao;

    @Transactional
    public List<YujingVO> findByUserId(int userId) {
        List<YujingVO> ls = this.yujingDao.findByUserId(userId);
        return ls;
    }


    public void remove(int id) {
        yujingDao.delete(id);
    }
}
