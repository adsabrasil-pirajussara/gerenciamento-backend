package br.org.adsabrasil.pirajussara.gerenciamento.service.impl;

import br.org.adsabrasil.pirajussara.gerenciamento.model.Setor;
import br.org.adsabrasil.pirajussara.gerenciamento.repository.SetorRepository;
import br.org.adsabrasil.pirajussara.gerenciamento.service.SetorService;
import org.springframework.stereotype.Service;

@Service("SetorService")
public class SetorServiceImpl extends AbstractServiceImpl<Setor, SetorRepository> implements SetorService {

    public void removeAll(){
        repository.deleteAll();
    }

}
