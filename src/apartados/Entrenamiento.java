package apartados;

import java.util.Scanner;

public class Entrenamiento {
/**
 * id usuario,ejercicio,fecha,intensidad
 * 
 */
public static String ejercicio[]=new String[50];
public static void setCargaEjercicio(){
ejercicio[0]="Sentadillas";
ejercicio[1]="Flexiones";
ejercicio[2]="Tablón";
ejercicio[4]="Estiramiento de Cobra";
ejercicio[5]="Saltos de Tijera";
ejercicio[6]="Abdominales";
ejercicio[7]="Elevaciones de Piernas";
ejercicio[8]="Twist Ruso";
ejercicio[9]="Toque al Talón";
ejercicio[10]="Inchworms";
ejercicio[11]="Salto Lateral";
ejercicio[12]="Estocada Hacia Atrás";

}
public static String getEjercicio(int codigo){

return ejercicio[codigo];    
}

public static void main(String[] args) {
    Scanner lea= new Scanner(System.in);
    setCargaEjercicio();
    int codigo;
    System.out.println("ingrese el codigo del ejercicio");
    codigo= lea.nextInt();
    System.out.println(getEjercicio(codigo));
}
}
