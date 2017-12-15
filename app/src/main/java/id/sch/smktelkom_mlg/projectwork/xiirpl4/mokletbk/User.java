package id.sch.smktelkom_mlg.projectwork.xiirpl4.mokletbk;

/**
 * Created by Mokleters on 3/31/2017.
 */

public class User {

    public String name;
    public String email;
    public String age;

    // Default constructor required for calls to
    // DataSnapshot.getValue(User.class)

    public User(String name, String email, String age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }
}
