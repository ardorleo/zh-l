package com.std.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {

    @RequestMapping("/msg.htm")
    public ModelAndView redirect(HttpServletRequest request) {
    	ModelAndView pageModel=new ModelAndView("msgx");
    	pageModel.addObject("msg", "Hello spring mvc, tiles, velocity!");
        return pageModel;
    }
}
