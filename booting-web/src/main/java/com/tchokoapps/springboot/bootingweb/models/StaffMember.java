package com.tchokoapps.springboot.bootingweb.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "EMPLOYEE")
@AllArgsConstructor
@Data
public class StaffMember {
    @Id
    @Column(name = "EMPLOYEE_ID")
    private String employeeId;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String latsName;
    @Column(name = "POSITION")
    @Enumerated(EnumType.STRING)
    private Position position;

    public StaffMember() {
        this.employeeId = UUID.randomUUID().toString();
    }
}
