package com.github.fatimacarneiro.model;

import com.github.fatimacarneiro.model.usuario.opcao.CadastroMusica;
import com.github.fatimacarneiro.model.usuario.opcao.DesligarMp3;
import com.github.fatimacarneiro.model.usuario.opcao.Opcao;
import com.github.fatimacarneiro.model.usuario.opcao.TocaMusica;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;

public class Menu {

    private List<Opcao> opcoes;

    public Menu() {
        this.opcoes = new ArrayList<>();
        this.opcoes.add(new CadastroMusica());
        this.opcoes.add(new DesligarMp3());
        this.opcoes.add(new TocaMusica());

    }

    public void selecionar(Integer codigo) {
        Opcao opcaoSelecionada = opcoes.stream()
                .filter(opcao -> opcao.getCodigo().equals(codigo))
                .findFirst()
                .orElseThrow(() -> new InputMismatchException("Não existe opção com este código."));

        opcaoSelecionada.selecionar();
    }

    @Override
    public String toString() {
        StringBuilder representacaoMenu = new StringBuilder();

        opcoes.stream()
                .sorted(Comparator.comparingInt(Opcao::getCodigo))
                .forEach(opcao -> {
                    representacaoMenu.append(opcao.getRepresentacao());
                    representacaoMenu.append(System.lineSeparator());
                });

        return representacaoMenu.toString();
    }
}
