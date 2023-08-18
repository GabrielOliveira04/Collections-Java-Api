package list.OperacoesBasicas.pesquisas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SomarNumeros {

    private List<Integer> numeros;

    public SomarNumeros() {
        this.numeros = new ArrayList<>();
    }



    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }
    public int calcularSoma() {
        int somar = 0;
        for (Integer numero : numeros){
            somar+=numero;

        }

        return somar;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        if(!numeros.isEmpty()){
            for (Integer numero : numeros){
                if (numero >= maiorNumero){
                    maiorNumero = numero;
                }
            }
            return maiorNumero;
        }else {
            throw new RuntimeException("A lista está vazia");
        }

    }

    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if(!numeros.isEmpty()){
            for (Integer numero : numeros){
                if(numero <= menorNumero){
                    menorNumero = numero;
                }
            }
            return menorNumero;
        }else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void exibirNumeros(){
        if(!numeros.isEmpty()){
            System.out.println("O total de números é : " + this.numeros);
        }else {
            System.out.println("A lista está vazia por favor preencher");
        }
    }


    public static void main(String[] args) {

        SomarNumeros somarNumeros = new SomarNumeros();
        somarNumeros.adicionarNumero(10);
        somarNumeros.adicionarNumero(9);
        somarNumeros.adicionarNumero(120);
        somarNumeros.adicionarNumero(1110);
        somarNumeros.adicionarNumero(11110);

        System.out.println("A soma de todos os números é : " + somarNumeros.calcularSoma());
        System.out.println("------------------------------------------------------------------------------------- " );
        System.out.println("O maior número é : " + somarNumeros.encontrarMaiorNumero());
        System.out.println("------------------------------------------------------------------------------------- " );
        System.out.println("O menor número é : " + somarNumeros.encontrarMenorNumero());
        System.out.println("------------------------------------------------------------------------------------- " );
        somarNumeros.exibirNumeros();


    }






}
