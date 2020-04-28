package org.academiadecodigo.hackstreetboys.controller;

import org.academiadecodigo.hackstreetboys.services.BeachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/beach")
public class BeachController {

    private BeachService beachService;

    @Autowired
    public void setBeachService(BeachService beachService) {
        this.beachService = beachService;
    }

    @RequestMapping(method = RequestMethod.GET, path = {"list", "/", ""})
    public String listBeach(Model model) {
        model.addAttribute("beach", beachService.list());
        return "beach/list";
    }
}
