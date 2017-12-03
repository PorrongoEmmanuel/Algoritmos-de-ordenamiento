public class algoritmoOrdenamiento {

    int i, j, temporal;

    public algoritmoOrdenamiento() {
        this.i = 0;
        this.j = 0;
        this.temporal = 0;

    }

    //metodo burbuja
    public void burbuja1(int[] arreglo) {
        for (i = 0; i < arreglo.length; i++) {
            for (j = i + 1; j < arreglo.length; j++) {
                if (arreglo[i] > arreglo[j]) {
                    temporal = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temporal;
                }
            }
        }
    }

    //metodo burbuja2
    public void burbuja2(int[] arreglo) {

        for (i = 1; i < arreglo.length; i++) {
            for (j = 0; j < arreglo.length - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    temporal = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;
                }
            }
        }
    }

    //metodo radix
    public void radix(int[] arreglo) {
        int x, i, j;
        for (x = Integer.SIZE - 1; x >= 0; x--) {
            int auxiliar[] = new int[arreglo.length];
            j = 0;
            for (i = 0; i < arreglo.length; i++) {
                boolean mover = arreglo[i] << x >= 0;
                if (x == 0 ? !mover : mover) {
                    auxiliar[j] = arreglo[i];
                    j++;

                } else {
                    arreglo[i - j] = arreglo[i];
                }
            }
            for (i = j; i < auxiliar.length; i++) {
                auxiliar[i] = arreglo[i = j];

            }
            arreglo = auxiliar;

        }
        System.out.print("el arreglo ordenado con radix");
        mostrarArreglo(arreglo);
    }

    // metodo quick
    //mostrar los datos del vector

    public void quick(int[] arreglo, int primero, int ultimo) {
        int i, j, pivote, auxiliar;
        i = primero;
        j = ultimo;
        pivote = arreglo[(primero + ultimo) / 2];
        System.out.println("el pivote es: " + pivote);
        do {
            while (arreglo[i] < pivote) {
                i++;
            }
            while (arreglo[j] > pivote) {
                j--;
            }
            if (i <= j) {
                auxiliar = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = auxiliar;
                i++;
                j--;

            }


        } while (i <= j);
        if (primero < j) {
            quick(arreglo, primero, j);

        }
        if (i < ultimo) {
            quick(arreglo, i, ultimo);
        }
        mostrarArreglo(arreglo);

    }

    //metodo para inserccion
    public void inserccion(int[] arreglo, int n) {
        int i, j, auxiliar;
        for (i = 1; i < n; i++) {
            auxiliar = arreglo[i];
            j = i - 1;
            while (j > 0 && arreglo[j] > auxiliar) {
                arreglo[j + 1] = arreglo[j];
                j = j - 1;
            }
            arreglo[j + 1] = auxiliar;
        }
        System.out.println("Arreglo ordenado por inserccion ");
        mostrarArreglo(arreglo);
    }



    //metodo  shell
    public void shell(int[] arreglo){
        int salto, i, j , k, auxiliar;
        salto=arreglo.length/2;
        while (salto>0){
            for(i= salto; i<arreglo.length; i++){
                j=i-salto;
                while (j>=0){
                    k=j+salto;
                    if (arreglo[j]<=arreglo[k]){
                        j=-1;

                    }else{
                        auxiliar=arreglo[j];
                        arreglo[j]=arreglo[k];
                        arreglo[k]=auxiliar;
                        j-=salto;
                    }

                }

            }
            salto=salto/2;

            }
        System.out.println("Arreglo ordenado con Shell");
            mostrarArreglo(arreglo);
        }

        //metodo dintercalacion

    public void intercalacion(int []arregloA, int [] arregloB){
        int i,j,k;
        int arregloC[]=new int[arregloA.length+arregloB.length];
        //repetir mientras los arregls A Y B tengan elementos que comparar
        for(i=j=k=0;i<arregloA.length && j<arregloB.length; k++){
            if(arregloA[i]<arregloB[j]){
                arregloC[k]=arregloA[i];
                i++;

            }else{
                arregloC[k]=arregloB[j];
                j++;
            }
        }
        //para añadir  a arreglo c los elementos del arreglo A sobrantes n caso de haberlos
        for(;i<arregloA.length;i++, k++){
            arregloC[k]=arregloA[i];

        }

        //para añadir  a arreglo c los elementos del arreglo B sobrantes n caso de haberlos
        for(;j<arregloB.length;j++, k++){
            arregloC[k]=arregloB[j];

        }
        System.out.println("arreglos ordenados por intercalacion ");
        mostrarArreglo(arregloC);
    }

    // metodo mezcla directa

    public int []mezclaDirecta(int[]arreglo) {
        int i, j, k;
        if (arreglo.length > 1) {
            int nElementosIzq = arreglo.length / 2;
            int nElemnetosDer = arreglo.length - nElementosIzq;
            int arregloIzq[]=new int[nElementosIzq];
            int arregloDer[]=new int[nElemnetosDer];
            //COPIANDO LOS ELEMNTOS DE LA PARTE PRIMERA AL ARREGLO IZQUIERDO

            for(i=0; i<nElementosIzq; i++){
                arregloIzq[i]=arreglo[i];
            }
            //COPIANDO LOS ELEMNTOS DE LA PARTE SEGUNDA AL ARREGLO DERECHO

            for(i=nElementosIzq; i<nElementosIzq+nElemnetosDer; i++){
                arregloDer[i-nElementosIzq]=arreglo[i];
            }
            //recursividad
            arregloIzq=mezclaDirecta(arregloIzq);
            arregloDer=mezclaDirecta(arregloDer);
            i=0; j=0; k=0;

            while (arregloIzq.length !=j && arregloDer.length!=k){
                if(arregloIzq[j]<arregloDer[k]){
                    arreglo[i]=arregloIzq[j];
                    i++;
                    j++;
                }else{
                    arreglo[i]=arregloDer[k];
                    i++;
                    k++;
                }

            }
            //arreglo final
            while (arregloIzq.length!=j){
                arreglo[i]=arregloIzq[j];
                i++;
                j++;
            }
            while (arregloDer.length!=k){
                arreglo[i]=arregloDer[k];
                        i++;
                        k++;

            }
        }//fin if
        return arreglo;
    }
    //metodo mezcla natural
    public void mezclaNatural(int arreglo[]){
        int izquierda=0,izq=0,derecha=arreglo.length-1,der=derecha;
        boolean ordenado=false;
        do{
            ordenado=true;
            izquierda=0;
            while (izquierda<derecha){
                izq=izquierda;
                while (izq<derecha && arreglo[izq]<=arreglo[izq+1]){
                    izq++;

                }
                der=izq+1;
                while (der==derecha-1|| der<derecha && arreglo[der]<=arreglo[der+1]){


                }
                if(der<=derecha){
                    mezclaDirecta2(arreglo);
                    ordenado=false;

                }
                izquierda=izq;

            }
        }while (!ordenado);

    }
    //ordenamiento por mezcla directa 2

    public void mezclaDirecta2(int[]arreglo) {
        int i, j, k;
        if (arreglo.length > 1) {
            int nElementosIzq = arreglo.length / 2;
            int nElemnetosDer = arreglo.length - nElementosIzq;
            int arregloIzq[] = new int[nElementosIzq];
            int arregloDer[] = new int[nElemnetosDer];
            //COPIANDO LOS ELEMNTOS DE LA PARTE PRIMERA AL ARREGLO IZQUIERDO

            for (i = 0; i < nElementosIzq; i++) {
                arregloIzq[i] = arreglo[i];
            }
            //COPIANDO LOS ELEMNTOS DE LA PARTE SEGUNDA AL ARREGLO DERECHO

            for (i = nElementosIzq; i < nElementosIzq + nElemnetosDer; i++) {
                arregloDer[i - nElementosIzq] = arreglo[i];
            }
            //recursividad
            arregloIzq = mezclaDirecta(arregloIzq);
            arregloDer = mezclaDirecta(arregloDer);
            i = 0;
            j = 0;
            k = 0;

            while (arregloIzq.length != j && arregloDer.length != k) {
                if (arregloIzq[j] < arregloDer[k]) {
                    arreglo[i] = arregloIzq[j];
                    i++;
                    j++;
                } else {
                    arreglo[i] = arregloDer[k];
                    i++;
                    k++;
                }

            }
            //arreglo final
            while (arregloIzq.length != j) {
                arreglo[i] = arregloIzq[j];
                i++;
                j++;
            }
            while (arregloDer.length != k) {
                arreglo[i] = arregloDer[k];
                i++;
                k++;

            }
        }//fin if

    }









    public void mostrarArreglo(int[]arreglo){
        int k=0;
        for(k=0; k<arreglo.length;k++){
            System.out.print("["+arreglo[k]+"]");

        }
        System.out.println();
    }


}
