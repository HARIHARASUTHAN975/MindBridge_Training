package Exercise_3;
import java.io.*;
public class ExeObject implements Externalizable {
    private static final long serialVersionUID = 9147589421428516995L; // Keep this value consistent
    private String name;
    private int id;
    public ExeObject() {
    }
    public ExeObject(String name, int id) {
        this.name=name;
        this.id=id;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    @Override
    public void writeExternal(ObjectOutput out) throws IOException
    {
        out.writeInt(id);
    }
    @Override
    public void readExternal(ObjectInput in) throws IOException,ClassNotFoundException
    {
        id = in.readInt();
    }
}
