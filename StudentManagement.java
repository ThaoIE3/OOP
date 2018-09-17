import java.util.ArrayList;
public class StudentManagement
{
    public ArrayList<Student> std = new ArrayList<Student>(100);
    public void removeStudent(String id)
    {
        for (int i = 0; i < std.size(); i++)
        {
            Student stud = std.get(i);
            if (stud.getId().equals(id))
                std.remove(i);
        }
    }

    public void studentByGroup()
    {
        Student tem = std.get(0);
        String presentGroup = tem.getGroup();
        String nextGroup = "";

        int size = std.size();
        boolean[] check = new boolean[size];
        for (int i = 0; i < size; i++)
        {
            Student temStudent = std.get(i);
            if (check[i] != true)
            {
                if (temStudent.getGroup().equals(presentGroup))
                {
                    System.out.println(temStudent.getInfo());
                    check[i] = true;
                }
                else
                 {
                    nextGroup = temStudent.getGroup();

                }
                if (i == size - 1)
                {
                    i = 0;
                    presentGroup = nextGroup;
                }
            }
        }
    }

    public boolean sameGroup(Student s1, Student s2)
    {
        return s1.getGroup().equals(s2.getGroup());
    }

    public static void main(String[] args)
    {
        Student st1 = new Student();
        st1.setName("Trịnh Thị Thảo");
        st1.setId("17021025");
        st1.setGroup("INT22041");
        st1.setEmail("trinhthithao1999@gmail.com");
        System.out.println("Name: " + st1.getName());
        System.out.println("Thong tin: " + st1.getInfo());

        Student st2 = new Student();
        System.out.println(st2.getInfo());
        Student st3 = new Student("Thảo Ngọc", "1700000", "thao.amc@gmail.com");
        System.out.println(st3.getInfo());
        Student st4 = new Student(st3);
        System.out.println(st4.getInfo());
        StudentManagement sm = new StudentManagement();
        System.out.println(sm.sameGroup(st1, st2));
    }
}
