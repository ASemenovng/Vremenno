package com.webcar.WebCar.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthorizationController {

    @GetMapping("/authorization")
    public String authoMain(Model model){
        model.addAttribute("title", "authorization");
        return "authorization";
    }
}
