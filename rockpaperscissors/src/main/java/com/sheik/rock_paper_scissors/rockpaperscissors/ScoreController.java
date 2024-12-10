package com.sheik.rock_paper_scissors.rockpaperscissors;

import org.springframework.web.bind.annotation.*;


// CrossOrigin, RestController, PatchMapping, GetMapping, PutMapping, DeleteMapping, PathVariable, RequestBody, RequestParam
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

    // return specifies attribute as requested
    @GetMapping("/score/{wlt}")
    public int getWinsLoosesOrTies(@PathVariable String wlt){
        if(wlt.equalsIgnoreCase("wins")){
            return score.wins;
        } else if (wlt.equalsIgnoreCase("looses")) {
            return score.looses;
        }
            return score.ties;
    }

    //curl -X POST "http://localhost:8080/score/wins"
    // post method to increase the wins attributes.
    @PostMapping("/score/wins")
    public Score increaseWins(){
        score.wins++;
        return score;
    }




    // put replace the complete data
    // patch replace on property
    // post





}
