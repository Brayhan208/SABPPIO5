package apartados;

public class Rutinas {

/**
 * Deportes,codigo,nombre,descripcion y la intensidad del ejercicio 
 * 
 */
public static void setRutina(int codigo){
switch(codigo){
case  0:
System.out.println(Entrenamiento.getEjercicio(0));
System.out.println(Entrenamiento.getEjercicio(1));
break;
case  1:
System.out.println(Entrenamiento.getEjercicio(3));
System.out.println(Entrenamiento.getEjercicio(4));
break;


}

}
public static void main(String[] args) {
   Entrenamiento.setCargaEjercicio();
   setRutina(0); 
   setRutina(1);
}
}
