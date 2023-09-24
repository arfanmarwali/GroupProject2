package GroupExercise2;

public class task12 {
    private String email;
    private String userName;
    private String password;

    // Setter method for email with validation
    public void setEmail(String email) {
        if (email != null && email.toLowerCase().endsWith("@yahoo.com")) {
            this.email = email;
        } else {
            System.out.println("Invalid email. Please use a Yahoo email address.");
        }
    }

    // Setter method for userName with validation
    public void setUserName(String userName) {
        if (userName != null && userName.length() > 6 && !userName.equals(password)) {
            this.userName = userName;
        } else {
            System.out.println("Invalid userName. It should not be empty, have a length > 6 characters, and not match the password.");
        }
    }

    // Setter method for password with validation
    public void setPassword(String password) {
        if (password != null && password.length() > 6 && !password.equals(userName)) {
            this.password = password;
        } else {
            System.out.println("Invalid password. It should not be empty, have a length > 6 characters, and not match the userName.");
        }
    }

    // Getter methods (if needed)
    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public static void main(String[] args) {
        // Create an instance of Registration
        task12 user = new task12();

        // Set user's email, userName, and password (with valid values)
        user.setEmail("example@yahoo.com");
        user.setUserName("user123");
        user.setPassword("password123");

        // Try setting invalid values (should display error messages)
        user.setEmail("invalid@gmail.com");          // Invalid email
        user.setUserName("short");                   // Invalid userName (too short)
        user.setPassword("user123");                // Invalid password (matches userName)
    }
}

