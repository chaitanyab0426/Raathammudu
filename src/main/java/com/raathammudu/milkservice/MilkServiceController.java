package com.raathammudu.milkservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/milk-service")
public class MilkServiceController {

    @Autowired
    private MilkServiceService milkServiceService;

    @GetMapping("/all")
    public List<MilkService> getAll() {
        return milkServiceService.findAll();
    }

    @PostMapping("/create")
    public MilkService create(@RequestBody MilkService service) {
        return milkServiceService.save(service);
    }
}
