package com.github.fatimacarneiro.model.usuario.opcao;

import com.github.fatimacarneiro.model.mp3.acao.Acao;
import com.github.fatimacarneiro.model.mp3.acao.CadastrarMusica;

public class CadastroMusica implements Opcao {

    private Acao acao;

    public CadastroMusica() {
        this.acao = new CadastrarMusica();
    }

    @Override
    public void selecionar() {
        acao.executar();
    }

    @Override
    public Integer getCodigo() {
        return 1;
    }

    @Override
    public String getDescricao() {
        return "Cadastrar música";
    }
}
