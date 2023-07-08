import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Clase ProcessArrayInteger
//Clase hija que hereda de la clase ProcessArray.
//En esta clase se establece el como y la forma en que


public class ProcessArrayInteger extends  ProcessArray  {
    public ProcessArrayInteger() {
    }

    public ProcessArrayInteger(int[] intArray, int size) {
        super(intArray, size);
    }


    public ProcessArrayInteger(int[] intArray, int intValue, int size) {
        super(intArray, intValue, size);
    }


    //Meodo que convierte un arreglo de enteros a una ArrayLIst
    @Override
    public ArrayList convertArrayList() {

        int t = this.intArray.length;
        List<Integer> listaInteger = new ArrayList<>();


        ArrayList<Integer> l = new ArrayList<> ();

        for (int i: this.intArray){
            l.add(i);
        }


        return l;


    }
//Método que caclula la media de toodos los valores contenidos en el arreglo.
    @Override
    public int calculateMedia() {

        System.out.println("El valor de la media ha sido calculado");
        return 0;
    }


    //Método que imprime en pantalla los valores de un arreglo dago.
    @Override
    public  void displayArray(int[] ia) {
      int t = ia.length;
      List<Integer> listaInteger = new ArrayList<>();

        for (int val: ia){
           listaInteger.add(val);

        }

        System.out.println(" " + listaInteger);


    }


    // Encuentra y retorna el mayor valor de los elementos de un arreglo dado.
    @Override
    public int maximumVAlue() {

        int[] output = new int[size + 1];

        int max = intArray[0];
        for (int i = 1; i < size; i++) {
            if (intArray[i] > max)
                max = intArray[i];
        }
        System.out.println("El elemento mas grande es "+  max);
        return  max;


    }



}
