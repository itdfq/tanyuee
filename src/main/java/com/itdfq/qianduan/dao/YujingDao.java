package com.itdfq.qianduan.dao;


import com.itdfq.qianduan.model.YujingVO;

import java.util.List;

public interface YujingDao {
    //分页查询
    List<YujingVO> findByUserId(int userId);
    //通过id删除
    void delete(int id);
}
