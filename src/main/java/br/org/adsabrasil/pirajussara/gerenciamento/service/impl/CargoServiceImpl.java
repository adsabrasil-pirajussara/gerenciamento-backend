package br.org.adsabrasil.pirajussara.gerenciamento.service.impl;

import br.org.adsabrasil.pirajussara.gerenciamento.model.Cargo;
import br.org.adsabrasil.pirajussara.gerenciamento.repository.CargoRepository;
import br.org.adsabrasil.pirajussara.gerenciamento.service.CargoService;
import org.springframework.stereotype.Service;

@Service("CargoService")
public class CargoServiceImpl extends AbstractServiceImpl<Cargo, CargoRepository> implements CargoService {

    public void removeAll(){
        repository.deleteAll();
    }

}