package com.itshaala.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class greetingController {

    @RequestMapping(value = "/greet" , method = RequestMethod.GET) // it is the url that run on brower

    public ModelAndView greet(){
        ModelAndView mav = new ModelAndView(); // it is the html and jsp page

        mav.setViewName("greeting");  // this is html jsp pagee that create the webpage
         mav.addObject("message" , "hello world ");  // print data to the greet page  hello word

        return  mav ;
    }
}
