package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarrinhoDeCompra {
    private List<Item> listaItem;


    public CarrinhoDeCompra(){
        this.listaItem = new ArrayList<>();
    }
    public void adicionarItem(String nome, double preco, int quantidade){
        listaItem.add(new Item(nome,preco,quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemsParaRemover = new ArrayList<>();
        for(Item item : listaItem){
            if(item.getNome().equalsIgnoreCase(nome)){
                itemsParaRemover.add(item);
            }
        }

        listaItem.removeAll(itemsParaRemover);
    }

    public int calcularValorTotal(){
        return listaItem.size();
    }

    public void exibirItens(){
        System.out.println("Os itens que temos para exibir é : " + listaItem);

    }

    public static void main(String[] args) {

        CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();
        System.out.println("O número total de itens que temos é : " + carrinhoDeCompra.calcularValorTotal());

        carrinhoDeCompra.adicionarItem("Carrinho de brinquedo", 150.99,50);
        carrinhoDeCompra.adicionarItem("Blusas da nike", 200,150);
        carrinhoDeCompra.adicionarItem("Short adidas", 189.90,1150);

        carrinhoDeCompra.exibirItens();
        System.out.println("O número total de itens que temos é : " + carrinhoDeCompra.calcularValorTotal());

        carrinhoDeCompra.removerItem("Carrinho de brinquedo");

        System.out.println("O número total de itens que temos é : " + carrinhoDeCompra.calcularValorTotal());



    }


















}
