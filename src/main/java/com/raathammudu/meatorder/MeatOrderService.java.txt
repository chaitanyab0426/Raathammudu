package com.raathammudu.meatorder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeatOrderService {
    @Autowired
    private MeatOrderRepository meatOrderRepository;

    public List<MeatOrder> findAll() {
        return meatOrderRepository.findAll();
    }

    public MeatOrder save(MeatOrder order) {
        return meatOrderRepository.save(order);
    }
}
