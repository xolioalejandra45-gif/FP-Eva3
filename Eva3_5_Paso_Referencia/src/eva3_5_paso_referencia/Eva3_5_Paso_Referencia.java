package eva3_5_paso_referencia;

public class Eva3_5_Paso_Referencia {
//Es una copia de la variable y esa si puede modificar el valor original
    public static void main(String[] args) {
        int valor[] = new int[1]; //new = Objetos
        valor[0] = 5;
        System.out.println(valor); //[I@27716f4 -- Dirección de memoria del arreglo
        System.out.println("Valor (antes) = " + valor[0]);    
        incrementar(valor);
        System.out.println("Valor (despues) = " + valor[0]);
    }
    public static void incrementar(int[] val){
        System.out.println(val);//[I@27716f4 -- Copia de la dirección de memoria que se mando del arreglo 
        for (int i = 0; i < val.length; i++) {
            val[i] = val[i] + 1;
//            val[i]++;
        }
    }
    
}
