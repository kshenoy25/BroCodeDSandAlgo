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
        // grow our array
        if (size>=capacity){
            grow();
        }
        // shift elements to the right to make room for the insertion
        for(int i = size-1; i > index; i--){
            array[i] = array[i-1];
        }

        array[index] = data;
        // increment size by 1
        size++;
    }
    public void delete(Object data){
        for (int i = 0; i < size; i++) {
            if (array[i] == data){
                // nested for loop to shift all elements to the left
                for(int j = 0; j < (size - i -1); j++){
                    // where we make deletion we shift all elements after wards one spot to the left
                    array[i + j] = array[i + j+1];
                }
                array[size - i - 1] = null;
                // decrement by 1
                size--;
                // shrinking our array | checking to see if size falls below certain criteria
                if(size <= (int) (capacity/3)){
                    shrink();
                }
                break;
            }

        }

    }
    public int search(Object data){
        for(int i = 0; i < size; i++){
            // searching for data we pass
            if(array[i] == data ){
                return i;
            }
        }
        // element was not found
        return-1;
    }
    private void grow(){
        int newCapacity = (int) (capacity * 2);
        // instantiate a new array
        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < size; i++) {

            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }
    private void shrink(){
        int newCapacity = (int) (capacity / 2);
        // instantiate a new array
        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < size; i++) {

            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;

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
