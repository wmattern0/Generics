package mattern.william;


import java.util.Arrays;

public class MyArrayList<T> {
    private Object[] data;
    private int size;
    private final int DEFAULT_SIZE = 10;
    private final Object[] EMPTY_DATA_ARRAY = {};


    public MyArrayList(){
        size = 0;
        data = new Object[DEFAULT_SIZE];
    }

    public MyArrayList(int initialSize) throws IndexOutOfBoundsException{
        if (initialSize > 0) {
            size = 0;
            data = new Object[initialSize];
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public boolean isEmpty(){
        return size == 0;
    }

    private void ensureCapacity(int minimumSize){
        if(data.length < minimumSize){
            grow(minimumSize);
        }
    }

    private void grow(int minimumSize){
        if(data == EMPTY_DATA_ARRAY){
            data = new Object[DEFAULT_SIZE];
        } else {
            Arrays.copyOf(data, minimumSize);
        }
    }

    public void add(T t){
        ensureCapacity(size + 1);
        data[size++] = t;
    }

    public void add(int index, T t){
        this.set(index, t);
        return;
    }

    public T remove(int index){
        return null;
    }

    public T get(int index){
        return (T)data[index];
    }

    public void set(int index, T t){
        if(index > 0){
            if(index > size) {
                ensureCapacity(index);
                data[index] = t;
            } else {
                data[index] = t;
            }
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public void clear(){
        data = EMPTY_DATA_ARRAY;
        size = 0;
        return;
    }

    public boolean contains(T t){
        for (Object dataItem: data){
            if(t.equals((T)dataItem)){
                return true;
            }
        }
        return false;
    }
}
