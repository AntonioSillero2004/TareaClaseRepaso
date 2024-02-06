public class Main {
    public static void main(String[] args) {

        TiendaMascotas tienda = new TiendaMascotas();

        tienda.agregarMascota("Lula", 5, "Perro");
        tienda.agregarMascota("Bigotes", 1, "Gato");
        tienda.agregarMascota("Nieve",2,"lobo");

        tienda.mostrarInventario();




    }

}