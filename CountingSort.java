
//interface para definir los métodos utilizados en el algoritmo de ordenamiento por conteo


public interface CountingSort {
// metodo para crear arreglo Count
    public int[]  createCount(int max );
//método para crear el arreglo index que tendra las posiciones finales de cada elemento
    public int[] createIndex(int[] count);

// metodo para transferir al arrayfinal y retornarlo
    public  int[] transferData(int[] output);
}
