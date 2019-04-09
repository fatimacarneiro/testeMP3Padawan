package com.github.fatimacarneiro.model;

import java.time.LocalTime;

public class Musica {

    private final String artista;
    private final String nome;
    private final LocalTime duracao;

    public Musica(String nome, String artista, LocalTime duracao) {
        this.nome = nome;
        this.artista = artista;
        this.duracao = duracao;
    }

    public String getArtista() {
        return artista;
    }

    public String getNome() {
        return nome;
    }

    public LocalTime getDuracao() {
        return duracao;
    }

    public void tocar() {
        try {
            System.out.println("tocando " + getNome());
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
