import java.util.*;
import java.lang.Math;

public class empresaXogo {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        calcularEntrada();
    }
    
    public static void calcularEntrada() {
        int idade;
        double prezo;
 	       
	System.out.println("Albricias! Esto es un conflito")
        System.out.println("Indica a idade do cliente: ");
        idade = input.nextInt();
        if (idade < 0) {
            System.out.println("A idade non é válida");
        } else {
            if (idade >= 0 && idade < 4) {
                prezo = 0;
            } else {
                if (idade < 18) {
                    prezo = 5;
                } else {
                    prezo = 10;
                }
            }
            System.out.println("O prezo da entrada para o cliente é: " + prezo);
        }
    }
}
