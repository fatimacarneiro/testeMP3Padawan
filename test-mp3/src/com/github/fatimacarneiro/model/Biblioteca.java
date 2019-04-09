package com.github.fatimacarneiro.model;

import java.util.LinkedHashSet;
import java.util.Set;

public class Biblioteca {

    private static final Set<Musica> MUSICAS = new LinkedHashSet<>();

    public void addMusica(Musica musica) {
        MUSICAS.add(musica);
    }


    public void tocarMusica() {

        MUSICAS.forEach(Musica::tocar
        );
    }
}
