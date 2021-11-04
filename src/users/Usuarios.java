package users;

public class Usuarios{
/*
id,nombre completo,fecha de nacimiento,genero,estatura,peso
*/
public static String nombre[]=new String[50];
public static String fecha[]=new String[50];

public static void setCargaInicial(){
for (int i = 0; i <20; i++) {
    nombre[i]="NOMBRE"+i;
    fecha[i]="2004-07-20";
}
nombre[21]="*";
fecha[21]="*";
}
public static String getUsuario(int codigo){
return nombre[codigo]+ " Fecha de Nacimiento "+fecha[codigo];
}
public static void main(String[] args) {
    setCargaInicial();
   System.out.println(getUsuario(5)); 
}
}