import java.util.ArrayList;

//Clase  Principal para instanciar objetos del tipo ArraySearchSort

public class Main {
    public static void main(String[] args) {


        int[] intData = {9, 2, 6, 5, 1, 4, 3}; // Arreglo para ordenamiento por conteo
        int[] intData2 = {7, 20, 30, 35, 47, 58, 96, 111, 125, 137,}; //arreglo para búsqueda binaria
        int size = intData.length;
        int size2 = intData2.length;
        int vm = 0;
        int val = 111;
        int[] count;
        int[] index;
        int[] orderedData;
        int position = 0;


        ArraySearchSort acs = new ArraySearchSort(intData, size);

        ArraySearchSort acss2 = new ArraySearchSort(intData2, val, size2);


    /*    ArrayList<Integer> al = new ArrayList<>();
        al = acs.convertArrayList();
        System.out.println("El arraylist es " + al);
*/
/*

        vm = acs.maximumVAlue();
        count = acs.createCount(vm);
        System.out.print("El arreglo count es:");
        acs.displayArray(count);
        index = acs.createIndex(count);

        orderedData = acs.transferData(index);
        System.out.print("El arreglo index o pos es:");
        acs.displayArray(orderedData);

        System.out.print("El arreglo ordenado es:");
        acs.displayArray(orderedData);
*/

        //// Ejemplo para buscqueda  binaria con el arreglo    intData2 = {7,20,30,35,47,58, 96,111,125,137,};

acss2.findRange(acss2.maximumVAlue());


position = acss2.BinarySearch(acss2.intLowerLimit,acss2.intUpperLimit);

        System.out.println("El valor " + val + " se encuentra en la posicón: " + position);



    }
}