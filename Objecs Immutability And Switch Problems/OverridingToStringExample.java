
class UserExample{
    private final String nickname;
    private final String password;
    private final String firstname;
    private final String lastname;

    public UserExample(String nickname, String password, String firstname, String lastname) {
        this.nickname = nickname;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getNickname() {
        return nickname;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public String toString() {
        return "UserExample{" +
                "nickname='" + nickname + '\'' +
                ", password='" + password + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}

public class OverridingToStringExample {
    public static void main(String[] args) {
        UserExample userExample = new UserExample("sandy","sandy123", "sandip", "neupane");
        System.out.println(userExample);
    }

}
