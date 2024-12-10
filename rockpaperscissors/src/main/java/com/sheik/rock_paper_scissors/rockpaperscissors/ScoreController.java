package com.sheik.rock_paper_scissors.rockpaperscissors;

import org.springframework.web.bind.annotation.*;


// CrossOrigin, RestController,PostMapping(PathVariable) PatchMapping(requestParam), GetMapping(path variable), PutMapping(requestBody), DeleteMapping, PathVariable, RequestBody, RequestParam
@RestController
@CrossOrigin // Allows REST calls from a different domain
public class ScoreController {
    static Score score = new Score(30, 20, 10);

    @GetMapping("/health-check")
    public String getHealthCheck() {
        return "Doing great";
    }

    @GetMapping("/score")
    public Score getScore() {
        return score;
    }

    @GetMapping("/score/{wlt}")
    public int getWinsLossesOrTies(@PathVariable String wlt) {
        switch (wlt.toLowerCase()) {
            case "wins":
                return score.getWins();
            case "losses":  // Corrected from looses
                return score.getLosses();
            case "ties":
                return score.getTies();
            default:
                throw new IllegalArgumentException("Invalid argument: " + wlt);
        }
    }

    @PostMapping("/score/{arg}")
    public Score increaseValueByOne(@PathVariable String arg) {
        switch (arg.toLowerCase()) {
            case "wins":
                score.setWins(score.getWins() + 1);
                break;
            case "ties":
                score.setTies(score.getTies() + 1);
                break;
            case "losses":  // Corrected from looses
                score.setLosses(score.getLosses() + 1);
                break;
            default:
                throw new IllegalArgumentException("Invalid argument: " + arg);
        }
        return score;
    }

    @PatchMapping("/score/wins")
    public Score updateWins(@RequestParam(name = "new-value") int newValue) {
        score.setWins(newValue);
        return score;
    }

    @PutMapping("/score")
    public Score newScore(@RequestBody Score newScore) {
        score = newScore;
        return score;
    }

    @DeleteMapping("/score")
    public void deleteScore() {
        score = null;
    }
}

