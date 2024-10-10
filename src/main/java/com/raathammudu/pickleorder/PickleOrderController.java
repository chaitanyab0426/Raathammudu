package com.raathammudu.pickleorder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pickle-order")
public class PickleOrderController {

    @Autowired
    private PickleOrderService pickleOrderService;

    @GetMapping("/all")
    public List<PickleOrder> getAll() {
        return pickleOrderService.findAll();
    }

    @PostMapping("/create")
    public PickleOrder create(@RequestBody PickleOrder order) {
        return pickleOrderService.save(order);
    }
}
