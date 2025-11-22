package eva3_9_areas;

import java.util.Scanner;

public class Eva3_9_Areas {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int opcion;
        
        do{
            imprimirMenu();
            opcion = input.nextInt();
            if(opcion == 1){
                circulo();
            }else if(opcion == 2){
                rectangulo();
            }else if(opcion == 3){
                trapecio();
            }
            else if(opcion == 4){
                System.out.println("Saliendo del sistema...");
            }
            else{
                System.out.println("No se encuentra esa opción");
            }
        }while(opcion != 4);
    }
    
    public static void imprimirMenu(){
        System.out.println("Bienvenido al Cálculo de Áreas");
        System.out.println("1. Calcular el área de un círculo ");
        System.out.println("2. Calcular el área de un rectángulo");
        System.out.println("3. Calcular el área de un trapecio");
        System.out.println("4. Salir del Sistema");
        System.out.println("Seleccionar una opción:");
    }
    public static void circulo(){
        Scanner input = new Scanner(System.in);
        int r;
        System.out.println("Cálculo del Área");
        System.out.println("Capture el radio: ");
        r = input.nextInt();
        System.out.println("El área del círculo es: " + calcularArea(r));
    }
    public static double calcularArea(int r){
        return Math.PI*Math.pow(r, 2);
    }
    public static void rectangulo(){
        Scanner input = new Scanner(System.in);
        int base, altura;
        System.out.println("Cálculo del Área");
        System.out.println("Capture la base:");
        base = input.nextInt();
        System.out.println("Capture la altura");
        altura = input.nextInt();
        System.out.println("El área del triángulo es: " + calcularArea(base,altura));
    }
    public static int calcularArea(int base, int altura){
        return base*altura;
    }
    public static void trapecio(){
        Scanner input = new Scanner(System.in);
        int base1, base2, altura;
        System.out.println("Cálculo del Área");
        System.out.println("Capture la base mayor:");
        base1 = input.nextInt();
        System.out.println("Capture la base menor");
        base2= input.nextInt();
        System.out.println("Capture la altura");
        altura = input.nextInt();
        System.out.println("El área del triángulo es: " + calcularArea(base1,base2,altura));
    }
    public static int calcularArea(int base1, int base2, int altura){
        return ((base1 + base2)*altura)/2;
    }
}
