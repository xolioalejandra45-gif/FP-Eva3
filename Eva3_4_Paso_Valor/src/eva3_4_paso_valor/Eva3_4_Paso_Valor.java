package eva3_4_paso_valor;

public class Eva3_4_Paso_Valor {
//La variable original no se modifica, solo el duplicado que se mando a la función
    public static void main(String[] args) {
        int valor = 5;//primitivos
        System.out.println("Valor (antes) = " + valor);
        incrementar(valor);
        System.out.println("Valor (despues) = " + valor);
    }
    public static void incrementar(int val){
        val = val + 1;
//        val++;

    }
    
}
