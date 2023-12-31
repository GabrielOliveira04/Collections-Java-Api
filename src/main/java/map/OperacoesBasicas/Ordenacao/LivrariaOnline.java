package map.OperacoesBasicas.Ordenacao;

import java.util.*;

public class LivrariaOnline {

    private Map<String,Livro> livros;

    public LivrariaOnline() {
        this.livros = new HashMap<>();
    }

    public void adicionarLivro(String link,Livro livro){
        livros.put(link,livro);
    }

    public  void removerLivro(String titulo){
        Livro livroRemovido = null;
        if (livros.isEmpty()){
            for (Map.Entry<String, Livro>entry : livros.entrySet()){
                if(entry.getValue().getTitulo().equals(titulo)){
                    livroRemovido = entry.getValue();
                    break;
                }
            }
        if (livroRemovido !=null){
            livros.remove(livroRemovido);
        }
        }
    }

    public Map<String, Livro> pesquisarOrdenadorPorPreco(){
        return  new TreeMap<>(livros);
    }
    public Map<String, Livro> pesquisarLivrosPorAutor(String autor){
        Set<Map.Entry<String, Livro>> setLivrosPorAutor = new TreeSet<>(new ComparatorPorAutor());
        for (Map.Entry<String, Livro> entry : livros.entrySet()){
            if(entry.getValue().getAutor().equals(autor)){
                setLivrosPorAutor.add(entry);
            }
        }

        Map<String, Livro> LivrosPorAutor = new LinkedHashMap<>();
        for(Map.Entry<String, Livro> entry : setLivrosPorAutor){
            LivrosPorAutor.put(entry.getKey(), entry.getValue());
        }
        return LivrosPorAutor;
    }

    public Livro exibirLivroMaisBarato() {
        Livro livroMaisCaro = null;
        double precoMaisBaixo = -1;
        for(Map.Entry<String,Livro> entry : livros.entrySet()){
            Livro livro = entry.getValue();
            if(livro.getPreco() < precoMaisBaixo){
                precoMaisBaixo = livro.getPreco();
                livroMaisCaro = livro;
            }
        }
        return livroMaisCaro;
    }


    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();
        livrariaOnline.adicionarLivro("https://amzn.to/3JjrxJl", new Livro("1984", "George Orwell",  19.60d));
        livrariaOnline.adicionarLivro("https://amzn.to/3PmYFnb", new Livro("Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d ));
        livrariaOnline.adicionarLivro("https://amzn.to/43Sfzi0", new Livro("Assassinato no Expresso do Oriente", "Agatha Christie", 26.90d));

        System.out.println("Livro mais barato" + livrariaOnline.exibirLivroMaisBarato());

        System.out.println("Livro Ordenado" + livrariaOnline.pesquisarOrdenadorPorPreco());

        System.out.println("Livro Ordenado" + livrariaOnline.exibirLivroMaisBarato());

        System.out.println("Livro Ordenado" + livrariaOnline.pesquisarLivrosPorAutor("Josh Malerman"));
    }

}
