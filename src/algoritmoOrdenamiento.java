public class algoritmoOrdenamiento {

    int i,j,temporal;

    public algoritmoOrdenamiento(){
        this.i=0;
        this.j=0;
        this.temporal=0;

    }
    //metodo burbuja
    public void burbuja1(int[]arreglo){
        for(i=0; i<arreglo.length; i++){
            for (j=i+1; j<arreglo.length; j++){
                if(arreglo[i]>arreglo[j]){
                    temporal=arreglo[i];
                    arreglo[i]=arreglo[j];
                    arreglo[j]=temporal;
                }
            }
        }
    }
    //metodo burbuja2
    public void burbuja2(int[]arreglo){

        for(i=1; i<arreglo.length; i++){
            for (j=0; j<arreglo.length-1; j++){
                if(arreglo[j]>arreglo[j+1]){
                    temporal=arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=temporal;
                }
            }
        }
    }
    //metodo radix
    public void radix(int[]arreglo){
        int x, i,j;
        for(x=Integer.SIZE-1; x>=0; x--){
            int auxiliar[]= new  int[arreglo.length];
            j=0;
            for (i=0; i<arreglo.length; i++){
                boolean mover=arreglo[i]<<x>=0;
                if (x==0? !mover:mover){
                    auxiliar[j]=arreglo[i]; j++;

                }else {
                    arreglo[i-j]=arreglo[i];
                }
            }
            for (i=j; i<auxiliar.length;i++){
                auxiliar[i]= arreglo[i=j];

            }
            arreglo=auxiliar;

        }
        System.out.print("el arreglo ordenado con radix");
        mostrarArreglo(arreglo);
    }

    // metodo quick
    //mostrar los datos del vector

    public void quick(int[]arreglo, int primero, int ultimo){
        int i,j,pivote,auxiliar;
        i=primero;
        j=ultimo;
        pivote=arreglo[(primero+ultimo)/2];
        System.out.println("el pivote es: "+pivote);
        do{
            while (arreglo[i]<pivote){
                i++;
            }
            while (arreglo[j]>pivote){
                j--;
            }
            if (i<=j){
                auxiliar=arreglo[i];
                arreglo[i]=arreglo[j];
                arreglo[j]=auxiliar;
                i++;
                j--;

            }


        }while (i<=j);
        if(primero<j){
            quick(arreglo,primero,j);

        }
        if(i<ultimo){
            quick(arreglo,i,ultimo);
        }
        mostrarArreglo(arreglo);

    }
    //metodo para inserccion
    public void inserccion(int [] arreglo, int n){
        int i,j, auxiliar;
        for(i=1; i<n; i++){
            auxiliar=arreglo[i];
            j=i-1;
            while (j>0 && arreglo[j]>auxiliar){
                arreglo[j+1]=arreglo[j];
                j=j-1;
            }
            arreglo[j+1]=auxiliar;
        }
        System.out.println("Arreglo ordenado por inserccion ");
        mostrarArreglo(arreglo);
    }


    public void mostrarArreglo(int[]arreglo){
        int k=0;
        for(k=0; k<arreglo.length;k++){
            System.out.print("["+arreglo[k]+"]");

        }
        System.out.println();
    }


}
