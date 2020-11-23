package com.itdfq.houtai.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itdfq.core.web.BasicController;
import com.itdfq.houtai.model.User;
import com.itdfq.houtai.service.UserServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@Scope("prototype")
@RequestMapping("/user")
public class UserController extends BasicController {

	@RequestMapping("/findUser")
	@ResponseBody
	public Map<String, Object> findUser(String username,int page,int rows) {
		map.clear();		
		PageHelper.startPage(page, rows);
		List<User> ls = this.userServcie.findUser(username);
		PageInfo<User> pageInfo = new PageInfo<User>(ls);
		map.put("total", pageInfo.getTotal());
		map.put("rows", pageInfo.getList());
		return map;

	}

	@RequestMapping("/userAdd")
	@ResponseBody
	public Map<String, Object> userAdd(User user) {
		user.setPassword("666666");
		map.clear();
		try {
			this.userServcie.userAdd(user);
			map.put("msg", "1");
		} catch (Exception e) {
			map.put("msg", e.getMessage());
		}
		return map;
	}

	@RequestMapping("/userModify")
	@ResponseBody
	public Map<String, Object> userModify(User user) {
		map.clear();
		try {
			this.userServcie.userModify(user);
			map.put("msg", "1");
		} catch (Exception e) {
			map.put("msg", e.getMessage());
		}
		return map;
	}

	@RequestMapping("/userRemove")
	@ResponseBody
	public Map<String, Object> userRemove(int id) {
		map.clear();
		try {
			this.userServcie.userRemove(id);
			map.put("msg", "1");
		} catch (Exception e) {
			map.put("msg", e.getMessage());
		}
		return map;
	}

	@RequestMapping("/login")
	@ResponseBody
	public Map<String, Object> userLogin(String username, String password, HttpServletRequest request) {
		this.log.debug(username + "===" + password);
		map.clear();
		try {
			User user = this.userServcie.findUserByUsername(username);
			if (user == null) {
				map.put("msg", "用户名或密码错误！");
				return map;
			}
			if (!user.getPassword().equals(password)) {
				map.put("msg", "用户名或密码错误！");
				return map;
			}

			map.put("msg", "1");
			map.put("role",user.getRole());
			request.getSession().setAttribute("user", user);
		} catch (Exception e) {
			map.put("msg", e.getMessage());
		}


		return map;
	}

	@RequestMapping("/passwordReset")
	@ResponseBody
	public Map<String, Object> passwordReset(int id) {
		map.clear();
		try {
			this.userServcie.passwordReset(id, "666666");
			map.put("msg", "1");
		} catch (Exception e) {
			map.put("msg", e.getMessage());
			e.printStackTrace();
		}
		return map;
	}

	@RequestMapping("/passwordModify")
	@ResponseBody
	public Map<String, Object> passwordModify(String password,String password1,HttpSession session){
		map.clear();
		User user = (User)session.getAttribute("user");
		if(user==null) {
			map.put("msg", "-1");
			return map;
		}
		
		
		User userDb = this.userServcie.findUserByUsername(user.getUsername());
		if(!userDb.getPassword().equals(password)) {
			map.put("msg", "-2");
			return map;
		}
		
		userDb.setPassword(password1);
		
		try {
			this.userServcie.userModify(userDb);
			map.put("msg", "1");
		} catch (Exception e) {
			map.put("msg", e.getMessage());
			e.printStackTrace();
		}
		return map;
	}
	@Autowired
	private UserServcie userServcie;

	public void setUserServcie(UserServcie userServcie) {
		this.userServcie = userServcie;
	}

}
