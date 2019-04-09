package com.github.fatimacarneiro.model.usuario.opcao;

@FunctionalInterface
public interface Opcao {

    void selecionar();

    default Integer getCodigo() {
        return 0;
    }

    default String getDescricao() {
        return "Sem descrição";
    }

    default String getRepresentacao() {
        return "[" + getCodigo() + "]" + " - " + getDescricao();
    }
}
