package br.org.adsabrasil.pirajussara.gerenciamento.service.impl;

import br.org.adsabrasil.pirajussara.gerenciamento.model.Igreja;
import br.org.adsabrasil.pirajussara.gerenciamento.repository.IgrejaRepository;
import br.org.adsabrasil.pirajussara.gerenciamento.service.IgrejaService;
import org.springframework.stereotype.Service;

@Service("IgrejaService")
public class IgrejaServiceImpl extends AbstractServiceImpl<Igreja, IgrejaRepository> implements IgrejaService {

    public void removeAll(){
        repository.deleteAll();
    }

}
