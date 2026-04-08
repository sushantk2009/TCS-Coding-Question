class Student{                          //Class
    String name;
    int age;
    int rollno;
    String branch;

    //Function of Method
    public void StudenIinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.rollno);
        System.out.println(this.branch);

    }
}


public class class_Object {
    public static void main (String[] args){

        //Object

        Student st1=new Student();
        st1.name="Sushant";
        st1.rollno=01;
        st1.age=32;
        st1.branch="CSE";

        Student st2= new Student();
        st2.name="Aryan";
        st2.rollno=02;
        st2.age=22;
        st2.branch="CSE";

        st1.StudenIinfo();
        st2.StudenIinfo();
    }
}
