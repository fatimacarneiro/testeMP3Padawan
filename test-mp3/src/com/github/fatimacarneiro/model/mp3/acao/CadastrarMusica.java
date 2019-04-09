package com.github.fatimacarneiro.model.mp3.acao;

import com.github.fatimacarneiro.model.Biblioteca;
import com.github.fatimacarneiro.model.Musica;
import com.github.fatimacarneiro.model.leitor.Leitor;
import com.github.fatimacarneiro.model.leitor.LeitorString;

import java.time.LocalTime;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CadastrarMusica implements Acao {

    private Biblioteca biblioteca;

    private Leitor<String> leitor;

    public CadastrarMusica() {
        biblioteca = new Biblioteca();
        leitor = new LeitorString();
    }

    @Override
    public void executar() {
        System.out.println("Digite o nome da música que deseja cadastrar");
        Scanner scanner = new Scanner(System.in);
        String nomeMusica = scanner.next();

        System.out.println("Digite o artista desta música");
        String artistaMusica = scanner.next();

        System.out.println("Digite a duração desta música no padrão MM:SS");
        String duracaoMusicaDigitado = scanner.next();
        String[] minutosSegundos = duracaoMusicaDigitado.split(":");

        int minutos = Integer.parseInt(minutosSegundos[0]);

        int segundos = Integer.parseInt(minutosSegundos[1]);

        LocalTime duracaoMusica = LocalTime.of(0, minutos, segundos);

        Musica musica = new Musica(nomeMusica, artistaMusica, duracaoMusica);
        biblioteca.addMusica(musica);

    }
}
