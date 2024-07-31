package packageDynamicArray;

public class DynamicArray {
    int size;
    int capacity = 10;
    Object[] array;

    public DynamicArray() {
        // instantiate new fixed size array
        this.array = new Object[capacity];

    }
    // in case user passes own capacity to set
    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }
    public void add(Object data){
        // check to see if we are at capacity
        if(size >= capacity){
            // expand the size of array
            grow();
        }
        array[size] = data;
        size++;

    }
    public void insert(int index, Object data){

    }
    public void delete(Object data){

    }
    public int search(Object data){
        return-1;
    }
    private void grow(){

    }
    private void shrink(){

    }
    public boolean isEmpty(){
        return size == 0;
    }
    public String toString(){
        // display elements of array
        String string = "";
        for (int i = 0; i < capacity; i++) {
            string += array[i] + ", ";
        }
        // check to see if string is not equal to empty string
        if(string != ""){
            // if elements are to display
            string = "[" + string.substring(0, string.length() - 2) + "]";
        }
        else {
            string = "[]";
        }
        //return null;
        return string;
    }
}
