package builder.user;
public class User {

  private String username;
  private int age;
  private String email;
  private boolean active;

  public User(String username) {
    this.username = username;
  }

  public User(String username, int age) {
    this(username);
    this.age = age;
  }

  public User(String username, int age, String email) {
    this(username, age);
    this.email = email;
  }

  public User(String username, int age, String email, boolean active) {
    this(username, age, email);
    this.active = active;
  }

  public User(String username, String email) {
    this(username);
    this.email = email;
  }

  // ...
  // Constructors would keep growing in order to 
  // combine all available parameters


  public String getUsername() {
    return username;
  }

  public int getAge() {
    return age;
  }

  public String getEmail() {
    return email;
  }

  public boolean isActive() {
    return active;
  }
}