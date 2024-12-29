package Arrays.Easy.EasyExploreCard;

public class ArrayDemo {
    static int length = 0;
    static int capacity = 10;
    static int[] arr = new int[capacity];



    public ArrayDemo() {

    }
    public static void insert(int value){
        if (length == capacity)
            throw new IndexOutOfBoundsException("Array is full");
        arr[length] = value;
        length++;
    }
    public static void insert(int index, int value) {
        if (length == capacity)
            throw new IndexOutOfBoundsException("Array is full");
        if (index >= capacity)
            throw new IndexOutOfBoundsException("IndexOutOfBoundsException error");
        for (int i = length - 1; i >= index ; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = value;
        length++;
    }

    public static void main(String[] args) {
        insert(7);
        insert(8);
        insert(9);
        insert(1);
        insert(2);
        insert(5);
        insert(5);
        System.out.println("Array before insertion");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        insert(7, 10);
        System.out.println("Array after insertion");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}