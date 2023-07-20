package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.services.*;

@Controller
public class RecordController {
    private RecordService recordService;
    @GetMapping("/")
    public String records(@RequestParam(name = "rate", required = false)
                              String mode, Model model){
        model.addAttribute("records", recordService.getRecords(mode));
        return "demo";
    }
}
