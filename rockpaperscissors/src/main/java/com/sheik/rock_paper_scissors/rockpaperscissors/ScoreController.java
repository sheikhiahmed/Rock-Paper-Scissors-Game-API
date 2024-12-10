package com.sheik.rock_paper_scissors.rockpaperscissors;

import org.springframework.web.bind.annotation.*;


// CrossOrigin, RestController,PostMapping(PathVariable) PatchMapping(requestParam), GetMapping(path variable), PutMapping(requestBody), DeleteMapping, PathVariable, RequestBody, RequestParam
@RestController
@CrossOrigin // Allows rest to call same domain.
public class ScoreController {
    static Score score = new Score(30,20,10);

    // wrote a method that returns a string. After that by using @GetMapping annotation i turned it into get Rest API
    @GetMapping("/health-check")
    public String getHealthCheck(){
        return "Doing great";
    }
    // return object to the client when they ask for it. it returns as JSON object.
    @GetMapping("/score")
    public Score getScore(){
        return score;
    }

    // return specifies attribute data as requested.
    @GetMapping("/score/{wlt}")
    public int getWinsLoosesOrTies(@PathVariable String wlt){
        if(wlt.equalsIgnoreCase("wins")){
            return score.wins;
        } else if (wlt.equalsIgnoreCase("looses")) {
            return score.losses;
        }
            return score.ties;
    }

    //curl -X POST "http://localhost:8080/score/wins"
    // post method to increase the specific attribute values.

@PostMapping("/score/{arg}")
  public Score increaseValueByOne(@PathVariable String arg){
        String values = arg.toLowerCase();
        switch (values){
            case "wins":
                score.wins++;
                break;
            case "ties":
                score.ties++;
                break;
            case "losses":
                score.losses++;
                break;
            default:
                throw new IllegalArgumentException("Invalid argument: " + arg);
        }
        return score;
  }

// want to number a value wins?new-value=55. use patch operation. implementing query parameter'
    //localhost:8080/score/wins?new-value=80
    @PatchMapping("/score/wins")
    public Score updateWins(@RequestParam(name="new-value") int newValue){
        score.wins = newValue;
        return score;
    }

    // put -> Body -> raw -> JSON // it send json object which get transfer into java object with the help of @Request Body parameter.
    @PutMapping("/score")
    public Score newScore(@RequestBody Score newScore){
        score = newScore;
        return score;
    }


    // put replace the complete data
    // patch replace on property
    // post





}
