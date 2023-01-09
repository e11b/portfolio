package Ex_31;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    // methods //

    public String getFirstName () {
        return firstName;
    }

    public String getLastName () {
        return lastName;
    }

    public int getAge () {
        return age;
    }

    public void setFirstName (String name_first) {
        firstName = name_first;
    }

    public void setLastName (String name_last) {
        lastName = name_last;
    }

    public void setAge (int set_age) {
        if (set_age < 0 || set_age > 100) {
            age = 0;
        } else age = set_age;
    }

    public boolean isTeen (){
        if (age > 12 && age <20) {
            return true;
        } else return false;
    }

    public String getFullName () {
        if (firstName == "" && lastName == "") {
            return "";
        } else if (lastName.isEmpty()) {
            return firstName;
        } else if (firstName.isEmpty()) {
            return lastName;
        } else return firstName + " " + lastName;
    }


}
