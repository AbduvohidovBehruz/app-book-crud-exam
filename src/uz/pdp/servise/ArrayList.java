package uz.pdp.servise;

import java.util.Arrays;


public class ArrayList<E> {

    private Object[] array;

   private Integer size;


    public ArrayList(Integer length) {
        this.size = 0;
        array = new Object[length];
    }

    public ArrayList() {
        size = 0;
        array = new Object[10];
    }


    public Integer getSize() {
        return size;
    }

    public void setSize(Integer length) {
        this.size = length;
    }

    public boolean add(E element) {

        array[size++] = element;


        if (array.length == size) {

            Object[] array2 = new Object[2 * size];

            for (int i = 0; i < array.length; i++) {

                array[i] = array2[i];

            }

            array = array2;


        }
        return true;

    }

    public boolean remove (int index){

       if ( index < array.length ){

           for (int i = index; i < array.length-1; i++) {


               array[i] = array[i+1];

           }

           size--;

       }

       return true;

    }

    public E get (int index1) {

        E son = null;

        if (index1 > (size + 1)) {

            throw new IndexOutOfBoundsException("Xato qiymat");
        } else {

            for (int i = 0; i < array.length; i++) {

                  son  = (E) array[index1];

            }

        }
        return son;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

}
