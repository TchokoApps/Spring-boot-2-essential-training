package com.tchokoapps.springboot.bootingweb.controllers;

import com.tchokoapps.springboot.bootingweb.models.StaffMember;
import com.tchokoapps.springboot.bootingweb.services.StaffService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/staff")
public class StaffRestController {
    private StaffService staffService;

    public StaffRestController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping
    public List<StaffMember> getAllStaffMember() {
        return staffService.getStaffAllMembers();
    }
}
