package com.neri.model;

import com.neri.entities.Film;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;
import java.util.List;
import java.util.UUID;

/**
 * Created by NeriDev on 18/06/2018.
 */
public class GeneroModel {

    private String id;

    private String name;

    private List<FilmModel> filmes;


    public GeneroModel() {
    }

    public GeneroModel(String id, String name, List<FilmModel> filmes) {
        this.id = id;
        this.name = name;
        this.filmes = filmes;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<FilmModel> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<FilmModel> filmes) {
        this.filmes = filmes;
    }
}
