// WAP using genric class to display name and age of a user ? 
class User<N, A> {
    N name;
    A age;

    User(N name, A age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        User<String, Integer> user1 = new User<>("Ram", 20);
        user1.display();
    }
}
