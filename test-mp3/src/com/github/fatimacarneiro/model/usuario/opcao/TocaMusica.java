package com.github.fatimacarneiro.model.usuario.opcao;

import com.github.fatimacarneiro.model.mp3.acao.Acao;
import com.github.fatimacarneiro.model.mp3.acao.TocarMusica;

public class TocaMusica implements Opcao {

    private Acao acao;

    public TocaMusica() {
        this.acao = new TocarMusica();
    }

    @Override
    public void selecionar() {
        acao.executar();
    }

    @Override
    public Integer getCodigo() {
        return 2;
    }

    @Override
    public String getDescricao() {
        return "Tocar Musica";
    }
}

