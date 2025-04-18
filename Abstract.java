// You are using Java
abstract class Programming
{
    public abstract void developer();
}
class java extends Programming
{
    public void developer()
    {
        System.out.println("Developer of JAVA is: James Gosling");
    }
}
class html extends Programming
{
    public void developer()
    {
        System.out.println("Developer of HTML is: Tim Berners-Lee");
    }
}


public class Main{
    public static void main(String args[]){
        Programming  h = new html();
        h.developer();
        Programming j = new java();
        j.developer();
    }
}
