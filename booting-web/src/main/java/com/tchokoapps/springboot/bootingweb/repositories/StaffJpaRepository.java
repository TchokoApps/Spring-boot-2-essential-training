package com.tchokoapps.springboot.bootingweb.repositories;

import com.tchokoapps.springboot.bootingweb.models.StaffMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffJpaRepository extends JpaRepository<StaffMember, String> {
}
