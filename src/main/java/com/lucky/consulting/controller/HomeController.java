package com.lucky.consulting.controller;

import com.lucky.consulting.model.ConsultationRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("hourlyRateUSD", 225);
        model.addAttribute("monthlyRetainerUSD", 12500);
        model.addAttribute("consultationRequest", new ConsultationRequest());
        return "index";
    }

    @PostMapping("/book")
    public String submitBooking(@ModelAttribute ConsultationRequest request, Model model) {
        model.addAttribute("request", request);
        return "success";
    }
}
