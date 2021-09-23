import co.app.Usuarios;
import java.util.Scanner;
public class App {
    public static void main(String[] args)  {
     Scanner Lea= new Scanner(System.in);
     String nombre="";
     int n=0;
     Usuarios usu= new Usuarios();
     usu.setGenerarNumeros(100);
     System.out.println("ingrese su nombre:  ");
     nombre=Lea.next();
     usu.setNombre(nombre);
     System.out.println(usu.getNombre() + " Ingrese un número ");
     n= Lea.nextInt();
     usu.setGenerarNumeros(n);

    }
}
