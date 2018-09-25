package com.us.library.web.user;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.us.library.bo.UserBo;
import com.us.library.model.User;

@Controller("/")
public class UserController {
	
	@Autowired
	private UserBo userbo;
	
	@RequestMapping(params="/signupUser.htm",method= RequestMethod.POST)
	public ModelAndView createuser(@PathVariable("user") User user) throws Exception{
		int i=userbo.createUser(user);
		Map m= new HashMap();
		m.put("id", i);
		ModelAndView mav=new ModelAndView("success",m);
		return mav;
		
	}
	
	@RenderMapping("/updateUser")
	public ModelAndView updateUser(@PathVariable("user") User user) throws Exception{
		boolean i=userbo.updateUser(user);
		Map m= new HashMap();
		m.replace("id", i);
		ModelAndView mav=new ModelAndView("success",m);
		return mav;
		
	}
}

/*
public int createUser(User user) throws Exception;
public boolean updateUser(User user)throws Exception;
public boolean deleteUser(User user)throws Exception;
public User selectUser(int id)throws Exception;
public List<User> selectAllUser()throws Exception;*/