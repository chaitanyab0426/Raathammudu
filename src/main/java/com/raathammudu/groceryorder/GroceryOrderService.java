package com.raathammudu.groceryorder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroceryOrderService {
    @Autowired
    private GroceryOrderRepository groceryOrderRepository;

    public List<GroceryOrder> findAll() {
        return groceryOrderRepository.findAll();
    }

    public GroceryOrder save(GroceryOrder order) {
        return groceryOrderRepository.save(order);
    }
}
