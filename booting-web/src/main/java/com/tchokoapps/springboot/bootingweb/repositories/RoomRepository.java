package com.tchokoapps.springboot.bootingweb.repositories;

import com.tchokoapps.springboot.bootingweb.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {

}
