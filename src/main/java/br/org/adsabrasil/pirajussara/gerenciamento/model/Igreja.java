package br.org.adsabrasil.pirajussara.gerenciamento.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "igreja")
public class Igreja {

    @Id
    private String id;

    private String nome;

    private String endereco;

    public Igreja() {
    }

    public Igreja(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String toString(){
        return "Igreja : {Nome:" + this.nome + ", endereço:" + this.endereco + "}";
    }
}