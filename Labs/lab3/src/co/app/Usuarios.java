package co.app;
/*
@author:Brayhan Gonzaléz
@version:1.0
@since:2021
*/ 

public class Usuarios {
    private String id;
    private String nombre;
    private String correo;
    private int perfil;
    
    /*
    0. es un usuario estadar
    1. cliente
    2. Administrador
    3. webmaster 
    */
    
    private String estado;

public Usuarios() {  }//constructor de la clase

public Usuarios(int perfil) {
    this.perfil = perfil;
}

public String getId() {
    return id;
}

public void setId(String id) {
    this.id = id;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getCorreo() {
    return correo;
}

public void setCorreo(String correo) {
    this.correo = correo;
}

public int getPerfil() {
    return perfil;
}

public void setPerfil(int perfil) {
    this.perfil = perfil;
}

public String getEstado() {
    return estado;
}

public void setEstado(String estado) {
    this.estado = estado;
}

public void setGenerarNumeros(int i){
    System.out.println("Estos son los números generados " +this.nombre);
    System.out.println("---------------------------------------------");
for(int j=0; j<i;j++){
System.out.println("si j  < "+i+ "Número generado : "+i);

}
}

}// fin de la clase usuario
