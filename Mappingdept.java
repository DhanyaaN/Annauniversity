import java.util.*;

class JITDepartment {
    int dept_id;
    String dept_name;
    int total_stud;

    public JITDepartment(int dept_id, String dept_name, int total_stud) {
        this.dept_id = dept_id;
        this.dept_name = dept_name;
        this.total_stud = total_stud;
    }
}
public class Mappingdept {
    public static void main(String args[]) {
        Map<Integer, JITDepartment> map = new HashMap<Integer, JITDepartment>();
        JITDepartment d1 = new JITDepartment(101, "civil", 120);
        JITDepartment d2 = new JITDepartment(102, "cse", 120);
        JITDepartment d3 = new JITDepartment(103, "ece", 120);
        JITDepartment d4 = new JITDepartment(104, "eee", 80);
        JITDepartment d5 = new JITDepartment(105, "mech", 140);
        map.put(7111, d1);
        map.put(7111,d2);
        for (Map.Entry<Integer, JITDepartment> entry : map.entrySet()) {
            int key = entry.getKey();
            JITDepartment d = entry.getValue();
            System.out.println(key + " Details:");
            System.out.println(d.dept_id + " " + d.dept_name + " " + d.total_stud);
        }

    }

}
