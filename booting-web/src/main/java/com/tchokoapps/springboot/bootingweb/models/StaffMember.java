package com.tchokoapps.springboot.bootingweb.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StaffMember {
    private Long id;
    private String personalNumber;
    private String firstName;
    private String latsName;
    private Position position;
}
