package ConceptAndCoding.exceptionhandling;

public class tryCatch {

    public static void main(String[] args) {
        method1();
    }



    public static void method1()
    {
        try {
            throw new ClassNotFoundException();
        } catch (ClassNotFoundException exceptionObject)
        {
            exceptionObject.printStackTrace();
        }
    }
}
