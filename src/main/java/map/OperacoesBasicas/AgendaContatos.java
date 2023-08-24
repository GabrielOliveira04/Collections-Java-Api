package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

private Map<String,Integer> agendaContatosMap;

    public AgendaContatos() {
        this.agendaContatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome,Integer telefone){
        agendaContatosMap.put(nome,telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatosMap.isEmpty()){
            agendaContatosMap.remove(nome);
        }
    }


    public void exibirContatos(){
        System.out.println("Os seus contatos são : \n"  + agendaContatosMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatosMap.isEmpty()){
            numeroPorNome = agendaContatosMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Gabriel Oliveira", 123456);
        agendaContatos.adicionarContato("Gabriel Pontes", 654321);
        agendaContatos.adicionarContato("Gabriel Da feira", 213456);
        agendaContatos.adicionarContato("Gabriel Academia", 321456);
        agendaContatos.adicionarContato("Luis ze", 432156);
        agendaContatos.adicionarContato("É o tal Oliveira", 564321);

        agendaContatos.exibirContatos();


        System.out.println("O contato que você procura é : " + agendaContatos.pesquisarPorNome("Gabriel Oliveira"));

       agendaContatos.removerContato("É o tal Oliveira");

        agendaContatos.exibirContatos();
    }

}
