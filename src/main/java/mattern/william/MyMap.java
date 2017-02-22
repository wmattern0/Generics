package mattern.william;

public class MyMap<K, V> {

    protected MyMapNode<K, V> start;
    protected MyMapNode<K, V> end;
    private int size;

    public MyMap(){
        start = null;
        end = null;
        size = 0;
    }

    public static class MyMapNode<K,V>{
        private K key;
        private V value;
        private MyMapNode next;


    }



}
