package list.OperacoesBasicas.ordenacao;

import java.util.Comparator;

public class Numeros implements Comparable<Numeros>{

    private String nome;
    private int numero;

    public Numeros(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    @Override
    public int compareTo(Numeros n) {
        return Integer.compare(numero,n.getNumero());
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return " \nNumeros " +
                " nome =" + nome +
                ", numero = " + numero ;
    }
}

class ComparatorPorNumero implements Comparator<Numeros>{

    @Override
    public int compare(Numeros n1, Numeros n2) {
        return Integer.compare(n1.getNumero(), n2.getNumero());
    }
}