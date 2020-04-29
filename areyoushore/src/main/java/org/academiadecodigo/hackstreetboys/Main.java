package org.academiadecodigo.hackstreetboys;

import org.academiadecodigo.hackstreetboys.persistence.model.Beach;
import org.academiadecodigo.hackstreetboys.persistence.model.Status;
import org.academiadecodigo.hackstreetboys.services.BeachService;
import org.academiadecodigo.hackstreetboys.services.BeachServiceImpl;
import org.academiadecodigo.hackstreetboys.services.mock.MockBeachService;

public class Main {

    public static void main(String[] args) {
        BeachService beachService = new MockBeachService();

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


        for(Beach bch : beachService.list()) {
            System.out.println(bch.getBeachName());
        }

        Beach bch26 = beachService.get(1);
        System.out.println(bch26.getId() + bch26.getBeachName() + bch26.getLocation());
    }
}
