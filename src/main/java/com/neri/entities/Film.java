package com.neri.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Created by NeriDev on 06/06/2018.
 */

@Data
@Entity
public class Film {

    private @Id
    String id = UUID.randomUUID().toString().toUpperCase();

    private String nameBR;

    private String nameEN;

    private LocalDateTime year;

    private String synopsis;





}
