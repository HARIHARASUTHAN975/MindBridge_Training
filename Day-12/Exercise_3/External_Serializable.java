package Exercise_3;
import java.io.*;
public class External_Serializable {
    public static void main(String[] args) {
        External_Serializable serdes = new External_Serializable();
        serdes.Serial();
        serdes.DeSerial();
    }
    public void Serial() {
        ObjectOutputStream outstr = null;
        try {
            ExeObject exeobj = new ExeObject("Hariharasuthan M", 142);
            outstr = new ObjectOutputStream(new FileOutputStream("\"D:\\Learning\\Programming\\Java MindBridge Training\\MindBridge_Training-main\\Day-12\\src\\Exercise_2\\Example.txt\""));
            outstr.writeObject(exeobj);
            System.out.println("Objects are Serialized Successfully ");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (outstr != null)
                    outstr.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void DeSerial() {
        ObjectInputStream objin= null;
        try {
            objin = new ObjectInputStream(new FileInputStream("\"D:\\Learning\\Programming\\Java MindBridge Training\\MindBridge_Training-main\\Day-12\\src\\Exercise_2\\Example.txt\""));
            ExeObject exeobj = (ExeObject) objin.readObject();
            System.out.println("Objects are Successfully DeSerialized");
            System.out.println(exeobj.getName());
            System.out.println(exeobj.getId());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (objin != null)
                    objin.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
