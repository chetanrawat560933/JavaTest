package ConceptAndCoding.exceptionhandling;

public class Example1 {

    public static void main(String[] args) throws ClassNotFoundException {
        method1();
    }
    
    public static void method1() throws ClassNotFoundException
    {
        throw new ClassNotFoundException();

    }
}
