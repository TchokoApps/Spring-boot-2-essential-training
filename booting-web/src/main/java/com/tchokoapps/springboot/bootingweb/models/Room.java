package com.tchokoapps.springboot.bootingweb.models;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Room {
    private Long id;
    private String number;
    private String name;
    private String info;
}
