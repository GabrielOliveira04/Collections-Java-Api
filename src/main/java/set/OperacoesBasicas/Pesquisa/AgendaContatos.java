package set.OperacoesBasicas.Pesquisa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();

    }


   public void  adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome,numero));
   }

    public void exibirContatos(){
        System.out.println("Os seus Contatos são : " + contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();
        for(Contato contato : contatoSet){
            if(contato.getNome().startsWith(nome)){
                contatoPorNome.add(contato);
            }
        }
        return contatoPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoParaAtualizar = null;
        for(Contato contato : contatoSet){
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setNumero(novoNumero);
                contatoParaAtualizar = contato;
                break;
            }
        }
        return contatoParaAtualizar;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Gabriel Oliveira", 132456789);
        agendaContatos.adicionarContato("Gabriel Pontes", 423423);
        agendaContatos.adicionarContato("Gabriel Dio", 34534534);
        agendaContatos.adicionarContato("Gabriel Alura", 12312312);
        agendaContatos.adicionarContato("Gabriel Treino", 756231241);
        agendaContatos.adicionarContato("Emmylly Treino", 111111);

        agendaContatos.exibirContatos();

        System.out.println("O contato que você procura é : " + agendaContatos.pesquisarPorNome("Gabriel"));

        System.out.println("contato atualizado : " + agendaContatos.atualizarNumeroContato("Emmylly Treino",12345));

    }

}
