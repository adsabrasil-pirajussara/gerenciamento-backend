package br.org.adsabrasil.pirajussara.gerenciamento.repository;

import br.org.adsabrasil.pirajussara.gerenciamento.model.Cargo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface CargoRepository extends CrudRepository<Cargo, String> {
}
