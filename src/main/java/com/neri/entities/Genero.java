package com.neri.entities;

import com.neri.model.FilmModel;
import com.neri.model.GeneroModel;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by NeriDev on 13/06/2018.
 */

@Entity
public class Genero {

    @Id
    private String id =UUID.randomUUID().toString().toUpperCase();

    private String name;



    public Genero() {
    }

    public Genero(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public GeneroModel toGeneroModel (){
        GeneroModel genero = new GeneroModel();
        List<FilmModel> film = new ArrayList<>();
        genero.setId(this.getId());
        genero.setName(this.getName());


        genero.setFilmes(film);

        return genero;
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



    public FilmModel toFilmModel(){
        FilmModel film = new FilmModel();
        film.setId(this.getId());


        return film;

    }



    @Override
    public String toString() {
        return "Genero{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
