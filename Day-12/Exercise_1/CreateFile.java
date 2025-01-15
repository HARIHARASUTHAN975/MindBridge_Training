package  Exercise_1;
import java.io.*;
import java.util.*;
class CreateFile
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        try{
            String str=obj.nextLine();
            BufferedWriter bufferwriter=new BufferedWriter(new FileWriter("name.txt"));
            bufferwriter.write(str);
            bufferwriter.close();
        }
        catch(Exception e)
        {
            System.out.println("Error in writing the File");
            e.printStackTrace();
        }
        try
        {
        BufferedReader bufferreader=new BufferedReader(new FileReader("name.txt"));
            StringBuilder stringbuilder=new StringBuilder();
            String strs;
            while ((strs=bufferreader.readLine())!=null){
                stringbuilder.append(strs);
            }
            bufferreader.close();
            System.out.println(stringbuilder);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}