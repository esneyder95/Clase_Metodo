import java.util.Scanner;

public class Metodo {

    public static void main (String [] agrs){

        int i = 0;
        String texto = "";
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese texto");
        texto = lectura.next();
        String busqueda = "OTP ENCONTRADO ES";
        String[] vector_texto = busqueda.split("\\s+");
        for(String buscar_texto : vector_texto){
            if (busqueda.contains(buscar_texto)){
                System.out.println("Se ecnotro texto");
                i++;
                if (i==3){

                }
            }
        }
    }

}
