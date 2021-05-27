package com.tchokoapps.springboot.bootingweb.controllers;

import com.tchokoapps.springboot.bootingweb.models.StaffMember;
import com.tchokoapps.springboot.bootingweb.services.StaffJpaService;
import org.apache.catalina.User;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/v1/jpa/staff")
public class StaffJpaRestController {

    private final StaffJpaService staffJpaService;

    public StaffJpaRestController(StaffJpaService staffJpaService) {
        this.staffJpaService = staffJpaService;
    }

    @GetMapping
    public List<StaffMember> getAllStaffMember() {
        return staffJpaService.getStaffAllMembers();
    }

    @PostMapping
    public ResponseEntity<StaffMember> createStaffMember(@RequestBody StaffMember staffMember) {
        StaffMember member = new StaffMember();
        member.setFirstName(staffMember.getFirstName());
        member.setLatsName(staffMember.getLatsName());
        member.setPosition(staffMember.getPosition());
        StaffMember savedMember = staffJpaService.createSaveMember(member);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{employeeId}")
                .buildAndExpand(savedMember.getEmployeeId()).toUri();
        return ResponseEntity.created(location).build();
    }
}
