public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM " + "JAVA";
        System.out.println(nomeCompleto);

        String concatenacao = "?";
        System.out.println(concatenacao);
        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        concatenacao = 1+1+"1"+1;
        System.out.println(concatenacao);
        concatenacao =  1+"1"+1+"1";
        System.out.println(concatenacao);
        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);
        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);
        
        int numero = 5;
        System.out.println(- numero + " exibe como negativo");
    
        //*repetição */
        numero = numero + 1;
        System.out.println(numero);
        //Outra forma
        System.out.println(++numero);

        boolean variavel = true;
        System.out.println(variavel);
        System.out.println(!variavel);

        //Operador ternário
        int a = 5, b = 6;
        String resultado = a==b ? "verdadeiro" : "falso";
        
        // Métod tradicional pelo IF
        /*if (a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";*/

        System.out.println(resultado);  

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;         
        System.out.println("Numero1 = Numero2? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("Numero1 = Numero2? " + simNao);

        String nome1 = "Clayton";
        String nome2 = "Cerasomma";
        System.out.println(nome1.equals(nome2));

        boolean condicao1 = false;
        boolean condicao2 = false;
        if (condicao1 && condicao2){
            System.out.println("Duas condições verdadeiras");
        }else{
            if (condicao1 || condicao2){
                System.out.println("Pelo menos uma condição é verdadeira");
            }else{
                System.out.println("As duas codições são falsas");    
            }   
        }
    }
}
