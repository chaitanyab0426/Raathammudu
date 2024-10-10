package com.raathammudu.milkservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MilkServiceService {
    @Autowired
    private MilkServiceRepository milkServiceRepository;

    public List<MilkService> findAll() {
        return milkServiceRepository.findAll();
    }

    public MilkService save(MilkService service) {
        return milkServiceRepository.save(service);
    }
}
