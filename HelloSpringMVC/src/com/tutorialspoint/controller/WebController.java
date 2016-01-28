package com.tutorialspoint.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by wug on 2016/1/28 0028 16:34.
 * email wug@shinemo.com
 */
@Controller
public class WebController {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "redirect/index";
    }

    @RequestMapping(value = "/redirect", method = RequestMethod.GET)
    public String redirect() {
        return "redirect:finalPage";
    }

    @RequestMapping(value = "/finalPage", method = RequestMethod.GET)
    public String finalPage() {
        return "redirect/final";
    }

    @RequestMapping(value = "/staticPage", method = RequestMethod.GET)
    public String staticPage() {
        return "redirect:/static/html/final.html";
    }
}
