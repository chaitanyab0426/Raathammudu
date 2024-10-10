package com.raathammudu.vegetableorder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vegetable-order")
public class VegetableOrderController {

    @Autowired
    private VegetableOrderService vegetableOrderService;

    @GetMapping("/all")
    public List<VegetableOrder> getAll() {
        return vegetableOrderService.findAll();
    }

    @PostMapping("/create")
    public VegetableOrder create(@RequestBody VegetableOrder order) {
        return vegetableOrderService.save(order);
    }
}
