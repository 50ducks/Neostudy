package com.neoflex.application;

import com.neoflex.math.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/math/addition")
    public float addition (@RequestParam(value = "varA", defaultValue = "0") float varA,
                             @RequestParam(value = "varB", defaultValue = "0") float varB) {
        return Addition.add(varA, varB);
    }
    @GetMapping("/math/subtraction")
    public float subtraction (@RequestParam(value = "varA", defaultValue = "0") float varA,
                             @RequestParam(value = "varB", defaultValue = "0") float varB) {
        return Subtraction.sub(varA, varB);
    }
    @GetMapping("/math/multiplication")
    public float multiplication (@RequestParam(value = "varA", defaultValue = "0") float varA,
                             @RequestParam(value = "varB", defaultValue = "0") float varB) {
        return Multiplication.multiple(varA, varB);
    }
    @GetMapping("/math/division")
    public float division (@RequestParam(value = "varA", defaultValue = "0") float varA,
                             @RequestParam(value = "varB", defaultValue = "0") float varB) {
        return Division.div(varA, varB);
    }
}
