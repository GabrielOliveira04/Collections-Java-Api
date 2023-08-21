package set.OperacoesBasicas;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavrasUnicas;


    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();

    }

    public void adicionarPalavra(String palavra){
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra){
        String palavrasParaRemover = null;
        for(String palavras:palavrasUnicas){
            if(palavras == palavra){
                palavrasParaRemover = palavras;
                break;
            }
        }
        palavrasUnicas.remove(palavrasParaRemover);

    }

   public boolean verificarPalavra(String palavra){
        return palavrasUnicas.contains(palavra);
   }

   public void exibirPalavrasUnicas(){
       System.out.println("As palavras são : " + palavrasUnicas );
   }

    public int exibirTotal(){
      return   palavrasUnicas.size();
    }





    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 1");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 3");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 2");

        System.out.println("O total de palavras é : " + conjuntoPalavrasUnicas.exibirTotal());
        conjuntoPalavrasUnicas.removerPalavra("Palavra 1");

        System.out.println("O total de palavras é : " + conjuntoPalavrasUnicas.exibirTotal());

        System.out.println("A palavra encontrada é : " + conjuntoPalavrasUnicas.verificarPalavra("Palavra 2"));

        System.out.println("O total de palavras é : " + conjuntoPalavrasUnicas.exibirTotal());

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();



    }
}
