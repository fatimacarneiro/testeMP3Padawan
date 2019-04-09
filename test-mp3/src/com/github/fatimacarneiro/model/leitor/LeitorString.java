package com.github.fatimacarneiro.model.leitor;

import java.util.Scanner;
import java.util.regex.Pattern;

public class LeitorString implements Leitor<String> {

    @Override
    public String ler(Pattern pattern) {
        try (Scanner scanner = new Scanner(System.in)) {
            if (pattern == null) {
                return scanner.next();
            }
            return scanner.next(pattern);
        }
    }
}
