package eva3_7_paso_referencia;

import java.util.Scanner;

public class Eva3_7_Paso_Referencia {

    public static void main(String[] args) {
        String cliente[] = new String[5];
        double credito[] = new double[5];
        capturarCLientes(cliente, credito);
        imprimir(cliente, credito);
    }
    public static void capturarCLientes(String[] nombre, double[] credito){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < credito.length; i++) {
            System.out.println("Nombre del cliente: ");
            nombre[i] = input.nextLine();
            System.out.println("Credito del cliente: ");
            credito[i] = input.nextDouble();
            input.nextLine();
        }
    }
    public static void imprimir(String[] nombre, double[] credito){
            for (int i = 0; i < credito.length; i++) {
                System.out.println("Nombre: " + nombre[i] + ", crédito: $" + credito[i] );
    }
    
  }
}
