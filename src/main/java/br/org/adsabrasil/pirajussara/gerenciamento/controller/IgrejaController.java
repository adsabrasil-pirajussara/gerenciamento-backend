package br.org.adsabrasil.pirajussara.gerenciamento.controller;

import br.org.adsabrasil.pirajussara.gerenciamento.model.Igreja;
import br.org.adsabrasil.pirajussara.gerenciamento.service.AbstractService;
import br.org.adsabrasil.pirajussara.gerenciamento.service.IgrejaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/igreja")
public class IgrejaController extends AbstractController<Igreja> {

    @Autowired
    public IgrejaController(IgrejaService service) {
        super(service);
    }
}