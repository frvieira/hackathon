package org.academiadecodigo.hackstreetboys.controller;

import org.academiadecodigo.hackstreetboys.persistence.model.Beach;
import org.academiadecodigo.hackstreetboys.persistence.model.Status;
import org.academiadecodigo.hackstreetboys.services.BeachService;
import org.academiadecodigo.hackstreetboys.services.BeachServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/beach")
public class BeachController {

    private BeachService beachService;

    @Autowired
    public void setBeachService(BeachService beachService) {
        this.beachService = beachService;
    }

    public void createBeaches() {
        Beach beach = new Beach();
        beach.setId(1);
        beach.setBeachName("Praia da Rainha");
        beach.setLocation("Costa da Caparica");
        beach.setStatus(Status.EMPTY);
        beachService.save(beach);
        Beach beach1 = new Beach();
        beach1.setId(2);
        beach1.setBeachName("Praia do Rei");
        beach1.setLocation("Costa da Caparica");
        beach1.setStatus(Status.FULL);
        beachService.save(beach1);
        Beach beach2 = new Beach();
        beach2.setId(3);
        beach2.setBeachName("Praia do Pescador");
        beach2.setLocation("Costa da Caparica");
        beach2.setStatus(Status.HALF_FULL);
        beachService.save(beach2);
    }

    @RequestMapping(method = RequestMethod.GET, path = {"list", "/", ""})
    public String listBeach(Model model) {
        createBeaches();
        for(Beach beach : beachService.list()) {
            System.out.println(beach.getBeachName());
        }
        model.addAttribute("beachs", beachService.list());
        return "list";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/add")
    public String addBeach(Model model) {
        model.addAttribute("beach", new Beach());
        return "/add";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}/edit")
    public String editBeach(@PathVariable Integer id, Model model) {
        model.addAttribute("beach", beachService.get(id));
        return "/add";
    }

    @RequestMapping(method = RequestMethod.POST, path = {"/", ""}, params = "action=save")
    public String saveBeach(@Valid @ModelAttribute("beach") Beach beach, BindingResult bindingResult, RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors()) {
            return "/add";
        }

        Beach savedBeach = beachService.save(beach);
        redirectAttributes.addFlashAttribute("lastAction", "Saved " + savedBeach.getBeachName() + " " + savedBeach.getId());
        return "redirect:list" + savedBeach.getId();
    }
}
