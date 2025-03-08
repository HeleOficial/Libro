public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("Miguel de Cervantes", "El Quijote", 10, 11);

        System.out.println("Información del libro:");
        libro.imprimirLibro();

        System.out.println("\nRealizando préstamo:");
        if (libro.prestamo()) {
            System.out.println("Préstamo realizado con éxito");
        } else {
            System.out.println("No se pudo realizar el préstamo");
        }

        System.out.println("Estado actualizado:");
        libro.imprimirLibro();

        System.out.println("Realizando devolución:");
        if (libro.devolucion()) {
            System.out.println("Devolución realizada con éxito");
        } else {
            System.out.println("No se pudo realizar la devolución");
        }

        System.out.println("Estado final:");
        libro.imprimirLibro();
    }
}