package br.org.adsabrasil.pirajussara.gerenciamento.controller;

import br.org.adsabrasil.pirajussara.gerenciamento.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public abstract class AbstractController<T> {

    @Autowired
    AbstractService service;

    public AbstractController(AbstractService service) {
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<T> buscarTodos(){
        return service.listarAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public String cadastrar(@RequestBody T entidade){

        try {
            service.cadastrar(entidade);
        }catch(Exception e){
            return "Ocorreu um erro ao cadastrar. [ " + e.getMessage() + " ]";
        }

        return "Cadastrado com sucesso.";
    }

    @RequestMapping(method = RequestMethod.PUT)
    public String atualizar(@RequestBody T entidade){

        try {
            service.update(entidade);
        }catch(Exception e){
            return "Ocorreu um erro ao atualizar. [ " + e.getMessage() + " ]";
        }

        return "Atualização realizada com sucesso.";
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public String deletar(@PathVariable String id){

        try{
            service.delete(id);
        }catch(Exception e){
            return "Ocorreu um erro ao excluir. [ " + e.getMessage() + " ]";
        }

        return "Exclusão realizada com sucesso!";
    }
}