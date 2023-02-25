
public class Operadores {
    // Concatenação
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);

        String concatenacao = "?";

        concatenacao = 1+1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1"+1;
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1+1;
        System.out.println(concatenacao);

        concatenacao = (1+1+1+1)+"1";
        System.out.println(concatenacao);

        int numero = 5;
        System.out.println(-numero);


        // Incrementos e decrementos de valores
        int valor = 5;
        //x repetição
        System.out.println(valor);
        valor = valor + 2;
        System.out.println(valor);
        System.out.println(++valor);
        System.out.println(valor);
        System.out.println(valor--);
        System.out.println(valor);

        // Validando valores de uma variável como true or false
        boolean variavel = true;
        variavel = !variavel;
        System.out.println(variavel);
        variavel = !variavel;
        System.out.println(variavel);

        
        //Ternário
        int a, b;
        a = 6;
        b = 6;
        String resultado = "";
        // EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        if(a==b)
        resultado = "verdadeiro";
        else
        resultado = "falso";
        System.out.println(resultado);

        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String valorFinal = (a==b) ? "verdadeiro" : "falso";

        System.out.println(valorFinal);


        //Relacionais

            
    }
    
}