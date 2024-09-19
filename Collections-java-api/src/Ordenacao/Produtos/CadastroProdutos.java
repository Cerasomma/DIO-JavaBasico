package Ordenacao.Produtos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    // atributos
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    // Exibir produtos ordenados por nome (usando TreeSet que utiliza o compareTo de Produto)
    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet); // Adiciona todos os produtos já existentes
        return produtosPorNome;
    }

    // Exibir produtos ordenados por preço (usando ComparatorPorPreco)
    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet); // Adiciona todos os produtos já existentes
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto(1L, "Produto 5", 15d, 5);
        cadastroProdutos.adicionarProduto(2L, "Produto 0", 20d, 10);
        cadastroProdutos.adicionarProduto(1L, "Produto 3", 10d, 2);  // Corrigi o código duplicado
        cadastroProdutos.adicionarProduto(9L, "Produto 9", 2d, 2);

        System.out.println("\nProdutos sem ordem definida (HashSet):");
        System.out.println(cadastroProdutos.produtoSet);

        System.out.println("\nProdutos ordenados por nome:");
        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        System.out.println("\nProdutos ordenados por preço:");
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}

