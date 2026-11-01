public class Libro extends MaterialBiblioteca {

    private String autor;
    private int cantidadPaginas;

    public Libro(String titulo, int anioEdicion, String editorial,
                 String autor, int cantidadPaginas) {

        super(titulo, anioEdicion, editorial);

        this.autor = autor;
        this.cantidadPaginas = cantidadPaginas;
    }

    @Override
    public void mostrarCatalogo() {

        System.out.println("=== LIBRO ===");

        super.mostrarCatalogo();

        System.out.println("Autor: " + autor);
        System.out.println("Cantidad de páginas: " + cantidadPaginas);
    }
}
