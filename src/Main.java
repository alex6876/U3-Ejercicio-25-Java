public class Main {

    public static void main(String[] args) {

        MaterialBiblioteca[] materiales = new MaterialBiblioteca[4];

        materiales[0] = new Libro(
                "El Principito", 1943, "Salamandra",
                "Antoine de Saint-Exupéry", 96
        );

        materiales[1] = new Revista(
                "National Geographic", 2025, "National Geographic",
                150, "Marzo"
        );

        materiales[2] = new Libro(
                "Don Quijote de la Mancha", 1605, "Francisco de Robles",
                "Miguel de Cervantes", 863
        );

        materiales[3] = new Revista(
                "Muy Interesante", 2026, "Zinet Media",
                280, "Octubre"
        );

        // Recorrer la colección
        for (int i = 0; i < materiales.length; i++) {

            materiales[i].mostrarCatalogo();

            System.out.println();
        }
    }
}
