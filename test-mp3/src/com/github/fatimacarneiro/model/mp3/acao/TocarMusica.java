package com.github.fatimacarneiro.model.mp3.acao;

import com.github.fatimacarneiro.model.Biblioteca;
import com.github.fatimacarneiro.model.Musica;

public class TocarMusica implements Acao {
    private Biblioteca biblioteca;

    public TocarMusica() {
        biblioteca = new Biblioteca();
    }

    @Override
    public void executar() {
    biblioteca.tocarMusica();
    }

}
