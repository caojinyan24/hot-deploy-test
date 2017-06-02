package swa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import swa.service.DataLoaderService;

import javax.annotation.Resource;

/**
 * Created by jinyan on 5/26/17.
 */
@RequestMapping("swa")
@Controller
public class DataLoaderController {
    @Resource
    private DataLoaderService dataLoaderService;

    @RequestMapping("load")
    public ModelAndView index() {
        System.out.println("index request");
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("value", dataLoaderService.getValue("testKey"));
        return modelAndView;
    }
}
