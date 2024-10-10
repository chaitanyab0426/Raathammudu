package com.raathammudu.vegetableorder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VegetableOrderService {
    @Autowired
    private VegetableOrderRepository vegetableOrderRepository;

    public List<VegetableOrder> findAll() {
        return vegetableOrderRepository.findAll();
    }

    public VegetableOrder save(VegetableOrder order) {
        return vegetableOrderRepository.save(order);
    }
}
