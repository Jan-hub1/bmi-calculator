package pl.janmikolajczak.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pl.janmikolajczak.model.Person;
import pl.janmikolajczak.repository.PersonsRepository;
import pl.janmikolajczak.service.CalculateBmi;

import java.util.List;
import java.util.Random;

@Controller
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello() {
        return "index";
    }

    @RequestMapping(value = "/add-person-bmi", method = RequestMethod.POST)
    public String calculateBmi(@RequestParam() double weight, @RequestParam() double height,
                               @RequestParam() String sex, Model model) {

        while (true) {
            Random random = new Random();
            int id = random.nextInt(9999);
            if (PersonsRepository.idCheck(id)) {

                double bmiResult = CalculateBmi.yourBmi(weight, height, sex);

                Person newPerson = new Person(id, height, weight, sex, bmiResult);
                PersonsRepository.addPersonToList(newPerson);
                model.addAttribute("bmiResult", newPerson);
                break;
            }
        }
        return "yourbmi";
    }

    @RequestMapping(value = "/search-for-id", method = RequestMethod.GET)
    public String searchById(@RequestParam int personId, Model model) {
        model.addAttribute("bmiResult", PersonsRepository.getPersonById(personId));
        return "yourbmi";
    }
}
