package br.org.adsabrasil.pirajussara.gerenciamento.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "setor")
public class Setor {

    @Id
    private String id;

    private String nome;

    public Setor() {
    }

    public Setor(String nome) {
        this.nome = nome;
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

    @Override
    public String toString() {
        return "Setor{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}