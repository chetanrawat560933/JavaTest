package Session20thApril.encapsulation.passwordDemo;

public class loginMain {

    public static void main(String[] args) {
        loginUser loginUser = new loginUser("pragra", "pragra123");

        loginUser.isUserAuthenticated("test","pfarha");

       String userName = loginUser.getUserName();

       loginUser.setPassword("Rawat");
        System.out.println(userName);

        loginUser.isUserAuthenticated("pragra", "Rawat");
    }
}


