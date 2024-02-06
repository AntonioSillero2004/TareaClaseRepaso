import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class TiendaMascotas{

    Mascota[] inventario;
    int cantidadMascotas;

    public TiendaMascotas() {
        this.inventario = new Mascota[100];
        this.cantidadMascotas = cantidadMascotas;
    }

    public void agregarMascota(String nombre, int edad, String tipoAnimal){
       Mascota mascota = new Mascota(nombre,edad,tipoAnimal);
       inventario[cantidadMascotas]= mascota;
       cantidadMascotas ++;
       System.out.println("La mascota " + nombre + " se ha añadido correctamente");
    }
    public void venderMascota(String nombre){
        for(int i=0; i < cantidadMascotas; ++i){
            System.out.println(inventario[i].getNombre());
            if(inventario[i].getNombre().equals(nombre)){
                inventario[i]=null;
                System.out.println("La mascota " + inventario[i].getNombre()+ " se ha vendido");
                for (int j = 0; j < cantidadMascotas; j++) {
                    inventario[j]=inventario[j+1];
                }
                cantidadMascotas--;
                return;
            }else {
                    System.out.println("No existe esa mascota");
                }
            }
        }

    public void mostrarInventario(){
        System.out.println("El inventario de la tienda contiene: "  );
        for (int i = 0; i < cantidadMascotas; i++) {
        System.out.println("Nombre: "+inventario[i].getNombre() +" ,edad: "+inventario[i].getEdad() +" ,tipo de Animal: "+inventario[i].getTipoAnimal());

        }



    }

}