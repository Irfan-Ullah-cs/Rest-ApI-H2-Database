package com.RestApiH2Spring.Repository;

import com.RestApiH2Spring.Entities.Windows;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WindowRepository extends JpaRepository<Windows, Integer> {
}
