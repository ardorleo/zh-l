package com.std.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {

    @RequestMapping("/msgx.htm")
    public ModelAndView redirect(HttpServletRequest request) {
    	ModelAndView pageModel=new ModelAndView("msgx");
    	pageModel.addObject("msg", "Hello spring mvc, tiles, velocity!");
    	pageModel.addObject("flag","7");
    	request.setAttribute("test","test");
        return pageModel;
    }
    @RequestMapping("/msg.htm")
    public String redirectNew(HttpServletRequest request) {
    	ModelAndView pageModel=new ModelAndView("msgx");
    	pageModel.addObject("msg", "Hello spring mvc, tiles, velocity!");
    	pageModel.addObject("flag","7");
    	request.setAttribute("test","test");
        return "msgx";
    }
}
