package com.raathammudu.rtaactivities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RTAActivityService {
    @Autowired
    private RTAActivityRepository rtaActivityRepository;

    public List<RTAActivity> findAll() {
        return rtaActivityRepository.findAll();
    }

    public RTAActivity save(RTAActivity rtaActivity) {
        return rtaActivityRepository.save(rtaActivity);
    }
}
