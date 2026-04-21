public class App {
    public static void main(String[] args) throws Exception {
        metodoBurbuja();
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
