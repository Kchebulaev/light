package entities;


import com.epam.jdi.tools.DataClass;

public class User extends DataClass<User> {
    public String name = "epam";
    public String password = "1234";

    public String lastName;
    //public boolean passport;
    public String acceptConditions;
    public String position;
    public String passportNumber;
    public String passportSeria;
    public String description;
    public String gender;
    public String religion;
    public String weather;
}
