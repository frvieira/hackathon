package org.academiadecodigo.hackstreetboys.controller;

import org.academiadecodigo.hackstreetboys.model.Beach;
import org.academiadecodigo.hackstreetboys.model.Status;
import org.academiadecodigo.hackstreetboys.services.BeachService;
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
        Beach beach3 = new Beach();
        beach3.setId(4);
        beach3.setBeachName("Praia da Cova do Vapor");
        beach3.setLocation("Costa da Caparica");
        beach3.setStatus(Status.EMPTY);
        beachService.save(beach3);
        Beach beach4 = new Beach();
        beach4.setId(5);
        beach4.setBeachName("Praia de São João");
        beach4.setLocation("Costa da Caparica");
        beach4.setStatus(Status.EMPTY);
        beachService.save(beach4);
        Beach beach5 = new Beach();
        beach5.setId(6);
        beach5.setBeachName("Praia do CDS");
        beach5.setLocation("Costa da Caparica");
        beach5.setStatus(Status.EMPTY);
        beachService.save(beach5);
        Beach beach6 = new Beach();
        beach6.setId(7);
        beach6.setBeachName("Praia da Saúde");
        beach6.setLocation("Costa da Caparica");
        beach6.setStatus(Status.HALF_FULL);
        beachService.save(beach6);
        Beach beach7 = new Beach();
        beach7.setId(8);
        beach7.setBeachName("Praia do Castelo");
        beach7.setLocation("Costa da Caparica");
        beach7.setStatus(Status.FULL);
        beachService.save(beach7);
        Beach beach8 = new Beach();
        beach8.setId(9);
        beach8.setBeachName("Praia da Cabana do Pescador");
        beach8.setLocation("Costa da Caparica");
        beach8.setStatus(Status.FULL);
        beachService.save(beach8);
        Beach beach9 = new Beach();
        beach9.setId(10);
        beach9.setBeachName("Praia Morena");
        beach9.setLocation("Costa da Caparica");
        beach9.setStatus(Status.EMPTY);
        beachService.save(beach9);
        Beach beach10 = new Beach();
        beach10.setId(11);
        beach10.setBeachName("Praia da Sereia");
        beach10.setLocation("Costa da Caparica");
        beach10.setStatus(Status.FULL);
        beachService.save(beach10);
        Beach beach11 = new Beach();
        beach11.setId(12);
        beach11.setBeachName("Praia da Nova Vaga");
        beach11.setLocation("Costa da Caparica");
        beach11.setStatus(Status.EMPTY);
        beachService.save(beach11);
        Beach beach12 = new Beach();
        beach12.setId(13);
        beach12.setBeachName("Praia da Fonte da Telha");
        beach12.setLocation("Costa da Caparica");
        beach12.setStatus(Status.FULL);
        beachService.save(beach12);
        Beach beach13 = new Beach();
        beach13.setId(14);
        beach13.setBeachName("Praia da Comporta");
        beach13.setLocation("Alcácer do Sal");
        beach13.setStatus(Status.FULL);
        beachService.save(beach13);
        Beach beach14 = new Beach();
        beach14.setId(15);
        beach14.setBeachName("Praia de Carcavelos");
        beach14.setLocation("Carcavelos");
        beach14.setStatus(Status.FULL);
        beachService.save(beach4);
        Beach beach15 = new Beach();
        beach15.setId(16);
        beach15.setBeachName("Praia de Ribeira d'Ilhas");
        beach15.setLocation("Ericeira");
        beach15.setStatus(Status.EMPTY);
        beachService.save(beach15);
        Beach beach16 = new Beach();
        beach16.setId(17);
        beach16.setBeachName("Praia de São Lourenço");
        beach16.setLocation("Ericeira");
        beach16.setStatus(Status.EMPTY);
        beachService.save(beach16);
        Beach beach17 = new Beach();
        beach17.setId(18);
        beach17.setBeachName("Praia de São Sebastião");
        beach17.setLocation("Ericeira");
        beach17.setStatus(Status.HALF_FULL);
        beachService.save(beach17);
        Beach beach18 = new Beach();
        beach18.setId(19);
        beach18.setBeachName("Praia de São Julião");
        beach18.setLocation("Sintra");
        beach18.setStatus(Status.EMPTY);
        beachService.save(beach18);
    }

    @RequestMapping(method = RequestMethod.GET)
    public String homePage() {
        beachService.deleteAll();
        createBeaches();
        return "index";
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/list"})
    public String listBeach(Model model) {
        model.addAttribute("beachs", beachService.list());
        return "list";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}/details")
    public String showBeach(@PathVariable Integer id, Model model) {
        Beach beach = beachService.get(id);
        model.addAttribute("beach", beach);
        return "beach_detail";
    }
}
