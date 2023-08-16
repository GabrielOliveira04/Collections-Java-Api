package GenericsExemple;

import java.util.ArrayList;
import java.util.List;

public class GenericsExempleList {

    public static void main(String args[]){

        List<String> listaGenerics = new ArrayList<>();
        listaGenerics.add("Elemento 1");
        listaGenerics.add("Elemento 2");


        for (String elemento : listaGenerics){
            System.out.println(elemento);
        }
    }

}
