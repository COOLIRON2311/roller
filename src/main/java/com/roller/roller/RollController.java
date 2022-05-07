package com.roller.roller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RollController {

    @PostMapping("/roll/{dice}")
    public String roll(@PathVariable("dice") Dice dice) {
        return dice.roll().toString();
    }
}
