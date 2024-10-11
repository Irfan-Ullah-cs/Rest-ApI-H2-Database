package com.RestApiH2Spring.Controllers;



import com.RestApiH2Spring.Entities.Sensor;
import com.RestApiH2Spring.Services.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sensor")
public class SensorController {

    @Autowired  // Autowiring the SensorServic

    private SensorService sensorService;

    @PostMapping
    public ResponseEntity<Sensor> createSensor(@RequestBody Sensor sensor) {
        Sensor createdSensor = sensorService.createSensor(sensor);
        return new ResponseEntity<>(createdSensor, HttpStatus.CREATED);
    }

    @GetMapping
    public List<Sensor> getAllSensor() {
        return sensorService.getAllSensors();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSensor(@PathVariable Long id) {
        sensorService.deleteSensor(id.intValue());
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
