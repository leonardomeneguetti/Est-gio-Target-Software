
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma String:");
        String normal = scanner.nextLine();
        
        String reversa = "";
        for(int i=normal.length()-1;i>=0;i--){
            reversa = reversa + normal.charAt(i);
        }
        System.out.println(reversa);
    }
}
