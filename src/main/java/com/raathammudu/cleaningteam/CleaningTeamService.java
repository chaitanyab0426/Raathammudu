package com.raathammudu.cleaningteam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CleaningTeamService {
    @Autowired
    private CleaningTeamRepository cleaningTeamRepository;

    public List<CleaningTeam> findAll() {
        return cleaningTeamRepository.findAll();
    }

    public CleaningTeam save(CleaningTeam cleaningTeam) {
        return cleaningTeamRepository.save(cleaningTeam);
    }
}
