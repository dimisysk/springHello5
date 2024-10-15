package gr.aueb.cf.springhello5ult.controller;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
@RequestMapping("/hello")
public class HelloController {

//    @RequestMapping(path="/cf",method = RequestMethod.GET)
    @GetMapping("/cf")
    public String getHelloCF(Model model) {
        model.addAttribute("cf", "Coding Factory");
        model.addAttribute("pageName", "cf");
        return "index";
    }

    @GetMapping("/current-date")
    public String getCurrentDay(Model model) {
        model.addAttribute("currentDate", new Date());
        model.addAttribute("pageName", "current-date");
        return "current-date";
    }
    @GetMapping("/greetings")
    public String getGreetings(@RequestParam(value = "name",defaultValue = "noName" ) String name, Model model) {
        model.addAttribute("name", name);
        return "greetings";
    }
}
