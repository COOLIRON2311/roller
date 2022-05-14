package com.roller.roller;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class RollController {

    @PostMapping("/roll/{dice}")
    public String roll(@PathVariable("dice") Dice dice) {
        return dice.roll().toString();
    }

    @PostMapping(value = "/rolls", consumes = "application/json")
    public String rolls(@RequestBody() Map<Dice, Integer> dice)
    {
        var r = new ArrayList<Integer>();
        for (var i : dice.entrySet()) {
            for (int j = 0; j < i.getValue(); j++) {
                r.add(i.getKey().roll());
            }
        }
        return r.stream().map(Object::toString).collect(Collectors.joining(" + "));
    }
}
