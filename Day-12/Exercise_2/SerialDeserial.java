package Exercise_2;
import java.io.*;
public class SerialDeserial
{
    public static void main(String[] args) {
        SerialDeserial serdes=new SerialDeserial();
        serdes.Serial();
        serdes.DeSerial();
    }
    public void Serial(){
        ObjectOutputStream output=null;
        try{
            ExeObject exeout=new ExeObject("Hariharasuthan M",142);
            output=new ObjectOutputStream(new FileOutputStream("\"D:\\Learning\\Programming\\Java MindBridge Training\\MindBridge_Training-main\\Day-12\\src\\Exercise_2\\Example.txt\""));
            output.writeObject(exeout);
            System.out.println("Objects are Successfully Serialized");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if(output!=null)
                output.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
    public void DeSerial()
    {
        ObjectInputStream objin=null;
        try
        {
            objin=new ObjectInputStream(new FileInputStream("\"D:\\Learning\\Programming\\Java MindBridge Training\\MindBridge_Training-main\\Day-12\\src\\Exercise_2\\Example.txt\""));
            ExeObject eo=(ExeObject)objin.readObject();
            System.out.println("Objects are Successfully DeSerialized");
            System.out.println(eo.getName());
            System.out.println(eo.getId());

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if(objin!=null)
                    objin.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
