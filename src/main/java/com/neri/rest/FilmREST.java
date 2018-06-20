package com.neri.rest;

import com.neri.entities.Film;
import com.neri.entities.Genero;
import com.neri.service.impl.FilmServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * Created by NeriDev on 18/06/2018.e
 */

@RestController
public class FilmREST {

    @Autowired
    private FilmServiceImpl service;


    @GetMapping("/filmByGenero")
    public List<Film> generoDoFilme(@RequestParam(name="name") String name){
        return service.generoDoFilme(name);

    }

}
