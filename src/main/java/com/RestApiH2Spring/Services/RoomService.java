package com.RestApiH2Spring.Services;

import com.RestApiH2Spring.Entities.Room;
import com.RestApiH2Spring.Repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomService {

    @Autowired
    private RoomRepository roomRepository;

    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    public Optional<Room> getRoomById(int id) {
        return roomRepository.findById(id);
    }

    public Room createRoom(Room room) {
        return roomRepository.save(room);
    }

    public Room updateRoom(int id, Room roomDetails) {
        Optional<Room> optionalRoom = roomRepository.findById(id);
        if (optionalRoom.isPresent()) {
            Room room = optionalRoom.get();
            room.setName(roomDetails.getName());
            room.setFloor(roomDetails.getFloor());
            return roomRepository.save(room);
        }
        return null;
    }

    public void deleteRoom(int id) {
        roomRepository.deleteById(id);
    }
}
