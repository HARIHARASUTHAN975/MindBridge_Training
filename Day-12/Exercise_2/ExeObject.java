package Exercise_2;
import java.io.*;
public class ExeObject implements Serializable
{
    String name;
    int id;
    ExeObject(String name, int id)
    {
        this.name=name;
        this.id=id;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id=id;
    }
}
