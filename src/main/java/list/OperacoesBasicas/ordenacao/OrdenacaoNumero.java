package list.OperacoesBasicas.ordenacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumero {
    private List<Numeros> numerosList;

    public OrdenacaoNumero() {
        this.numerosList = new ArrayList<>();
    }


    public void adicionarNomeENumero(String nome,int numero){
        numerosList.add(new Numeros(nome, numero));
    }

    public void removerNome(String nome){
        List<Numeros> remover = new ArrayList<>();
        if(!numerosList.isEmpty()){
            for (Numeros numeros : numerosList){
                if(numeros.getNome().equalsIgnoreCase(nome)){
                    remover.add(numeros);
                }
            }
            numerosList.removeAll(remover);
        }

    }


    public List<Numeros> pesquisarPorNome(String nome){
        List<Numeros> nomeParaPesquisar = new ArrayList<>();
        if(numerosList.isEmpty()){
            for (Numeros numeros : numerosList){
                if(numeros.getNome().equalsIgnoreCase(nome)){
                    nomeParaPesquisar.add(numeros);

                }
            }
        }
        return nomeParaPesquisar;


    }
    public List<Numeros> ordenarAscendente(){
        List<Numeros> ordemAscendente = new ArrayList<>(numerosList);
        Collections.sort(ordemAscendente);
        return ordemAscendente;
    }

    public List<Numeros> ordenarDescendente(){
        List<Numeros> ordemDescendente = new ArrayList<>(numerosList);
        Collections.sort(ordemDescendente,Collections.reverseOrder(new ComparatorPorNumero()));
        return ordemDescendente;
    }





    public int exibirQuantidade(){
        return numerosList.size();
    }


    public static void main(String[] args) {
        OrdenacaoNumero ordenacaoNumero = new OrdenacaoNumero();

        ordenacaoNumero.adicionarNomeENumero("Pessoa 1",29);
        ordenacaoNumero.adicionarNomeENumero("Pessoa 2",26);
        ordenacaoNumero.adicionarNomeENumero("Pessoa 3",22);
        ordenacaoNumero.adicionarNomeENumero("Pessoa 4",90);

        System.out.println("Ordem descendente : " + ordenacaoNumero.ordenarDescendente());
        System.out.println("------------------------------------------------ ----------------------------------------");
        System.out.println("Ordem Ascendente : " + ordenacaoNumero.ordenarAscendente());
        System.out.println("------------------------------------------------ ----------------------------------------");
        System.out.println("Pesquisar Por nome : " + ordenacaoNumero.pesquisarPorNome("Pessoa 2"));
        System.out.println("------------------------------------------------ ----------------------------------------");
        System.out.println("Quantidade de Itens : " + ordenacaoNumero.exibirQuantidade());

        ordenacaoNumero.removerNome("Pessoa 3");

        System.out.println("Quantidade de Itens : " + ordenacaoNumero.exibirQuantidade());










    }





}
