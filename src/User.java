public class User {
  private final String firstName; // required
  private final String lastName; // required
  private final String dob; // optional
  private final String phone; // optional
  private final String address; // optional

  private User(UserBuilder builder) {
    this.firstName = builder.firstName;
    this.lastName = builder.lastName;
    this.dob = builder.dob;
    this.phone = builder.phone;
    this.address = builder.address;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getDob() {
    return dob;
  }

  public String getPhone() {
    return phone;
  }

  public String getAddress() {
    return address;
  }

  public static class UserBuilder {
    private final String firstName;
    private final String lastName;
    private String dob;
    private String phone;
    private String address;

    public UserBuilder(String firstName, String lastName) {
      this.firstName = firstName;
      this.lastName = lastName;
    }

    public UserBuilder dob(String dob) {
      this.dob = dob;
      return this;
    }

    public UserBuilder phone(String phone) {
      this.phone = phone;
      return this;
    }

    public UserBuilder address(String address) {
      this.address = address;
      return this;
    }

    public User build() {
      return new User(this);
    }

  }
}