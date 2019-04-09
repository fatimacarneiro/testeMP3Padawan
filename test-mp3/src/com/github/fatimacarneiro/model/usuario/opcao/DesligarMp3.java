package com.github.fatimacarneiro.model.usuario.opcao;

import com.github.fatimacarneiro.model.mp3.acao.Acao;
import com.github.fatimacarneiro.model.mp3.acao.Desligar;

public class DesligarMp3 implements Opcao {

    Acao acao;

    public DesligarMp3() {
        acao = new Desligar();
    }

    @Override
    public void selecionar() {
        acao.executar();
    }

    @Override
    public Integer getCodigo() {
        return 12;
    }

    @Override
    public String getDescricao() {
        return "Desligar";
    }
}
