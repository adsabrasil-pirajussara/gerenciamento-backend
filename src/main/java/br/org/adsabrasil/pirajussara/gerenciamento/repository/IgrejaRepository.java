package br.org.adsabrasil.pirajussara.gerenciamento.repository;

import br.org.adsabrasil.pirajussara.gerenciamento.model.Igreja;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface IgrejaRepository extends CrudRepository<Igreja, String> {
}
