package set.OperacoesBasicas;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();

    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome,codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover =null;
        for (Convidado convidado:convidadoSet){
            if(convidado.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = convidado;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }



    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println("Os Convidados são :" + convidadoSet);
    }

    public static void main(String[] args) {

        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " Convidados dentro do  Set Convidados");;

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 42423);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 12454);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 16546);
        conjuntoConvidados.adicionarConvidado("Convidado 5", 16546);

        conjuntoConvidados.exibirConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " Convidados dentro do  Set Convidados");;

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " Convidados dentro do  Set Convidados");;







    }


}
