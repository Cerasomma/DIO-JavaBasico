package OperacoesBasicas.Nomes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListaNomes {

    //atributo
    private List<String> nomes;
 
    public ListaNomes(List<String> nomes) {
        this.nomes = new ArrayList<>();
    }

    public void adicionarNome(String nome){
        this.nomes.add(nome);
    }

    public void removerNome(String nome){
        Iterator<String> iterator = this.nomes.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            if(next.equalsIgnoreCase(nome)){
                iterator.remove();
            }
        }
    }

    public boolean verificaNome(String nome){
        return nomes.contains(nome);
    }

    public void obterTodosNomes(){
        System.out.println(this.nomes);
    }

    @Override
    public String toString() {
        return "ListaNomes [nomes=" + nomes + "]";
    }

    public static void main(String[] args) {
        ListaNomes listaNomes = new ListaNomes(null);
        listaNomes.adicionarNome("Cleyton");
        listaNomes.adicionarNome("Cleyton");
        listaNomes.adicionarNome("Clayton");
        listaNomes.adicionarNome("Cerasomma");
        listaNomes.obterTodosNomes();
        listaNomes.removerNome("Cleyton");
        listaNomes.obterTodosNomes();

    }
}
