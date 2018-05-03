
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
class SNSDepartment {
    int dept_id;
    String dept_name;
    int total_stud;

    public SNSDepartment(int dept_id, String dept_name, int total_stud) {
        this.dept_id = dept_id;
        this.dept_name = dept_name;
        this.total_stud = total_stud;
    }
}
public class CollegeDetail {
    public static void main(String args[]) {
        Map<Integer, String> cge = new HashMap<Integer, String>();
        cge.put(7111, "JANSONS INSTITUTE OF TECHNOLOGY");
        cge.put(7133, "SNS COLLEGE OF ENGINEERING & TECHNOLOGY");
        cge.put(7105,"UNITED INSTITUTE OF TECHNOLOGY");
        cge.put(7115,"KARPAGAM INSTITUTE OF TECHNOLOGY");
        Map<Integer, JITDepartment> map = new HashMap<Integer, JITDepartment>();
        JITDepartment d1 = new JITDepartment(101, "civil", 120);
        JITDepartment d2 = new JITDepartment(102, "cse", 120);
        JITDepartment d3 = new JITDepartment(103, "ece", 120);
        JITDepartment d4 = new JITDepartment(104, "eee", 80);
        JITDepartment d5 = new JITDepartment(105, "mech", 140);
        map.put(1, d1);
        map.put(2, d2);
        map.put(3, d3);
        map.put(4, d4);
        map.put(5, d5);
        Map<Integer, SNSDepartment> map1 = new HashMap<Integer, SNSDepartment>();
        SNSDepartment s1 = new SNSDepartment(101, "civil", 180);
        SNSDepartment s2 = new SNSDepartment(102, "cse", 180);
        SNSDepartment s3 = new SNSDepartment(103, "ece", 100);
        SNSDepartment s4 = new SNSDepartment(104, "eee", 80);
        SNSDepartment s5 = new SNSDepartment(105, "mech", 140);
        SNSDepartment s6 = new SNSDepartment(106, "auronotical", 140);
        map1.put(1, s1);
        map1.put(2, s2);
        map1.put(3, s3);
        map1.put(4, s4);
        map1.put(5, s5);
        map1.put(6, s6);
        //JANSONS COLLEGE;
        int jitkey=7111;
        if (cge.containsKey(jitkey)) {
            String val=cge.get(jitkey);
            System.out.println("COLLEGE CODE:"+""+jitkey+""+"-"+val);
            for (Map.Entry<Integer, JITDepartment> entry : map.entrySet()) {
                //int key = entry.getKey();
                JITDepartment d = entry.getValue();
               // System.out.println("Department:" + key);
                System.out.println("DEPT_CODE:" + d.dept_id + " " + "DEPT_NAME:" + d.dept_name + " " + "TOTAL_STUDENTS:"
                        + d.total_stud);
            }
        }
        System.out.println();
        //SNS COLLEGE 
        int snskey=7133;
        if (cge.containsKey(snskey)) {
            String val=cge.get(snskey);
            System.out.println("COLLEGE CODE:"+""+snskey+""+"-"+val);
            for (Map.Entry<Integer, SNSDepartment> entry : map1.entrySet()) {
                //int key = entry.getKey();
                SNSDepartment s = entry.getValue();
               // System.out.println("Department:" + key);
                System.out.println("DEPT_CODE:" + s.dept_id + " " + "DEPT_NAME:" + s.dept_name + " " + "TOTAL_STUDENTS:"
                        + s.total_stud);
            }
        }
    }

}
