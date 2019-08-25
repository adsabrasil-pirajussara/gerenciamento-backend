package br.org.adsabrasil.pirajussara.gerenciamento.controller;

import br.org.adsabrasil.pirajussara.gerenciamento.model.Setor;
import br.org.adsabrasil.pirajussara.gerenciamento.service.SetorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/setor")
public class SetorController extends AbstractController<Setor> {

    @Autowired
    public SetorController(SetorService service){
        super(service);
    }
}
