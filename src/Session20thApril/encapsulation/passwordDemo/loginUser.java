package Session20thApril.encapsulation.passwordDemo;

public class loginUser {
    private String userName;
    private String password;


    public loginUser(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName()
    {
        return userName;
    }

//    public String setPassword(String password )
//    {
//           return this.password = password;
//    }


    public void setPassword(String password) {
        this.password = password;
    }

    public void isUserAuthenticated(String userName, String password)
    {
        if(this.userName.equals(userName) && this.password.equals(password))
        {
            System.out.println("User is Autheticated");
        } else {
            System.out.println("User not Authenticated");
        }
    }
}
