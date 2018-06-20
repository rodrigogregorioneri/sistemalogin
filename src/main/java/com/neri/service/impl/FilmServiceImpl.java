package com.neri.service.impl;

import com.neri.entities.Film;
import com.neri.entities.Genero;
import com.neri.repository.FilmRepository;
import com.neri.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by NeriDev on 18/06/2018.
 */

@Service
public class FilmServiceImpl implements FilmService {

    @Autowired
    private FilmRepository generoRepository;

    @Override
    public List<Film> generoDoFilme(String nome) {
        return generoRepository.filmesDoGenero(nome);
    }
}
