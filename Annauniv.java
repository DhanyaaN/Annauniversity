import java.util.*;
class Department
{
 String dept_name;
 public Department(String dept_name) {
    this.dept_name = dept_name;
}
}
public class Annauniv {
    public static void main(String args[]) {
        Map<Integer,Department> map = new HashMap<Integer,Department>();
        Department d1 = new Department("cse, civil, ece, mech, eee");
        Department d2 = new Department("cse, civil, ece, mech");
        Department d3 = new Department("cse, civil, ece");
        Department d4 = new Department("cse, civil, ece, textile, mech");
        Department d5 = new Department("cse, civil, ece, mech");
        map.put(7111,d1);
        map.put(7112,d2);
        map.put(7113,d3);
        map.put(7114,d4);
        map.put(7115,d5);
        for (Map.Entry<Integer,Department> entry : map.entrySet()) {
            int key = entry.getKey();
            Department d = entry.getValue();
            System.out.println("College Code:" + key);
            System.out.println(d.dept_name);
        }

    }

}
