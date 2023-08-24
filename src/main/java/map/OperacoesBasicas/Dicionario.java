package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String,String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }


    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if(!dicionarioMap.isEmpty()){
            dicionarioMap.remove(palavra);
        }
    }

    public void exibirPalavras(){
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra){
        String pesquisarPalavra = null;
        if(!dicionarioMap.isEmpty()){
            pesquisarPalavra = dicionarioMap.get(palavra);
        }
        return pesquisarPalavra;
    }

    public static void main(String[] args) {

        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Casamento","Preso");
        dicionario.adicionarPalavra("preso","Fez merda");
        dicionario.adicionarPalavra("Liberdade","livre");
        dicionario.adicionarPalavra("passeio","relaxar");
        dicionario.adicionarPalavra("Casamento2","Preso2");

        dicionario.exibirPalavras();


        System.out.println("A palavra que você está pesquisando é :" +  dicionario.pesquisarPorPalavra("Casamento"));

        dicionario.removerPalavra("Casamento");
        dicionario.exibirPalavras();
    }






}
