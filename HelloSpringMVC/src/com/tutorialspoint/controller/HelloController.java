package com.tutorialspoint.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by wug on 2016/1/28 0028 10:53.
 * email wug@shinemo.com
 */
@Controller
@RequestMapping("/hello")
public class HelloController {
    private static Logger LOG = Logger.getLogger(HelloController.class);

    @RequestMapping(method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        LOG.info("begin to process!");
        model.addAttribute("message", "Hello Spring MVC Framework!");
        LOG.info("process end!");
        return "hello";
    }
}
