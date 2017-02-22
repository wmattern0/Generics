package mattern.william;


public class MyArrayList<T> {
    private Object[] data;
    private int size;
    private final int DEFAULT_SIZE = 10;
    private final Object[] EMPTY_DATA_ARRAY = {};


    public MyArrayList(){
        size = 0;
        data = new Object[DEFAULT_SIZE];
    }

    public MyArrayList(int initialSize){
        size = 0;
        data = new Object[initialSize];
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
        }
    }

    public void add(T t){
        ensureCapacity(size++);
        return;
    }

    public void add(int index, T t){
        this.set(index, t);
        return;
    }

    public T remove(int index){
        return null;
    }

    public T get(int index){
        return null;
    }

    public void set(int index, T t){
        return;
    }

    public void clear(){
        data = EMPTY_DATA_ARRAY;
        size = 0;
        return;
    }

    public boolean contains(T t){
        return false;
    }
}
