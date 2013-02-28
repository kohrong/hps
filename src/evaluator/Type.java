package evaluator;


public class Type<T> {
  
    public T value;

    public Type(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
    
}
