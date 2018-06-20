package com.neri.model;

import com.neri.entities.Genero;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

/**
 * Created by NeriDev on 18/06/2018.
 */
public class FilmModel {
    private String id;

    private String nameBR;

    private String nameEN;

    private LocalDateTime year;

    private String synopsis;

    private Genero genero;



    public FilmModel() {
    }

    public FilmModel(String id, String nameBR, String nameEN, LocalDateTime year, String synopsis) {
        this.id = id;
        this.nameBR = nameBR;
        this.nameEN = nameEN;
        this.year = year;
        this.synopsis = synopsis;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
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

    @Override
    public String toString() {
        return "FilmModel{" +
                "id='" + id + '\'' +
                ", nameBR='" + nameBR + '\'' +
                ", nameEN='" + nameEN + '\'' +
                ", year=" + year +
                ", synopsis='" + synopsis + '\'' +
                '}';
    }
}

