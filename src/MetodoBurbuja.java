public class MetodoBurbuja {
    int[] arreglo; //var. GLOBAL

    public MetodoBurbuja(int[] arreglo){ //Constructor: construye la instancia de una clase
        System.out.println("Se creó la clase MetodoBurbuja");
        // Instanciar con valor desde parámetro (2da forma)
        //constructor vacío: no cuando no tiene código, sino cuando no tiene parámetros
        this.arreglo = arreglo; //this -- referencia a la instancia
    }
    public void ordenarAscendente(){
        for(int i = 0; i<arreglo.length; i++){ //el i =0
            for(int j = i+1; j < arreglo.length; j ++){ //con todas las js   0-1, 0-2, 0-3, 0-4, bucle se acaba y i ahora vale 1
                if(arreglo[i] > arreglo[j]){ //comparar posiciones i con j //intercambio: necesito auxiliar si o SI
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j]; //i se guarda en j, 
                    arreglo[j] = aux; //j se guarda en i   ---- INTERCAMBIO
                }
            }
        }
    }
    public void imprimirArreglo(){
        for(int num: arreglo){ //se usa for each cuando no se trabaja con posiciones
            System.out.print(num + ", ");
        }
        System.out.println();
    }
    public void ordenarDescendente(){
        for(int i = 0; i<arreglo.length; i++){ //el i =0
            for(int j = i+1; j < arreglo.length; j ++){ //con todas las js   0-1, 0-2, 0-3, 0-4, bucle se acaba y i ahora vale 1
                if(arreglo[i] < arreglo[j]){ //comparar posiciones i con j //intercambio: necesito auxiliar si o SI
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j]; //i se guarda en j, 
                    arreglo[j] = aux; //j se guarda en i   ---- INTERCAMBIO
                }
            }
        }
    }   //NO CONSTRUCTOR: asume constructor VACÍO
}     
