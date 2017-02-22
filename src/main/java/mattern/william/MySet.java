package mattern.william;

/**
 * Created by williammattern on 2/22/17.
 */
public class MySet<T> {
    protected MySetNode<T> start;
    protected MySetNode<T> end;
    protected int size;

    public MySet(){
        start = null;
        end = null;
        size = 0;
    }

    public static class MySetNode<T> {
        private T data;
        private MySetNode next;

        public MySetNode(){
            this.next = null;
            this.data = null;
        }

        public MySetNode(T data){
            this.data = data;
            this.next = null;
        }

        public MySetNode(T data, MySetNode next){
            this.data = data;
            this.next = next;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public MySetNode getNext() {
            return next;
        }

        public void setNext(MySetNode next) {
            this.next = next;
        }
    }


    public boolean isEmpty(){
        return start == null;
    }

    public int size(){
        return size;
    }

    private void insertFirstNode(T data){
        MySetNode<T> newNode = new MySetNode<T>(data);
        newNode.setNext(start);
        start = newNode;
    }

    public MySetNode<T> removeFirstNode(){
        MySetNode<T> refNode = start;
        if(!isEmpty()){
            start = start.getNext();
        } else {
            //System.out.println("Empty Set");
        }
        return refNode;
    }

    private MySetNode<T> findSetNode(T t){
        MySetNode<T> refNode = start;

        if(!isEmpty()){
            while(!refNode.getData().equals(t)){
                if(refNode.getNext() == null){
                    return null;
                } else {
                    refNode = refNode.getNext();
                }
            }
        } else {
            //System.out.println("Empty Set");
        }
        return refNode;
    }

    public boolean contains(T t){
        if(findSetNode(t) == null){
            return false;
        } else
            return true;
    }

    public boolean add(T t){
        if(contains(t)) {
            return false;
        } else {
            insertFirstNode(t);
            size++;
            return true;
        }
    }

    public void clear(){
        this.start = null;
        this.size = 0;
    }

    public boolean remove(T t){
        MySetNode<T> currentNode = start;
        MySetNode<T> previousNode = start;

        while(!currentNode.getData().equals(t)){
            if(currentNode.getNext() == null){
                return false;
            } else {
                previousNode = currentNode;
                currentNode = currentNode.getNext();
            }
        }//actual removing of node done below
        if(currentNode == start){
            start = start.getNext();
        } else {
            previousNode.setNext(currentNode.getNext());
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        MySetNode<T> theLink = start;
        while(theLink.getNext()!=null){
            stringBuilder.append(theLink.getData().toString()).append(", ");
            theLink = theLink.getNext();
        }
        stringBuilder.append(theLink.getData().toString());
        return stringBuilder.toString();
    }
}
