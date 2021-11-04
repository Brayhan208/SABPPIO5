package apartados;

import java.util.Scanner;

public class Alimentos {

/**
 * codigo,nombre y una descripcion
 */
public static String alimentos[]=new String[50];
public static void setCargaAlimentos(){
 alimentos[0]="Avena";
 alimentos[1]="Huevo";
 alimentos[2]="Atún";
 alimentos[3]="Salmón";
 alimentos[4]="Leche";
 alimentos[5]="Manzana";
 alimentos[6]="Almendras";
 alimentos[7]="Yogurt Griego";
 alimentos[8]="Pollo";
 alimentos[9]="Pavo";
 alimentos[10]="Nueces";
 alimentos[11]="Mani";
 alimentos[12]="Lentejas";
 alimentos[13]="Frijol";
 alimentos[14]="Garbanzos";
 alimentos[15]="Arroz";
 alimentos[16]="Papa";
 alimentos[17]="Lechuga";
 alimentos[18]="Brocoli";
 alimentos[19]="Fresa";
 alimentos[20]="Banano";
 alimentos[21]="Pan Integral";
 alimentos[22]="Té";
 alimentos[23]="*";


}
public static String getAlimentos(int codigo){

return alimentos[codigo];    
}

public static void main(String[] args) {
    Scanner lea= new Scanner(System.in);
    setCargaAlimentos();
    int codigo;
    System.out.println("ingrese el codigo del ejercicio");
    codigo= lea.nextInt();
    System.out.println(getAlimentos(codigo));
}


}

