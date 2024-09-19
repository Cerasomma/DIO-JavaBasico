package Ordenacao.Eventos;

import java.time.LocalDate;

public class Evento {
    //atributos
    private LocalDate date;
    private String nome;
    private String atracao;
    
    public Evento(LocalDate date, String nome, String atracao) {
        this.date = date;
        this.nome = nome;
        this.atracao = atracao;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getNome() {
        return nome;
    }

    public String getAtracao() {
        return atracao;
    }

    @Override
    public String toString() {
        return "Evento [date=" + date + ", nome=" + nome + ", atracao=" + atracao + "]";
    }
    
}
