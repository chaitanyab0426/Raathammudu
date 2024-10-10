package com.raathammudu.groceryorder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grocery-order")
public class GroceryOrderController {

    @Autowired
    private GroceryOrderService groceryOrderService;

    @GetMapping("/all")
    public List<GroceryOrder> getAll() {
        return groceryOrderService.findAll();
    }

    @PostMapping("/create")
    public GroceryOrder create(@RequestBody GroceryOrder order) {
        return groceryOrderService.save(order);
    }
}
