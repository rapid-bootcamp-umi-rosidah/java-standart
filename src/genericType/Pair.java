package genericType;

public class Pair <T,N> {
    private T first;
    private N second;

    public Pair(T first, N second){
        this.first=first;
        this.second=second;
    }
    public T getFirst() {
        return first;
    }

    public N getSecond() {
        return (N) second;
    }
}

//notes
//E=Elemeny
//K=key
//N=Number
//T=Type
//V=Value
//SUV,etc=2nd, 3rd,4th types
