package com.tchokoapps.springboot.bootingweb.services;

import com.tchokoapps.springboot.bootingweb.models.Room;
import com.tchokoapps.springboot.bootingweb.repositories.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomJpaService {

    private final RoomRepository roomRepository;

    public RoomJpaService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }
}
