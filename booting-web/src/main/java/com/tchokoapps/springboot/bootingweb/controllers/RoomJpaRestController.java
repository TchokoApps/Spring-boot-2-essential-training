package com.tchokoapps.springboot.bootingweb.controllers;

import com.tchokoapps.springboot.bootingweb.models.Room;
import com.tchokoapps.springboot.bootingweb.services.RoomJpaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/jpa/rooms")
public class RoomJpaRestController {

    private final RoomJpaService roomJpaService;

    public RoomJpaRestController(RoomJpaService roomJpaService) {
        this.roomJpaService = roomJpaService;
    }

    @GetMapping
    public List<Room> getAllRooms() {
        return roomJpaService.getAllRooms();
    }
}
