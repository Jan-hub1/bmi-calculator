package pl.janmikolajczak.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pl.janmikolajczak.service.CalculateBmi;

@Controller
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello() {
        return "index";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String calculateBmi(@RequestParam() double weight, @RequestParam() double height,
                               @RequestParam() String sex, Model model) {
        double bmiResult = CalculateBmi.yourBmi(weight, height);
        model.addAttribute("bmiResult", bmiResult);
        return "yourbmi";
    }
}
