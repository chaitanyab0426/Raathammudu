package com.raathammudu.pickupdropservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pickup-drop-service")
public class PickupDropServiceController {

    @Autowired
    private PickupDropServiceService pickupDropServiceService;

    @GetMapping("/all")
    public List<PickupDropService> getAll() {
        return pickupDropServiceService.findAll();
    }

    @PostMapping("/create")
    public PickupDropService create(@RequestBody PickupDropService service) {
        return pickupDropServiceService.save(service);
    }
}
