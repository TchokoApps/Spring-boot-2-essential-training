package com.tchokoapps.springboot.bootingweb.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "ROOM")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Room {
    @Id
    @Column(name = "ROOM_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "ROOM_NUMBER")
    private String number;
    @Column(name = "NAME")
    private String name;
    @Column(name = "BED_INFO")
    private String info;
}
