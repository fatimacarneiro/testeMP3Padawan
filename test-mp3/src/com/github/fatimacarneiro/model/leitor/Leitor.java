package com.github.fatimacarneiro.model.leitor;

import java.util.regex.Pattern;

public interface Leitor<T> {

    default T ler() {
        return ler(null);
    }

    T ler(Pattern pattern);
}
