package set.OperacoesBasicas.Ordenacao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtosSet;


    public CadastroProdutos() {
        this.produtosSet = new HashSet<>();
    }

    public void adicionarProduto(long cod,String nome, double preco,int quantidade){
        produtosSet.add(new Produto(cod,nome,preco,quantidade));
    }

    public Set<Produto> exibirProdutoPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtosSet);
        return  produtosPorNome;
    }

    public Set<Produto> exibirProdutoPorPreco(){
        Set<Produto> produtosPorNome = new TreeSet<>(new ComparatorPorPreco());
        produtosPorNome.addAll(produtosSet);
        return produtosPorNome;

    }

    public static void main(String[] args) {

        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(12345,"Produto 1",10,10);
        cadastroProdutos.adicionarProduto(54321,"Produto 4",80,13);
        cadastroProdutos.adicionarProduto(21345,"Produto 2",100,12);
        cadastroProdutos.adicionarProduto(43215,"Produto 3",50,11);

        System.out.println("Produtos por nome" + cadastroProdutos.exibirProdutoPorNome());

        System.out.println("--------------------------------------------------------------------------------------------------");


        System.out.println("Produtos por Preço" + cadastroProdutos.exibirProdutoPorPreco());
    }




}
