
// 13. WAP for treeset using custom comparator interface which will have name 
// and marks and the ordering will be done according to the names; 


import java.util.TreeSet;
import java.util.Comparator;

class Student {
    String name;
    int marks;
    public Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    public String toString(){
        return name+" "+ marks;
    }
}
class Main{
    
    public static void main(String[] args){
        Comparator <Student> nameComparator =  new Comparator<Student>(){
        public int compare(Student s1, Student s2){
            return s1.name.compareTo(s2.name);
        }
    };
    TreeSet <Student>students = new TreeSet<>(nameComparator);
    students.add(new Student("Aarav",84));
    students.add(new Student("Ram",80));
    students.add(new Student("Afxal",86));
    
    for(Student s: students){
        System.out.println(s);
    }
    
}
}
