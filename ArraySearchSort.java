import java.util.ArrayList;

//Clase ArraySerchSort
//Clase hija que hereda de la clase ProcessArrayInteger e implementa las interfaces CountingSort y Exponencial Search

public class ArraySearchSort extends ProcessArrayInteger implements CountingSort , ExponencialSearch{
    public ArraySearchSort() {
    }

    public ArraySearchSort(int[] intArray, int size) {
        super(intArray, size);
    }


    public ArraySearchSort(int[] intArray, int intValue, int size) {
        super(intArray, intValue, size);
    }


    //Metodo utilizado para el proceso de ordenamiento por conteo
    //Crear un arreglo que almacena el numero de veces en que un valor esta contenido en el arregllo
    //luego este arreglo es modificado  desde su segundo elemento incrementandolo con el valor de su elmento inmedianto anterior

    @Override
    public int[] createCount(int max) {

        int[] count = new int[max + 1];

        // Inicializar todos los elementos del array con ceros.
        for (int i = 0; i < max; ++i) {
            count[i] = 0;
        }

        // Almacena la cuenta de cada elemento
        for (int i = 0; i < size; i++) {
            count[intArray[i]]++;
        }

        // Almacena la cuenta acumulativa de cada elemento
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        return count;



       // return new int[0];
    }


    //Encuenta el indice de cada elemento of el arreglo original in el arreglo count
    //y coloca los elementos en el arreglo de salida
    @Override
    public int[] createIndex(int[] count) {

        int[] output = new int[size + 1];


        for (int i = size - 1; i >= 0; i--) {
            output[count[intArray[i]] - 1] = intArray[i];
            count[intArray[i]]--;
        }
        return output;



    }


    //Transfiere al array final con el mismo numero de elemento al arreglo final que será retornado.
    @Override
    public int[] transferData(int[] output) {
        int[] tidyArray = new int[size];

        //Copia los elementos ordenados dentro del array
        for (int i = 0; i < size; i++) {
            tidyArray[i] = output[i];
        }

        return tidyArray;
    }

    @Override
    public void findRange(int max) {

        // Find range for binary search by repeatedly doubling i
        int n =0 ;
        ArrayList<Integer> listData = new ArrayList<>();
        listData = this.convertArrayList();
        n = this.size;
        int i = 1;
        while (i < n && listData.get(i) < this.intValue)
            i *= 2;

        int left = i / 2;
        int right = Math.min(i, n - 1);
        this.intLowerLimit= left;
        this.intUpperLimit = right;


        System.out.println("El rango es: " + listData);
        System.out.println("El límite inferior es: " + left);
        System.out.println("El límite superior es: " + right);

    }

    @Override
    public int BinarySearch(int l, int r) {
        this.intLowerLimit = l;
        this.intUpperLimit = r;

        ArrayList<Integer> listaData ;
        listaData = this.convertArrayList();


        while (this.intLowerLimit <= this.intUpperLimit) {
            int mid = (this.intLowerLimit + this.intUpperLimit) / 2;  // finding mid

            if (listaData.get(mid) == this.intValue)
                return mid;
            else if (listaData.get(mid) < this.intValue)
                this.intLowerLimit = mid + 1;

            else
                this.intUpperLimit = mid - 1;
        }

        return -1;



    }
}
