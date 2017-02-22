package mattern.william;

/**
 * Created by williammattern on 2/22/17.
 */
public class MySet<T> {
    protected MySetNode<T> start;
    protected MySetNode<T> end;
    public int size;

    public MySet(){
        start = null;
        end = null;
        size = 0;
    }


    public boolean isEmpty(){
        return start == null;
    }

    public int size(){
        return size;
    }

    public void insertFirstNode(T data){
        MySetNode<T> newNode = new MySetNode<T>(data);
        newNode.setNext(start);
        start = newNode;
    }

    public MySetNode<T> removeFirstNode(){
        MySetNode<T> refNode = start;
        if(!isEmpty()){
            start = start.getNext();
        } else {
            System.out.println("Empty Set");
        }
        return refNode;
    }

    public MySetNode<T> findSetNode(T t){
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
            System.out.println("Empty Set");
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
        return false;
    }
}
