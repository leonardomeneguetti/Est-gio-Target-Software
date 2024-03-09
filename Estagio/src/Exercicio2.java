import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe um numero: ");        
        int num = scanner.nextInt();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        int atual=0, prox=1, soma=0;
        
        System.out.println(atual + "\n" + prox);
        for(int i=atual;soma<num;i++){
            soma = atual + prox;
            atual = prox;
            prox = soma;
            System.out.println(soma);
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        if(soma == num){
            System.out.println(num + " pertence a sequencia.");
        } else {
            System.out.println(num + " nao pertence a sequencia");
        }
    }
}
