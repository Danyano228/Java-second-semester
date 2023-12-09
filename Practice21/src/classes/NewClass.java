package classes;
import java.util.ArrayList;
import java.util.List;

public class NewClass<T>{

    List<T> list = new ArrayList<T>();

    public void saveData(T[] elems) {
        for (T elem: elems) {
            list.add(elem);
        }
    }

    public List<T> getData(T[] elems) {
        return list;
    }

    public List<T> sToL(T[] elems) {
        List<T> list = new ArrayList<T>();
        for (T elem: elems) {
            list.add(elem);
        }
        return list;
    }
}
