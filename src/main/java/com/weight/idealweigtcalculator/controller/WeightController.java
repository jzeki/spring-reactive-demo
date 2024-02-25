package com.weight.idealweigtcalculator.controller;

import com.weight.idealweigtcalculator.model.Weight;
import com.weight.idealweigtcalculator.service.WeightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WeightController {
    @Autowired
    private WeightService service;
    @GetMapping("/weight")
    public String weightForm(Model model) {
        model.addAttribute("weight", new Weight());
        return "weight";
    }

    @PostMapping("/weight")
    public String weightSubmit(@ModelAttribute Weight weight, Model model) {
        model.addAttribute("weight", service.calculateWeight(weight));
        return "result";
    }
}
