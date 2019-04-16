package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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


        Map<String, List<String>> apelidos = new HashMap<>();

        List<String> apelidosJoao = new ArrayList<>();
        apelidosJoao.add("Juan");
        apelidosJoao.add("Fissura");
        apelidosJoao.add("Maromba");

        List<String> apelidosMiguel = new ArrayList<>();
        apelidosMiguel.add("Night Watch");
        apelidosMiguel.add("Bruce Wayne");
        apelidosMiguel.add("Tampinha");

        apelidos.put("João", apelidosJoao);
        apelidos.put("Miguel", apelidosMiguel);

        for (String chave : apelidos.keySet()) {
            System.out.println("Apelidos do: " + chave);
            for (String apelido : apelidos.get(chave)) {
                System.out.println("\t" + apelido);
            }
        }

    }
}
