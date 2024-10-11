package com.RestApiH2Spring.Services;




import com.RestApiH2Spring.Entities.Sensor;
import com.RestApiH2Spring.Repository.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SensorService {
   @Autowired
    private SensorRepository sensorRepository;

    public Sensor createSensor(Sensor sensor) {
        return sensorRepository.save(sensor);
    }

    public List<Sensor> getAllSensors() {
        return sensorRepository.findAll();
    }

    public void deleteSensor(int id) {
        sensorRepository.deleteById(id);
    }

}
