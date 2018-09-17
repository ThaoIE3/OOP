import sun.awt.geom.AreaOp;

import java.net.StandardProtocolFamily;
import java.util.ArrayList;
class Student
{
    String name;
    String id;
    String group;
    String email;

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getId()
    {
        return id;
    }
    public void setId(String id)
    {
        this.id=id;
    }
    public String getGroup()
    {
        return group;
    }
    public void setGroup(String group)
    {
        this.group=group;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }
    public String getInfo()
    {
        return name+"\t"+id+"\t"+group+"\t"+email;
    }
    public Student()
    {
        name="Student";
        id="000";
        group="INT22041";
        email="uet@vnu.edu.vn";
    }
    public Student(String n, String sid, String em)
    {
        name=n;
        id=sid;
        group="INT22041";
        email=em;
    }
    public Student(Student s)
    {
        this.name=s.name;
        this.id=s.id;
        this.group=s.group;
        this.email=s.email;
    }
}
public class StudentManagement
{
    public Student[] std = new Student[100];
    public void studentByGroup()
    {
        int i;
        System.out.println("Danh sach sinh vien lop INT22041: ");
        for(i=0;i<std.length;i++)
        {
            if (std[i].group.equals("INT22041"))
            {
                System.out.println(std[i].getInfo());
            }
        }
        System.out.println("Danh sach sinh vien lop INT22042: ");
        for(i=0;i<std.length;i++)
        {
            if(std[i].group.equals("INT22042"))
            {
                System.out.println(std[i].getInfo());
            }
        }
    }
    public void removeStudent(String id)
    {
        int i;
        int n=std.length;
        for(i=0;i<n;i++)
        {
            if (std[i].id.equals(id))
            {
                int newSize = n - 1;
                for (int j = i; j < newSize; j++)
                {
                    std[j] = std[j + 1];
                }
                n--;
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
        System.out.println("Name: "+ st1.getName());
        System.out.println("Thong tin: " + st1.getInfo());

        Student st2 = new Student();
        System.out.println(st2.getInfo());
        Student st3 = new Student("Thảo Ngọc","1700000","thao.amc@gmail.com");
        System.out.println(st3.getInfo());
        Student st4 = new Student(st3);
        System.out.println(st4.getInfo());
        StudentManagement sm = new StudentManagement();
        System.out.println(sm.sameGroup(st1,st2));
    }
}

