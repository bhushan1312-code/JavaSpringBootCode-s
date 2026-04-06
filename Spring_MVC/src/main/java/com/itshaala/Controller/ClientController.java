    package com.itshaala.Controller;

    import org.springframework.stereotype.Controller;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.PathVariable;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RequestParam;
    import org.springframework.web.servlet.ModelAndView;

    @Controller
    public class ClientController {

        @RequestMapping("/student/{student_id}")
        public ModelAndView getStudentByID(@PathVariable("student_id") int studentId) {

            ModelAndView mav = new ModelAndView("student");
            mav.addObject("student", "Welcome student " + studentId);
            return mav;
        }

        @RequestMapping("/branch")
        public ModelAndView getBranchByNameAndLocation(
                @RequestParam("name") String branchName,
                @RequestParam("location") String location) {

            ModelAndView mav = new ModelAndView("branch");
            mav.addObject("branch", "branch details " + branchName + "\t" + location);
            return mav;
        }

        @GetMapping("register-form")
            public String registerForm(){
                return "register-form";
            }

        @GetMapping("/register")
        public ModelAndView register(
                @RequestParam("email") String email,
                @RequestParam("psw") String password,
                @RequestParam("psw_repeat") String repeatPassword) {

            ModelAndView mav = new ModelAndView("register");
            mav.addObject("email", email);
            mav.addObject("password", password);
            mav.addObject("passwordRepeat", repeatPassword);
            return mav;
        }

    }

