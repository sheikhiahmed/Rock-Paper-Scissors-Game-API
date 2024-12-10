package com.sheik.rock_paper_scissors.rockpaperscissors;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin // Allows rest to call same domain.
public class ScoreController {

    // want to write a method that return string now putting @GetMapping i turned it into a rest get
    @GetMapping("/health-check")
    public String getHealthCheck(){
        return "Doing great";
    }
}
