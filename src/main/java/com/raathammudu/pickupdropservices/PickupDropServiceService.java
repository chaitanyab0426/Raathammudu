package com.raathammudu.pickupdropservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PickupDropServiceService {
    @Autowired
    private PickupDropServiceRepository pickupDropServiceRepository;

    public List<PickupDropService> findAll() {
        return pickupDropServiceRepository.findAll();
    }

    public PickupDropService save(PickupDropService service) {
        return pickupDropServiceRepository.save(service);
    }
}
