package com.raathammudu.cleaningteam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cleaning-team")
public class CleaningTeamController {

    @Autowired
    private CleaningTeamService cleaningTeamService;

    @GetMapping("/all")
    public List<CleaningTeam> getAll() {
        return cleaningTeamService.findAll();
    }

    @PostMapping("/create")
    public CleaningTeam create(@RequestBody CleaningTeam cleaningTeam) {
        return cleaningTeamService.save(cleaningTeam);
    }
}
