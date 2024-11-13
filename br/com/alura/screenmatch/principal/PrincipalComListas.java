package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        Serie lost = new Serie("Lost", 2000);
        Filme outroFilme = new Filme("Avatar",2023);
        var filmeDoPaulo = new Filme("Dogville",2003);

        List<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        List<String> artistas = new ArrayList<>();
        artistas.add("jv");
        artistas.add("tude");
        artistas.add("bebe");
        System.out.println(artistas);
        Collections.sort(artistas);
        System.out.println(artistas);

        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);

    }
}
