package br.org.adsabrasil.pirajussara.gerenciamento.service.impl;

import br.org.adsabrasil.pirajussara.gerenciamento.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public abstract class AbstractServiceImpl<T, R extends CrudRepository> implements AbstractService<T> {

    @Autowired
    R repository;

    public List<T> listarAll(){
        return (List<T>) repository.findAll();
    }

    public T findOne(String id){
        return (T) repository.findById(id);
    }

    public void cadastrar(T entidade){
        repository.save(entidade);
    }

    public T update(T entidade){
        return (T) repository.save(entidade);
    }

    public void delete(String id){
        repository.deleteById(id);
    }
}
