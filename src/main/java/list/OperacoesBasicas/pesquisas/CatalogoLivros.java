package list.OperacoesBasicas.pesquisas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));

    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosParaPesquisar = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro livro : livroList) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosParaPesquisar.add(livro);
                }
            }

        }

        return livrosParaPesquisar;
    }


    public List<Livro> pesquisarPorIntervaloAnos(int anoIncial, int anoFinal){
        List<Livro> livroPorIntervaloAno = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro livro : livroList){
                if(livro.getAnoPublicacao() >= anoIncial && livro.getAnoPublicacao() <= anoFinal){
                    livroPorIntervaloAno.add(livro);
                }
            }
        }
        return livroPorIntervaloAno;
    }

    public Livro pesquisarPorTitulo (String titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for (Livro livro : livroList){
                if(livro.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = livro;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }


    public int  exibirTotalDeLivros(){
        return livroList.size();
    }

    public static void main(String[] args) {

        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 1", 2021);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 3", 1998);

        System.out.println("Pesquisar por titulo :" + catalogoLivros.pesquisarPorTitulo("Livro 1"));
        System.out.println("------------------------------------------------ ----------------------------------------");
        System.out.println("Pesquisar por autor :  " + catalogoLivros.pesquisarPorAutor("Autor 1")
        );
        System.out.println("------------------------------------------------ ----------------------------------------");
        System.out.println("Total de livros é : " + catalogoLivros.exibirTotalDeLivros());

        System.out.println("------------------------------------------------ ----------------------------------------");
        System.out.println("Pesquisar Livros Por ano : " + catalogoLivros.pesquisarPorIntervaloAnos(1998,2022)
        + "\ntotal de livros é : " + catalogoLivros.exibirTotalDeLivros());
    }







}


























