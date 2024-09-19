package OperacoesBasicas.Map.Agenda;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributos
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos(){
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Clayton", 999000566);
        agendaContatos.adicionarContato("Clayton", 999000);
        agendaContatos.adicionarContato("Clayton Cerasomma", 999566);
        agendaContatos.adicionarContato("Clayton Figueiredo", 000566);
        agendaContatos.adicionarContato("Francisco", 000566);
        agendaContatos.adicionarContato("Clayton", 999);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Francisco");
        agendaContatos.exibirContatos();

        System.out.println("\nO número é: " + agendaContatos.pesquisarPorNome("Clayton Cerasomma"));
    }
}
