package br.org.adsabrasil.pirajussara.gerenciamento.service.impl;

import br.org.adsabrasil.pirajussara.gerenciamento.model.Departamento;
import br.org.adsabrasil.pirajussara.gerenciamento.repository.DepartamentoRepository;
import br.org.adsabrasil.pirajussara.gerenciamento.service.DepartamentoService;
import org.springframework.stereotype.Service;

@Service("DepartamentoService")
public class DepartamentoServiceImpl extends AbstractServiceImpl<Departamento, DepartamentoRepository> implements DepartamentoService {

    public void removeAll(){
        repository.deleteAll();
    }

}
