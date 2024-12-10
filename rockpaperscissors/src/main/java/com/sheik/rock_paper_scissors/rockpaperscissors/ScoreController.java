package com.sheik.rock_paper_scissors.rockpaperscissors;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin // Allows rest to call same domain.
public class ScoreController {
    static Score score = new Score(30,20,10);

    // want to write a method that return string now putting @GetMapping i turned it into a rest get
    @GetMapping("/health-check")
    public String getHealthCheck(){
        return "Doing great";
    }
    // return object to the client when they ask for it. it returns as JSON object.
    @GetMapping("/score")
    public Score getScore(){
        return score;
    }
    @GetMapping("/score/wins")
    public int getWins(){
        return score.wins;
    }
    @GetMapping("/score/looses")
    public int getLoose(){
        return score.looses;
    }
    @GetMapping("/score/ties")
    public int getTiles(){
        return score.ties;
    }


}
