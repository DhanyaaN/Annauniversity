import java.util.*;

class Cge {
    String Cge_name;

    public Cge(String Cge_name) {  
        this.Cge_name = Cge_name; 
    }
}
public class College {
    public static void main(String args[]) {
        Map<Integer,Cge> map = new HashMap<Integer,Cge>();
        Cge c1=new Cge("JIT");
        Cge c2=new Cge("SNS");
        Cge c3=new Cge("CIET");
        Cge c4=new Cge("KIT");
        map.put(7111,c1);
        map.put(7112,c2);
        map.put(7113,c3);
        map.put(7114,c4);
        for (Map.Entry<Integer,Cge> entry : map.entrySet()) {
            int key = entry.getKey();
            Cge d = entry.getValue();
            System.out.print(key + " ");
            System.out.println(d.Cge_name);
        }
    }
}
