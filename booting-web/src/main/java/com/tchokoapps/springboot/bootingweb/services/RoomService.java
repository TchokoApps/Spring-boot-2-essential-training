package com.tchokoapps.springboot.bootingweb.services;

import com.tchokoapps.springboot.bootingweb.models.Room;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomService {

    private static final List<Room> rooms = new ArrayList<>();

    static {
        for (int i = 0; i < 10; i++) {
            rooms.add(new Room(Long.getLong(String.valueOf(i)), "Room " + i, "R" + i, "Room Info" + i));
        }
    }

    public List<Room> getAllRooms() {
        return rooms;
    }
}
