package com.example.todo.tododemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/index")
    public String getIndex(Model model) {
        model.addAttribute("creator", "Super Saurabh the Creator");
        return "general/index";
    }

    @GetMapping("/about")
    public String getAbout() {
        return "general/about";
    }

    @GetMapping("/help")
    public String getHelp() {
        return "general/help";
    }

}
