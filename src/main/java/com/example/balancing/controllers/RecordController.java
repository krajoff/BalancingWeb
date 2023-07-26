package com.example.balancing.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.balancing.services.*;
import com.example.balancing.models.Record;

@Controller
@RequiredArgsConstructor
public class RecordController {
    private final RecordService recordService;
    @GetMapping("/")
    public String records(@RequestParam(name = "mode", required = false)
                              String mode, Model model) {
        model.addAttribute("records", recordService.getRecords(mode));
        return "records";
    }

    @GetMapping("/records/{id}")
    public String recordsInfo(@PathVariable Integer id, Model model) {
        model.addAttribute("record", recordService.getRecordById(id));
        return "record-info";
    }

    @PostMapping("/record/create")
    public String createRecord(Record record) {
        recordService.saveRecord(record);
        return "redirect:/";
    }

    @PostMapping("/record/delete/{id}")
    public String deleteRecord(@PathVariable Integer id) {
        recordService.deleteRecord(id);
        return "redirect:/";
    }

    @PostMapping("/record/edit/{id}")
    public String editRecord(@PathVariable Integer id, Model model) {
        model.addAttribute("record", recordService.getRecordById(id));
        model.addAttribute("records", recordService.getRecords(null));
        return "redirect:/";
    }

}
