package lk.ijse.gdse.aad68.notetaker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping("/api/v1/welcome")
    public String welcome(Model model) {
        model.addAttribute("message", "Welcome to NoteCollector V2 - 2024");
        return "welcome";
    }
}

