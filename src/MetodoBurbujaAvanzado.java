public class MetodoBurbujaAvanzado {
    int arreglo[];
    public MetodoBurbujaAvanzado(int[] arreglo){
        this.arreglo = arreglo;
    }
    public void sort(boolean asc){ //<>
        int tam = arreglo.length;
        int contComparaciones = 0; //contador para cada cambio
        int contCambios = 0; //contador para cada interaccion de comparacion
        boolean huboIntercambios;
        for (int i = 0; i < tam-1; i++){ //-1 por el rango 
            huboIntercambios = false; //se bloquea cada que no hay intercambios, false: break 
            for(int j = 0; j < tam -1 -i; j++){
                contComparaciones++;
                if (arreglo[j] > arreglo[j+1]){
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;} 
                    //sort es para odenar ascendentemente o descendentemente
                if (asc){
                    //true -- ascendente
                    if (arreglo[j] > arreglo[j+1]){
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;}
                    huboIntercambios = true;
                }
                else{
                    //false descendente
                    if (arreglo[j] < arreglo[j+1]){
                        contCambios++;
                        int aux = arreglo[j];
                        arreglo[j] = arreglo[j+1];
                        arreglo[j+1] = aux;
                        huboIntercambios = true; }   
                }
                if (!huboIntercambios){ //no hay intercambios significa que todo está ordenado, si todo está ordenado detengo el
                    //bucle, porque de lo contrario voy a estar ordenando cosas que ya ordené
                    break;
                }
                }
                }
        System.out.println("Comparaciones: " + contComparaciones);
        System.out.println("Cambios: " + contCambios);
    }
    public void printArreglo(){
        for (int valor: arreglo){
            System.out.print(valor + ", ");
        }
        System.out.println();
    }
    }