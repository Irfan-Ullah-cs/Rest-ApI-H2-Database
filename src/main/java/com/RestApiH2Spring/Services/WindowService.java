package com.RestApiH2Spring.Services;

import com.RestApiH2Spring.Entities.Windows;
import com.RestApiH2Spring.Repository.WindowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WindowService {

    @Autowired
    private WindowRepository windowRepository;

    public List<Windows> getAllWindows() {
        return windowRepository.findAll();
    }

    public Optional<Windows> getWindowById(int id) {
        return windowRepository.findById(id);
    }

    public Windows createWindow(Windows windows) {
        return windowRepository.save(windows);
    }

    public Windows updateWindow(int id, Windows windowsDetails) {
        Optional<Windows> optionalWindow = windowRepository.findById(id);
        if (optionalWindow.isPresent()) {
            Windows windows = optionalWindow.get();
            windows.setName(windowsDetails.getName());
            windows.setOpen(windowsDetails.isOpen());
            return windowRepository.save(windows);
        }
        return null;
    }

    public void deleteWindow(int id) {
        windowRepository.deleteById(id);
    }
}
