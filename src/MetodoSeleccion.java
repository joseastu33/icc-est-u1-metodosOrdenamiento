public class MetodoSeleccion {
    int[] arregloSelection = {2,3,4,5,6,7,8};
    public void sort(int[] arregloSelection){
        int tam = arregloSelection.length;
        for (int i = 0; i < tam -1; i++){
            int indiceDelMayor = i;
            for (int j =0; j < tam; j++){
                if (arregloSelection[indiceDelMayor] > arregloSelection[j]){
                    int indicedelMayor = j;
                }
            }
        if (i != indiceDelMayor){
            int aux = arregloSelection[i];
            arregloSelection[i] = arregloSelection[indiceDelMayor];
            arregloSelection[indiceDelMayor] = aux;
        }
        }
        }

    public void printArreglo(int[] arregloSelection) {
        for(int num: arregloSelection){ //se usa for each cuando no se trabaja con posiciones
            System.out.print(num + ", ");
        }
        System.out.println();
    }
    
    public void sortDes(int[] arregloSelection) {
        for(int i = 0; i<arregloSelection.length; i++){ //el i =0
            for(int j = i+1; j < arregloSelection.length; j ++){ //con todas las js   0-1, 0-2, 0-3, 0-4, bucle se acaba y i ahora vale 1
                if(arregloSelection[i] < arregloSelection[j]){ //comparar posiciones i con j //intercambio: necesito auxiliar si o SI
                    int aux = arregloSelection[i];
                    arregloSelection[i] = arregloSelection[j]; //i se guarda en j, 
                    arregloSelection[j] = aux; //j se guarda en i   ---- INTERCAMBIO
                }
            }
        }
    }
}
