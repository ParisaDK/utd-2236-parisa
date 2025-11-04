
package myds;

class MyArrayList<E> {
    
    public Object[] list;
    private int size = 0; //current # of elements
    private int capacity; //maximum # of elements that list can hold
    
    // constructors
    
    public MyArrayList(){ //default capacity
        this(4);
    }
    
    public MyArrayList(int initialCap){
        this.capacity = Math.max(1, initialCap);
        this.list = new Object[this.capacity];
    }
    
    // basic queries
    
    public int getSize(){
        return size;
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    public int capacity(){
        return capacity;
    }
    
    //O(n) worst case, O(1) amortized
    private void resize(int newCap){
        
        if(newCap > 0){
            this.capacity = newCap;
            
            Object[] temp = list;
            
            list = new Object[this.capacity];
            
            for(int i = 0; i < this.size; i++){
                list[i] = temp[i];
            }
            
        }
            
            
    }
    //O(n) worst, O(1) amortized
    public void addLast(E x){
        
        if(size == capacity){
            resize( 2 * this.capacity);
        }
        
        list[size++] = x;
    }
    
    
    public void addAt(E x, int index){
        
        if(this.size == this.capacity){
            resize(2 * this.capacity);
        }
        
        for(int i = this.size - 1; i >= index; i--){
            list[i+1] = list[i];
        }
        
        list[index] = x;
        size++;
        
    }
    
    public E removeLast(){
        if(isEmpty()) return null;
        E val = (E) list[size-1];
        size= size-1;
        
        list[size] = null;
        
        if(size > 0 && size <= this.capacity / 4) {
            resize(Math.max(1, capacity/2));
            
        }
        
        return val;
    }
    
    public E removeAt(int index){ //O(n)
        E val = (E) list[index];
        
        for(int i = index + 1; i < this.size ;i++){
            list[i-1] = list[i];
        }
        list[size-1] = null;
        size = size - 1;
        
        if (size > 0 && size <= capacity / 4) {
            resize(Math.max(1, capacity / 2));
        }
        return val;
    }
    
    public int find(E key) { //O(n) linear search
        for(int i = 0; i < this.size; i++){
            if(list[i].equals(key)){
                return i;
            }
        }
        return -1; // unsuccessful find
    }
    
    public boolean search(E key){
        return find(key) > -1;
    }
    
    public E getElement(int index){
        if(index > 0 && index < this.size){
            return (E) list[index];
        }
        return null;
    }
}
    
