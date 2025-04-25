//12. WAP with treeset using campareable interface where the interface is going to contain name
//and marks and the sorting will be done according to the marks received by the students. 


import java.util.TreeSet;

class Student implements Comparable <Student> {
    String name;
    int marks;
    public Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }
    public int compareTo(Student other){
        return this.marks - other.marks;
    }
    public String toString(){
        return name+" + "+ marks;
    }
}
class Main{
    public static void main(String[] args){
    TreeSet<Student> students =  new TreeSet<>();
    students.add(new Student("Aarav",84));
    students.add(new Student("Ram",80));
    students.add(new Student("Afxal",86));
    
    for(Student s: students){
        System.out.println(s);
    }
    }
}
