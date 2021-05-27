package com.tchokoapps.springboot.bootingweb.services;

import com.tchokoapps.springboot.bootingweb.models.StaffMember;
import com.tchokoapps.springboot.bootingweb.repositories.StaffJpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffJpaService {
    final private StaffJpaRepository staffJpaRepository;

    public StaffJpaService(StaffJpaRepository staffJpaRepository) {
        this.staffJpaRepository = staffJpaRepository;
    }

    public List<StaffMember> getStaffAllMembers() {
        return staffJpaRepository.findAll();
    }

    public StaffMember createSaveMember(@NonNull StaffMember staffMember) {
        return staffJpaRepository.saveAndFlush(staffMember);
    }


}
