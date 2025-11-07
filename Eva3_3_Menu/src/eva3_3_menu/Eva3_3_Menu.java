package eva3_3_menu;

import java.util.Scanner;

public class Eva3_3_Menu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion;
        
        do{
            imprimirMenu();
            opcion = input.nextInt();
            if(opcion == 1){
                calcularPot();
            }else if(opcion == 2){
                sumarnumeros();
            }else if(opcion == 3){
                System.out.println("Saliendo del sistema...");
            }
        }while(opcion != 3);
    }
    
    public static void imprimirMenu(){
        System.out.println("Bienvenido al sistema");
        System.out.println("1. Calcular la potencia ");
        System.out.println("2. Sumar dos números");
        System.out.println("3. Salir del sistema");
        System.out.println("Seleccionar una opción:");
    }
    public static void calcularPot(){
        Scanner input = new Scanner(System.in);
        int i, base, exp;
        int resu = 1;
        System.out.println("Cálculo de una potencia");
        System.out.println("Capture la base: ");
        base = input.nextInt();
        System.out.println("Capture la exponente: ");
        exp = input.nextInt();
        System.out.println(base + " elevado a " + exp + " = " + calcularPotencia(base, exp));
    }
    public static int calcularPotencia(int base, int exp){
        int resu = 1;
        int i;
        for (i= 1; i<= exp; i++){
            resu = resu * base;
        }
        return resu;
    }
    
    public static void sumarnumeros(){
        Scanner input = new Scanner(System.in);
        int num1, num2;
        
        System.out.println("Suma de dos números");
        System.out.println("Introduce el primer número");
        num1 = input.nextInt();
        System.out.println("Introduce el segundo número");
        num2 = input.nextInt();
        System.out.println(num1 + " + " + num2 + " = " + calcularsuma(num1, num2));
    }
    public static int calcularsuma(int num1, int num2){
        return num1 + num2;
    }
}
