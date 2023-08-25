package map.OperacoesBasicas.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutoMap;

    public EstoqueProdutos() {
        this.estoqueProdutoMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutoMap.put(cod ,new Produto(nome, preco, quantidade));

    }

    public void exibirProdutos(){
        System.out.println( estoqueProdutoMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if(!estoqueProdutoMap.isEmpty()){
            for (Produto p: estoqueProdutoMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();

            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutoMap.isEmpty()){
            for (Produto p : estoqueProdutoMap.values()){
                if(p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                }
            }

        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {

        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.adicionarProduto(1234,"Carne de porco",10,20.55);
        estoqueProdutos.adicionarProduto(2314,"frango",5,50.0);
        estoqueProdutos.adicionarProduto(5432,"Peixe",8,120.99);
        estoqueProdutos.adicionarProduto(4444,"Picanha",200,155.80);
        estoqueProdutos.adicionarProduto(1234,"Coxão Mole",3,25.50);

        estoqueProdutos.exibirProdutos();


        System.out.println("O valor total do estoque é :" + estoqueProdutos.calcularValorTotalEstoque());

        System.out.println("O valor Produto mais caro é : " + estoqueProdutos.obterProdutoMaisCaro());



    }







}
