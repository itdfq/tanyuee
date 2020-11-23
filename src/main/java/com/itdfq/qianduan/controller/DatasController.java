package com.itdfq.qianduan.controller;


import com.itdfq.core.web.BasicController;
import com.itdfq.qianduan.model.DatasVO;
import com.itdfq.qianduan.service.DatasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/datass")
public class DatasController extends BasicController {

    @Autowired
    private DatasService datasService;




    @RequestMapping("/findByCondition")
    public Map<String,Object> findByPage(String equipId,String startTime,String endTime) {
        map.clear();
        try{
            List<DatasVO> ls = this.datasService.findByCondition(equipId,startTime,endTime);
            map.put("msg","1");
            map.put("ls",ls);
        }catch (Exception e){
            map.put("msg",e.getMessage());
        }
        return map;
    }

}
