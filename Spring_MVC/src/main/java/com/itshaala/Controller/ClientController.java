package com.itshaala.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClientController {

    @RequestMapping("/student/{student_id}")
    public ModelAndView getStudentByID(@PathVariable("student_id") int studentId) {

        ModelAndView mav = new ModelAndView("student");
        mav.addObject("student", "Welcome student " + studentId);
        return mav;
    }
}
