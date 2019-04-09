package com.github.fatimacarneiro.model;

import java.util.Scanner;

public class Mp3 {

    private Menu menu;

    private Display display;

    public Mp3() {
        this.menu = new Menu();
        this.display = new Display();
    }

    public void liga() {

        try (Scanner sc = new Scanner(System.in)) {
            do {
                display.mostrar(menu);

                int codigoDigitado = sc.nextInt();

                menu.selecionar(codigoDigitado);
            } while (true);
        }
    }
}
