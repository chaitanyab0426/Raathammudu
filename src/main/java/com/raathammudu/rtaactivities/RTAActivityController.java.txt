package com.raathammudu.rtaactivities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rta-activities")
public class RTAActivityController {

    @Autowired
    private RTAActivityService rtaActivityService;

    @GetMapping("/all")
    public List<RTAActivity> getAll() {
        return rtaActivityService.findAll();
    }

    @PostMapping("/create")
    public RTAActivity create(@RequestBody RTAActivity rtaActivity) {
        return rtaActivityService.save(rtaActivity);
    }
}
