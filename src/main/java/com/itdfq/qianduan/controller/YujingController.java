package com.itdfq.qianduan.controller;


import com.itdfq.core.web.BasicController;
import com.itdfq.houtai.model.User;
import com.itdfq.qianduan.model.YujingVO;
import com.itdfq.qianduan.service.YujingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/yujing")
public class YujingController extends BasicController {


    @Autowired
    private YujingService yujingService;

    @RequestMapping("/findByUserId")
    public Map<String,Object> findByUserId(HttpSession session) {
        map.clear();
        try {
            User user = (User) session.getAttribute("user");
            if (user == null) {
                map.put("msg","登陆失效，请重新登陆！");
                return map;
            }
            int userId = user.getId();
            List<YujingVO> ls = this.yujingService.findByUserId(userId);
            map.put("msg","1");
            map.put("ls",ls);
        }catch (Exception e){
            map.put("msg",e.getMessage());
        }

        return map;
    }
    @RequestMapping("/remove")
    public Map<String,Object> remove(int id) {
        map.clear();
        try {
            yujingService.remove(id);
            map.put("msg",1);
        } catch (Exception e) {
            map.put("msg",e.getMessage());
            e.printStackTrace();
        }
        return map;
    }


}
