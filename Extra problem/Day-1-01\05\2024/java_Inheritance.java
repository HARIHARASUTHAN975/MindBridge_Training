public class java_Inheritance {
    class Arithmetic
    {
        public int add(int num1,int num2)
        {
            return num1+num2;
        }
    }
    class Adder extends Arithmetic
    {

    }
    public static void main(String args[])
    {
        Adder adder=new Adder();
        System.out.println(adder.add(10,20)+" "+adder.add(20,30));
    }

}

