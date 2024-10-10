package com.raathammudu.pickleorder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PickleOrderService {
    @Autowired
    private PickleOrderRepository pickleOrderRepository;

    public List<PickleOrder> findAll() {
        return pickleOrderRepository.findAll();
    }

    public PickleOrder save(PickleOrder order) {
        return pickleOrderRepository.save(order);
    }
}
