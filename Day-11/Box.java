public class Box<T> {
    private T item;
    public void setItem(T item) {
        this.item=item;
    }
    public T getItem() {
        return item;
    }
    public void printItem() {
        if (item!=null)
            System.out.println("Item: " + item.toString());
        else
            System.out.println("The box is empty.");
    }
    public boolean isTypeOf(Class<?> type) {
        return item!=null && type.isInstance(item);
    }
    public static void main(String[] args) {
        Box<String> stringBox=new Box<>();
        stringBox.setItem("Hello, Generics!");
        stringBox.printItem();
        System.out.println("Is String: "+stringBox.isTypeOf(String.class));
        System.out.println("Is Integer: "+stringBox.isTypeOf(Integer.class));
        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(42);
        integerBox.printItem();
        System.out.println("Is Integer: "+integerBox.isTypeOf(Integer.class));
        System.out.println("Is Double: "+integerBox.isTypeOf(Double.class));
        class CustomClass
        {
            @Override
            public String toString()
            {
                return "I am a customing the class.";
            }
        }
        Box<CustomClass> customBox=new Box<>();
        customBox.setItem(new CustomClass());
        customBox.printItem();
        System.out.println("CustomClass : "+customBox.isTypeOf(CustomClass.class));
        System.out.println("String : "+customBox.isTypeOf(String.class));
    }
}
