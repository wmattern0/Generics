package mattern.william;

/**
 * Created by williammattern on 2/22/17.
 */
public class MySetNode<T> {
    private T data;
    private MySetNode next;

    public MySetNode(){
        this.next = null;
        this.data = null;
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
