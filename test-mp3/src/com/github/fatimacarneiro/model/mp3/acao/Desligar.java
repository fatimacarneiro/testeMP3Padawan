package com.github.fatimacarneiro.model.mp3.acao;

public class Desligar implements Acao {
    @Override
    public void executar() {
        System.exit(1);
    }
}
