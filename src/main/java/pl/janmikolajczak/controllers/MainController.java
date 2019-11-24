package pl.janmikolajczak.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello() {
        return "index";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String calculateBmi(@RequestParam() String sex, @RequestParam() double)
}
