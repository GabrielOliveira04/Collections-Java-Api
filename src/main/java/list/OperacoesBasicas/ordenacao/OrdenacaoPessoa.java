package list.OperacoesBasicas.ordenacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

    private List<Pessoa> pessoaList;


    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }


    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome,idade,altura));
    }
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa>ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;

    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("Nome 1",202,1.59);
        ordenacaoPessoa.adicionarPessoa("Nome 2",21,1.86);
        ordenacaoPessoa.adicionarPessoa("Nome 3",20,1.96);
        ordenacaoPessoa.adicionarPessoa("Nome 4",50,2.56);

        System.out.println("Ordenação por idade :" + ordenacaoPessoa.ordenarPorIdade());
        System.out.println("==========================================================================================" );
        System.out.println("Ordenação por idade :" + ordenacaoPessoa.ordenarPorAltura());
    }









}
