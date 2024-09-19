package OperacoesBasicas.Compras;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarrinhoDeCompras {
    //atributos

    private List<Item> itens;

    public CarrinhoDeCompras(List<Item> itens){ 
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preço, int quantidade){
        Item item = new Item(nome, preço, quantidade);
        this.itens.add(item);
    }

    public void removerItem(String nome){
        Iterator<Item> iterator = itens.iterator();
        while (iterator.hasNext()) {
            Item next = iterator.next();
            if(next.getNome().equalsIgnoreCase(nome))
                iterator.remove();
        }
    }
    public double calcularValorTotal(){
        double valorTotal = 0d;
        for(Item item : itens){
            double valorItem = item.getPreco() * item.getQuantidade();
            valorTotal += valorItem;
        }
        return valorTotal;  
    }

    public void exibirItens(){
        System.out.println(this.itens);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras(null);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 2);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 1);
        carrinhoDeCompras.adicionarItem("Régua", 2d, 2);
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.removerItem("Régua");
        System.out.println("O valor da compra é: " + carrinhoDeCompras.calcularValorTotal());
    }
}
