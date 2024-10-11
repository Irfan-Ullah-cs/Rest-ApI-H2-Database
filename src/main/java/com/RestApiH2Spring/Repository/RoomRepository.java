package com.RestApiH2Spring.Repository;

import com.RestApiH2Spring.Entities.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Integer> {
}
