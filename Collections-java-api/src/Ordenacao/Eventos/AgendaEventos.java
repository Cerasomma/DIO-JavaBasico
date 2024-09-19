package Ordenacao.Eventos;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    //atributos
    private Map<LocalDate, Evento> agendaEventosMap;

    //Construtor
    public AgendaEventos(Map<LocalDate, Evento> agendaEventosMap) {
        this.agendaEventosMap = new TreeMap<>(); //TreeMap mantem as datas ordenadas
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        agendaEventosMap.put(data, new Evento(data, nome, atracao));
    }

    public void exibirAgenda(){
        for(Map.Entry<LocalDate, Evento> e : agendaEventosMap.entrySet()){
            System.out.println(e.getValue());
        }
    }

    public Evento obterProximoEvento(){
        LocalDate hoje = LocalDate.now();
        //itera sobre as chaves (datas) ordenadas
        for(Map.Entry<LocalDate, Evento> e : agendaEventosMap.entrySet()){
            if(!e.getKey().isBefore(hoje)){
                return e.getValue(); //retorna o primeiro evento com a data de hoje ou futura.
            }
        }
        return null; //Se não houver eventos futuros
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos(null);

        //Adicionando Eventos
        agendaEventos.adicionarEvento(LocalDate.of(2024, 10, 10), "Show", "Banda A");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 25), "Conferencia", "Palestrante A");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 24), "WorkShop", "Instrutor C");
    
        //exibindo a agenda completa
        System.out.println("Agenda completa:");
        agendaEventos.exibirAgenda();

        //Obtendo o proximo evento
        Evento proximoEvento = agendaEventos.obterProximoEvento();
        if(proximoEvento != null){
            System.out.println("\nProximo evento: " + proximoEvento);
        }else{
            System.out.println("\nNão há eventos futuros");
        }
    }
}
