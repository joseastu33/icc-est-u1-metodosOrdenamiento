public class App {
    public static void main(String[] args) throws Exception {
        metodoBurbuja();
        runMetodoBurbujaAvanzado();
    }
    public static void runMetodoBurbujaAvanzado() {
        // 1ro instanciar la clase
        int[] arreglo = new int[]{50, 5, 20, 30, 0, -10, 15};
        //                       {5, (50), 20, 30, 0, -10, 15}
        //                       {5, 20, (50), 30, 0, -10, 15}
        //                       {5, 20, 30, (50), 0, -10, 15} 1. Tamaño del arreglo -1, 2. Quitar indice de completados
        //                       {5, 20, 30, 0, (50), -10, 15}
        MetodoBurbujaAvanzado mBurbujaAvanzado = new MetodoBurbujaAvanzado(arreglo);
        mBurbujaAvanzado.printArreglo(); //imprimir el arreglo NORMAL
        mBurbujaAvanzado.sort(true);// Ordenar el arreglo ascendente
        mBurbujaAvanzado.printArreglo(); //Imprimir el arreglo ASCENDENTE
        mBurbujaAvanzado.sort(false); // Ordenar el arreglo descendente
        mBurbujaAvanzado.printArreglo(); // Imprimir el arreglo descendente
    }
    public static void metodoBurbuja(){
        System.out.println("Método Burbuja");
        int[] arreglo = {10, -5, 2, 7};
        MetodoBurbuja metodoBurbuja = new MetodoBurbuja(arreglo); //instanciar: dar valor, guardada en una variable o ejecutar el constructor
        metodoBurbuja.imprimirArreglo();
        metodoBurbuja.ordenarAscendente();
        metodoBurbuja.imprimirArreglo();
        metodoBurbuja.ordenarDescendente();
        metodoBurbuja.imprimirArreglo();

    }
}
