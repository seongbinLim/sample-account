package com.nhn.rookie8.sample.account;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class MainController {
    @GetMapping("/hello")
    public String welcome(Model model) {
        model.addAttribute("time", new Date());
        model.addAttribute("message", "account api");
        return "welcome";
    }

    @GetMapping("/helloworld")
    @ResponseBody //just string, view resolver, message converter
    public String hellowworld() {
        return "adf nnnn Hello Rookie!";
    }
}
