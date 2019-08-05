package br.org.adsabrasil.pirajussara.gerenciamento.service;

import java.util.List;

public interface AbstractService<T> {

    public List<T> listarAll();

    public T findOne(String id);

    public void cadastrar(T entidade);

    public T update(T entidade);

    public void delete(String id);
}
