package cz.ivosahlik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Intellij Idea
 * Created by ivosahlik on 17/01/18
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(Model model) {

        String home = "Hello Spring Boot Dual Jar Or War";

        model.addAttribute("home", home);

        return "home";
    }


}
