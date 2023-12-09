package classes;

public class NewClass<T, V, K>{
    T t;
    V v;
    K k;

    public NewClass(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public void printTypes() {
        System.out.println("Class{" +
                           "t=" + t.getClass().getName() +
                           ", v=" + v.getClass().getName() +
                           ", k=" + k.getClass().getName() +
                           '}');
    }
}
