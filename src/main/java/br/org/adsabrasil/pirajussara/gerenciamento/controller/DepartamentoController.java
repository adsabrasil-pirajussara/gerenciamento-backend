package br.org.adsabrasil.pirajussara.gerenciamento.controller;

import br.org.adsabrasil.pirajussara.gerenciamento.model.Departamento;
import br.org.adsabrasil.pirajussara.gerenciamento.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/departamento")
public class DepartamentoController extends AbstractController<Departamento> {

    @Autowired
    public DepartamentoController(DepartamentoService service){
        super(service);
    }
}
