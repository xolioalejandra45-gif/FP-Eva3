package eva3_1_metodos;

public class Eva3_1_Metodos {

    public static void main(String[] args) {
        int val1 = 5, val2 = 10;
//        si necesito guardar el valor de retorno
        int resultado = suma(val1, val2); //llamando el método
        System.out.println("La suma de 5 + 10 = " + resultado);
        System.out.println("La suma de 5 + 10 = "+ suma(val1, val2));
    }
//    Fuera del main, solo otros metodos o declaracion de variables
//    Llamar a sus métodos usando verbos y escritura camelCase
//  1.  Modificadores de acceso: public, protected, private
//  2.  static -----> para poder usar las variables dentro del método
//  3.  Valor de retorno: cualquier tipo de dato
//      void ----->  si mo quieren regresar un valor
//  4.  Nombre del método(No debe comenzar con números, no pueden ser palabras reservadas(mismas reglas que identificadores))
//  5.  Lista de parámetros: Pueden ser cero o N cantidad
//    1      2     3    4     5
    public static int suma(int num1, int num2){
        int suma = num1 + num2;
        return suma;
    }
}
