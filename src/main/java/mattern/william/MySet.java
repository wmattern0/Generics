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


}
