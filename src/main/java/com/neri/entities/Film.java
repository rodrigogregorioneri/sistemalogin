package com.neri.entities;

import com.neri.model.FilmModel;

import javax.persistence.*;
import java.time.LocalDateTime;

import java.util.List;
import java.util.UUID;


/**
 * Created by NeriDev on 06/06/2018.
 */


@Entity
public class Film {

    @Id
    private String id = UUID.randomUUID().toString().toUpperCase();

    private String nameBR;

    private String nameEN;

    private LocalDateTime year;

    private String synopsis;

    @ManyToOne
    private Genero genero;

    public Film() {
    }

    public Film(String id, String nameBR, String nameEN, LocalDateTime year, String synopsis) {
        this.id = id;
        this.nameBR = nameBR;
        this.nameEN = nameEN;
        this.year = year;
        this.synopsis = synopsis;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameBR() {
        return nameBR;
    }

    public void setNameBR(String nameBR) {
        this.nameBR = nameBR;
    }

    public String getNameEN() {
        return nameEN;
    }

    public void setNameEN(String nameEN) {
        this.nameEN = nameEN;
    }

    public LocalDateTime getYear() {
        return year;
    }

    public void setYear(LocalDateTime year) {
        this.year = year;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public FilmModel toFilmModel() {
        FilmModel film = new FilmModel();
        film.setId(this.getId());
        film.setYear(this.getYear());
        film.setSynopsis(this.getSynopsis());
        film.setGenero(this.getGenero());
        film.setNameBR(this.getNameBR());
        film.setNameEN(this.getNameEN());
        return film;
    }
}
