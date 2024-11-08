import javax.xml.validation.Validator;
import java.util.Date;

final class User {
    private final String nickname;
    private final String password;
    private final Date created;

    private final String email;
    private final String firstName;
    private final String lastName;

    private User(UserBuilder userBuilder) {
        this.nickname = userBuilder.nickname;
        this.lastName = userBuilder.lastName;
        this.email = userBuilder.email;
        this.firstName = userBuilder.firstName;
        this.created = userBuilder.created;
        this.password = userBuilder.password;
    }

    public static UserBuilder getBuilder(String nickname, String password) {
        return new User.UserBuilder(nickname, password);
    }

    public static final class UserBuilder {
        private final String nickname;
        private final String password;
        private final Date created;
        private String email;
        private String firstName;
        private String lastName;

        public UserBuilder(String nickname, String password) {
            this.nickname = nickname;
            this.password = password;
            this.created = new Date();
        }

        public UserBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    public String getNickname() {
        return nickname;
    }

    public String getPassword() {
        return password;
    }

    public Date getCreated() {
        return new Date(created.getTime());
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

public class WritingAnImmutableClassViaTheBuilderPattern {
    public static void main(String[] args) {
        User user1 = User.getBuilder("sandip", "sandip123").build();

        printer(user1);

        User user2 = User.getBuilder("CCir", "ccir123").email("ccir@221").firstName("CCIR").build();
        printer(user2);
    }

    public static void printer(User user) {
        System.out.println(
                "User Nickname: " + user.getNickname() + "\n" +
                        "User password: " + user.getPassword() + "\n" +
                        "User firstName: " + user.getFirstName() + "\n" +
                        "User lastName: " + user.getLastName() + "\n" +
                        "User email: " + user.getEmail()
        );
    }
}
