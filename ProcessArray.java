import java.util.ArrayList;

//Clase ProceessArray
//Clase Base para definir los metodos para diferentes procesos comunes u operaciones con Arreglos
public abstract class ProcessArray {

    int[] intArray;
    String[] strArray;
    int size;
    int intValue;
    int intLowerLimit;
    int intUpperLimit;


    public ProcessArray(int[] intArray, int size) {
        this.intArray = intArray;
        this.size = size;
    }

    public int getIntLowerLimit() {
        return intLowerLimit;
    }

    public void setIntLowerLimit(int intLowerLimit) {
        this.intLowerLimit = intLowerLimit;
    }

    public int getIntUpperLimit() {
        return intUpperLimit;
    }

    public void setIntUpperLimit(int intUpperLimit) {
        this.intUpperLimit = intUpperLimit;
    }

    String strValue;

    int index;

    public ProcessArray() {
    }


    public ProcessArray(int[] intArray, int intValue, int size) {
        this.intArray = intArray;
        this.intValue = intValue;
        this.size = size;

    }


    public ProcessArray(String[] strArray, int size, String strValue, int index) {
        this.strArray = strArray;
        this.size = size;
        this.strValue = strValue;
        this.index = index;
    }



    public int[] getIntArray() {
        return intArray;
    }

    public void setIntArray(int[] intArray) {
        this.intArray = intArray;
    }

    public String[] getStrArray() {
        return strArray;
    }

    public void setStrArray(String[] strArray) {
        this.strArray = strArray;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public String getStrValue() {
        return strValue;
    }

    public void setStrValue(String strValue) {
        this.strValue = strValue;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

// Convierte un areg
    public abstract ArrayList convertArrayList();
    public abstract int calculateMedia();

    public int[] orderArray() {
        return new int[0];
    }

    public  abstract void displayArray( int[] ia);

public abstract  int maximumVAlue();


}

