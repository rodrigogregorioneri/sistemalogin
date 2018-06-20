package com.neri.repository;

import com.neri.entities.Film;
import com.neri.entities.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by NeriDev on 17/06/2018.
 */
public interface FilmRepository extends JpaRepository<Film,String> {

    @Query("select f from Film f where f.genero.name = ?1")
    List<Film> filmesDoGenero(String name);


}
