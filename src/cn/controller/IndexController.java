package cn.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.pojo.Master;
import cn.service.Master.MasterServiet;

@Controller
@RequestMapping(value = "/nua")
public class IndexController {
	private static Logger log = Logger.getLogger(IndexController.class);
	@Resource
	private MasterServiet masterServiet;

	@RequestMapping(value = "login")
	public String login() {
		return "login";
	}

	@RequestMapping(value = "add")
	public String add() {
		return "add";
	}

	@RequestMapping(value="/addM")
	public String addM(@RequestParam(value="name") String name,@RequestParam(value="password") String password,HttpSession session) {	
		Master master=new  Master();
		master.setName(name);
		master.setPassword(password);
		master.setState(2);
		log.info(master.getName()+master.getPassword()+master.getState());
		boolean puan= masterServiet.addMaster(master);
		if (puan) {
			session.setAttribute("name", name);
			return "";
		} else {
			return "redirect:nua/add";
		}	
	}
	
	@RequestMapping(value="denglu")
	public String denglu(@RequestParam(value="name") String name,@RequestParam(value="password") String password,HttpSession session) {
		
		if(masterServiet.getMaster(name, password)!=null) {
			session.setAttribute("name", name);
			return null;	
		}else {
			
			return "redirect:nua/login";
		}
		
		
	}

}
