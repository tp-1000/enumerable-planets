package org.launchcode.enumerableplanets.controllers;

import org.launchcode.enumerableplanets.models.Planets;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlanetController {

    @GetMapping
    public String displayIndex(Model model, Planets planets) {
        model.addAttribute("planets", planets.values());

        return "index";
    }
}
