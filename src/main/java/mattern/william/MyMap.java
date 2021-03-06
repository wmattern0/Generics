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

        public MyMapNode(K key, V value){
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public MyMapNode getNext() {
            return next;
        }

        public void setNext(MyMapNode next) {
            this.next = next;
        }
    }

    public boolean isEmpty(){
        return size ==0;
    }

    public int size(){
        return size;
    }

    public V putFirstNode(K key, V value){
        MyMapNode<K,V> newNode = new MyMapNode<K, V>(key, value);
        newNode.setNext(start);
        start = newNode;
        size++;
        return value;
    }

    public V get(K key){
        if(isEmpty()){
            throw new NullPointerException();
        }
        MyMapNode theNode = findMyMapNode(key);
        return (V)theNode.getValue();
    }

    public V put(K key, V value){
        MyMapNode<K,V> theNode = findMyMapNode(key);
        if(theNode!=null){
            if(!theNode.getValue().equals(value)){
                theNode.setValue(value);
            }
            return value;
        } else {
            return putFirstNode(key, value);
        }
    }

    private MyMapNode<K,V> findMyMapNode(K key){
        MyMapNode theNode = start;
        if(!isEmpty()){
            while(!theNode.getKey().equals(key)){
                if(theNode.getNext() == null){
                    return null;
                } else {
                    theNode = theNode.getNext();
                }
            }
        } else {
            //System.out.println("Empty Map");
        }
        return theNode;
    }

    public void clear(){
        start = null;
        size = 0;
    }

    public V remove(K key){
        MyMapNode<K,V> currentNode = start;
        MyMapNode<K,V> previousNode = start;
        while(!currentNode.getKey().equals(key)){
            if(currentNode.getNext() == null){
                return null;
            } else {
                previousNode = currentNode;
                currentNode = currentNode.getNext();
            }
        }//actual removing done below
        if(currentNode == start){
            start = start.getNext();
        } else {
            previousNode.setNext(currentNode.getNext());
        }
        size--;
        return currentNode.getValue();
    }
}
