package refactor;

/*
Extraer la impresión del título y conclusión en sus propios métodos.
 */
class Report {

    void printReport() {
        // imprimir título
        extractedTitulo();

        // contenido del reporte
        System.out.println("Contenido 1...");
        System.out.println("Contenido 2...");
        // más contenido...

        // imprimir conclusión
        extractedConclusion();

    }

    private static void extractedConclusion() {
        System.out.println("Conclusión del Reporte");
    }

    private static void extractedTitulo() {
        System.out.println("Título del Reporte");
    }


}