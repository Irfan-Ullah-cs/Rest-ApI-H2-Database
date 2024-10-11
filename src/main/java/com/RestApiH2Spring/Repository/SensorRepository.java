package com.RestApiH2Spring.Repository;

import com.RestApiH2Spring.Entities.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorRepository extends JpaRepository<Sensor, Integer> {
}
