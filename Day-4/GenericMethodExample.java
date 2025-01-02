public class GenericMethodExample
{
    public static<T>void printArray(T[] array)
    {
        for(T element:array)
        {
            System.out.print(element+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String[] stringArray={"Apple", "Banana", "Cherry"};
        System.out.println("String Array:");
        printArray(stringArray);

        Integer[] intArray={10,20,30,40};
        System.out.println("Integer Array:");
        printArray(intArray);

        Double[] doubleArray={1.1,2.2,3.3,4.4};
        System.out.println("Double Array:");
        printArray(doubleArray);
    }
}
