package OperacoesBasicas.Agenda;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributos
    private Set<Contato> contatoSet;

    public AgendaContatos(Set<Contato> contatoSet) {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        //for(Contato c : contatoSet)
        //System.out.println(c);
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizatNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c: contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos(null);

        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Clayton", 12345);
        agendaContatos.adicionarContato("Clayton", 0);
        agendaContatos.adicionarContato("Clayton Cerasomma", 45678);
        agendaContatos.adicionarContato("Clayton Figueiredo", 9879875);
        agendaContatos.adicionarContato("Nome Qualquer", 0);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("Clayton"));

        System.out.println("Contato Atualizado: " + agendaContatos.atualizatNumeroContato("Nome Qualquer", 6456456));
        
    }
    
}
