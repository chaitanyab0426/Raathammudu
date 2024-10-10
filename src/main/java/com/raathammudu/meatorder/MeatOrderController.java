package com.raathammudu.meatorder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/meat-order")
public class MeatOrderController {

    @Autowired
    private MeatOrderService meatOrderService;

    @GetMapping("/all")
    public List<MeatOrder> getAll() {
        return meatOrderService.findAll();
    }

    @PostMapping("/create")
    public MeatOrder create(@RequestBody MeatOrder order) {
        return meatOrderService.save(order);
    }
}
