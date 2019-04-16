package br.com.digitalhouse;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> loteriaSonhos = new HashMap<>();
        loteriaSonhos.put(0, "Ovos");
        loteriaSonhos.put(1, "Água");
        loteriaSonhos.put(2, "Escopeta");
        loteriaSonhos.put(3, "Cavalo");
        loteriaSonhos.put(4, "Dentista");
        loteriaSonhos.put(5, "Fogo");

        for (Integer chave : loteriaSonhos.keySet()) {
            System.out.println(loteriaSonhos.get(chave));
        }


        Map<String, String> listaAmigos = new HashMap<>();
        listaAmigos.put("João", "Juan, Fissura, Maromba");
        listaAmigos.put("Miguel", "Night Watch, Bruce Wayne, Tampinha");
        listaAmigos.put("Maria", "Wonder Woman, Mary, Marilene");
        listaAmigos.put("Lucas", "Lukinha, Jorge, George");

        for (String chave : listaAmigos.keySet()) {
            System.out.println(listaAmigos.get(chave));
        }

    }
}
