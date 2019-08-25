package br.org.adsabrasil.pirajussara.gerenciamento.controller;

import br.org.adsabrasil.pirajussara.gerenciamento.model.Cargo;
import br.org.adsabrasil.pirajussara.gerenciamento.service.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cargo")
public class CargoController extends AbstractController<Cargo> {

    @Autowired
    public CargoController(CargoService service){
        super(service);
    }
}
