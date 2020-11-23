package com.itdfq.houtai.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itdfq.core.web.BasicController;
import com.itdfq.houtai.model.Equipment;
import com.itdfq.houtai.model.User;
import com.itdfq.houtai.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * Created by DFQ on 2020/10/11 16:18
 */
@Controller
@Scope("prototype")
@RequestMapping("/equipment")
public class EquipmentController extends BasicController {

    @Autowired
    private EquipmentService equipmentService;

    @RequestMapping("/find")
    @ResponseBody
    public Map<String,Object> find( @RequestParam(defaultValue = "1") Integer page,
                                           @RequestParam(defaultValue = "20") Integer rows,String equipNo,String equipName) {
        map.clear();
        PageHelper.startPage(page,rows);
        List<Equipment> ls = equipmentService.findEquipment(equipNo,equipName);
        PageInfo<Equipment> pageInfo = new PageInfo<Equipment>(ls);
        map.put("total",pageInfo.getTotal());
        map.put("rows",pageInfo.getList());
        return map;
    }

    @RequestMapping("/add")
    @ResponseBody
    public Map<String,Object> add(Equipment equipment){
        map.clear();
        try {
            equipmentService.insert(equipment);
            map.put("msg",1);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("msg",e.getMessage());
        }
        return map;
    }
    @RequestMapping("/modify")
    @ResponseBody
    public Map<String,Object> modify(Equipment equipment){
        map.clear();
        try {
            equipmentService.update(equipment);
            map.put("msg",1);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("msg",e.getMessage());
        }
        return map;
    }
    @RequestMapping("/remove")
    @ResponseBody
    public Map<String,Object> remove(int id){
        map.clear();
        try {
            equipmentService.deleteById(id);
            map.put("msg",1);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("msg",e.getMessage());
        }
        return map;
    }

    @RequestMapping("/findPermission")
    @ResponseBody
    public Map<String,Object> findPermission(int userId, int page, int rows, HttpSession session){
        map.clear();
        PageHelper.startPage(page,rows);

        List<Equipment> ls = this.equipmentService.findPermission(userId);
        log.debug("=="+ls.size());
        PageInfo<Equipment> pageInfo = new PageInfo<Equipment>(ls);
        map.put("total",pageInfo.getTotal());
        map.put("rows",pageInfo.getList());
        return map;
    }

    @RequestMapping("/listPermissionBySessionUser")
    @ResponseBody
    public List<Equipment> listPermissionBySessionUser(HttpSession session){

            User user = (User)session.getAttribute("user");
            if(user == null){
                throw new RuntimeException("登陆失效，请重新登陆！");
            }
            int userId = user.getId();
            List<Equipment> ls = this.equipmentService.findPermission(userId);
            return ls;
    }


    /**
     * 查询用户具备权限的设备，下拉框使用
     * @param userId
     * @return
     */
    @RequestMapping("/listPermission")
    @ResponseBody
    public List<Equipment> findPermission(int userId){
        List<Equipment> ls = this.equipmentService.findPermission(userId);
        return ls;
    }

    @RequestMapping("/findNoPermission")
    @ResponseBody
    public Map<String,Object> findNoPermission(int userId,int page,int rows){

        map.clear();
        PageHelper.startPage(page,rows);
        List<Equipment> ls = this.equipmentService.findNoPermission(userId);
        PageInfo<Equipment> pageInfo = new PageInfo<Equipment>(ls);
        map.put("total",pageInfo.getTotal());
        map.put("rows",pageInfo.getList());
        return map;
    }


}
