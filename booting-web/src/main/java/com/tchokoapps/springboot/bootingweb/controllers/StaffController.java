package com.tchokoapps.springboot.bootingweb.controllers;

import com.tchokoapps.springboot.bootingweb.services.StaffService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/staff")
public class StaffController {

    private StaffService staffService;

    public StaffController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping
    public String getAllStaffMembers(Model model) {
        model.addAttribute("staff", staffService.getStaffAllMembers());
        return "staff";
    }
}
