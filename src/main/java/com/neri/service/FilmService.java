package com.neri.service;

import com.neri.entities.Film;
import com.neri.entities.Genero;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by NeriDev on 18/06/2018.
 */

@Service
public interface FilmService {

    List<Film> generoDoFilme(String name);
}
