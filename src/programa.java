import javax.swing.*;

public class programa {

    public static void main(String[]args){
        algoritmoOrdenamiento ordenar= new algoritmoOrdenamiento();
        int vector1[]={5,6,3,44,22,1};
        int vector2[]={55,4,43,44,2,10,4567,638,0,-5,-9};
        int vector3[]={5,2,1,8,3,9,7};
        /*System.out.println("arreglo original ");
        ordenar.mostrarArreglo(vector1);

        System.out.println("arreglo ordenado con burbuja 1");
        ordenar.burbuja1(vector1);
        ordenar.mostrarArreglo(vector1);*/



        //System.out.println("arreglo original ");
        /*ordenar.mostrarArreglo(vector2);
        System.out.println("arreglo original ");
        System.out.println("arreglo ordenado con radix es: ");
        ordenar.burbuja1(vector2);
        ordenar.mostrarArreglo(vector2);
        ordenar.mostrarArreglo(vector2);
        ordenar.mostrarArreglo(vector3);
        System.out.println("arreglo ordenado con quick ");
        ordenar.quick(vector3,0,vector3.length-1);*/

        /*int tam;
        tam=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el tamaño del vector"));
        int vectorcito[]=new int[tam];
        for (int i=0; i<tam; i++){
            vectorcito[i]=Integer.parseInt(JOptionPane.showInputDialog(null,
                    "ingresa el elemento del indice"+i));

            ordenar.inserccion(vectorcito,i+1);
        }*/

        //System.out.println("arreglo original ");
        //ordenar.mostrarArreglo(vector3);
        //ordenar.shell(vector3);

        /*System.out.println("arreglo  vector1 original ");
        ordenar.mostrarArreglo(vector1);

        System.out.println("arreglo  vector2 original ");
        ordenar.mostrarArreglo(vector2);
        ordenar.burbuja1(vector1);
        ordenar.burbuja1(vector2);
        ordenar.intercalacion(vector1,vector2);*/


       /* System.out.println("arreglo  vector2 original ");
        ordenar.mostrarArreglo(vector2);
        System.out.println("arreglo  vector2  ordenado por mezcla directa ");
        vector2=ordenar.mezclaDirecta(vector2);
        ordenar.mostrarArreglo(vector2);*/

        System.out.println("arreglo  vector2 original ");
        ordenar.mostrarArreglo(vector2);
        System.out.println("arreglo  vector2  ordenado por mezcla natural ");
        ordenar.mezclaNatural(vector2);
        ordenar.mostrarArreglo(vector2);









    }
}
