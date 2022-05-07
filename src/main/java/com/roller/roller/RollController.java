package com.roller.roller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RollController {
    public static Integer randint(int min, int max) {
		return RollerApplication.rand.nextInt(max - min) + min;
	}

    @PostMapping("/roll/{type}")
    public String roll(@PathVariable("type") Integer type) {
        return randint(1, type).toString();
    }
}
