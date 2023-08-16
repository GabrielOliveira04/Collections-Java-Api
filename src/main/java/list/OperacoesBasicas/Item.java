package list.OperacoesBasicas;

public class Item {

    private String nome;
    private double preco;

    private int Quantidade;

    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        Quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    @Override
    public String toString() {
        return "\nItem : " +
                "nome = " + nome + '\'' +
                ", preco = " + preco +
                ", Quantidade = " + Quantidade +
                ' ';
    }
}
