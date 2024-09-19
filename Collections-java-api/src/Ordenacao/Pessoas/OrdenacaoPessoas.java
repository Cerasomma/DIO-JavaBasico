package Ordenacao.Pessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    //atributos
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }
    
    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("Nome 1", 30, 1.65);
        ordenacaoPessoas.adicionarPessoa("Nome 2", 20, 1.75);
        ordenacaoPessoas.adicionarPessoa("Nome 3", 40, 1.85);
        ordenacaoPessoas.adicionarPessoa("Nome 4", 50, 1.95);
        ordenacaoPessoas.adicionarPessoa("Nome 5", 10, 1.45);
        System.out.println(ordenacaoPessoas.pessoaList);
        //System.out.println(ordenacaoPessoas.ordenarPorIdade());
        //System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}
