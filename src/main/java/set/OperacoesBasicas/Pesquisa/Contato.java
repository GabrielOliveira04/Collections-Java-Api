package set.OperacoesBasicas.Pesquisa;

import java.util.Objects;

public class Contato {

    private String nome;
    private int numero;


    public Contato(String contato, int numero) {
        this.nome = contato;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contato1)) return false;
        return Objects.equals(getNome(), contato1.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }

    @Override
    public String toString() {
        return "\nContato " +
                 nome + '\'' +
                ", numero = " + numero
                ;
    }
}
