package pl.janmikolajczak.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pl.janmikolajczak.model.Person;
import pl.janmikolajczak.repository.PersonsRepository;
import pl.janmikolajczak.service.CalculateBmi;
import pl.janmikolajczak.service.CalculatorService;

import java.util.Random;

@Controller
public class MainController {

    @Autowired
    CalculatorService calculatorService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello() {
        return "index";
    }

    @RequestMapping(value = "/add-person-bmi", method = RequestMethod.POST)
    public String calculateBmi(@RequestParam() Long weight, @RequestParam() Long height,
                               @RequestParam() String sex, Model model) {



                Person newPerson = new Person(11, height, weight, sex);
                newPerson = CalculateBmi.yourBmi(newPerson);
                this.calculatorService.savePerson(newPerson);
                model.addAttribute("bmiResult", newPerson);

        return "yourbmi";
    }

    @RequestMapping(value = "/search-for-id", method = RequestMethod.GET)
    public String searchById(@RequestParam int personId, Model model) {
        model.addAttribute("bmiResult", PersonsRepository.getPersonById(personId));
        return "yourbmi";
    }
}
