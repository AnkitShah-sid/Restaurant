package com.example.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    CategoryController categoryController;

    @RequestMapping("/home")
    public String home(Model model) {

        model.addAttribute("categories", categoryController.getAllCategories());

        return "home.html";
    }

}

