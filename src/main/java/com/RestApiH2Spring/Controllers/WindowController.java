package com.RestApiH2Spring.Controllers;

import com.RestApiH2Spring.Entities.Windows;
import com.RestApiH2Spring.Services.WindowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/windows")
public class WindowController {

    @Autowired
    private WindowService windowService;

    // Get all windows
    @GetMapping
    public List<Windows> getAllWindows() {
        return windowService.getAllWindows();
    }

    // Get window by ID
    @GetMapping("/{id}")
    public ResponseEntity<Windows> getWindowById(@PathVariable int id) {
        Optional<Windows> window = windowService.getWindowById(id);
        return window.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Create new window
    @PostMapping
    public Windows createWindow(@RequestBody Windows windows) {
        return windowService.createWindow(windows);
    }

    // Update existing window
    @PutMapping("/{id}")
    public ResponseEntity<Windows> updateWindow(@PathVariable int id, @RequestBody Windows windowsDetails) {
        Windows updatedWindows = windowService.updateWindow(id, windowsDetails);
        if (updatedWindows != null) {
            return ResponseEntity.ok(updatedWindows);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Delete window
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteWindow(@PathVariable int  id) {
        windowService.deleteWindow(id);
        return ResponseEntity.noContent().build();
    }
}
