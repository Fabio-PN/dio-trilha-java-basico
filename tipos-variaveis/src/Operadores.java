
public class Operadores {
        public static void main(String[] args) {
        //CONCATENAÇÃO
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


        //INCREMENTOS E DECREMENTOS DE VALORES
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

        

        //TERNÁRIO
        int a, b;
        a = 6;
        b = 6;
        String resultado = "";
        //Exemplo de condicional utilizando uma estrutura if/else
        if(a==b)
        resultado = "verdadeiro";
        else
        resultado = "falso";
        System.out.println(resultado);

        //Mesma condicional, mas dessa vez, utilizando o operador ternário
        String valorFinal = (a==b) ? "verdadeiro" : "falso";
        System.out.println(valorFinal);



        //RELACIONAIS
        int numero1 = 1;
        int numero2 = 2;

        //Numero 1 é igual a número 2?
        boolean simNao = numero1 == numero2;
        
        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        //Número 1 é diferente de número 2?
        simNao = numero1 != numero2;
        
        System.out.println("numeroUm é diferente a numeroDois? " + simNao);

        //Número 1 é maior que número 2?
        simNao = numero1 > numero2;
        
        System.out.println("numeroUm é maior que numeroDois? " + simNao);

        //Número 1 é menor que número 2?
        simNao = numero1 < numero2;
        
        System.out.println("numeroUm é maior que numeroDois? " + simNao);

        //Número 1 é maior igual que número 2?
        simNao = numero1 >= numero2;
        
        System.out.println("numeroUm é maior que numeroDois? " + simNao);

        //Número 1 é menor igual que número 2?
        simNao = numero1 <= numero2;
        
        System.out.println("numeroUm é maior que numeroDois? " + simNao);
        


        //LÓGICOS
        boolean condicao1=true;

        boolean condicao2=true;

        /* Aqui estamos utilizando o operador lógico E para fazer a união de duas 
        expressões. 
        É como se estivesse escrito:
        "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
        */
        if(condicao1 && condicao2){
            System.out.print("Os dois valores são verdadeiros ");
            System.out.println(" ");
        }
            
        //Se condicao1 OU condicao2 for verdadeira, executar código.
        if(condicao1 || condicao2){
            System.out.print("Um dos valores é verdadeiro ");
            System.out.println(" ");
        }
        System.out.println("Fim");
    }
    
}