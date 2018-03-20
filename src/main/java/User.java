public class User {
  private final String firstName; // required
  private final String lastName; // required
  private final String dateOfBirth; // optional
  private final String phone; // optional
  private final String address; // optional

  private User(UserBuilder builder) {
    this.firstName = builder.firstName;
    this.lastName = builder.lastName;
    this.dateOfBirth = builder.dob;
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
    return dateOfBirth;
  }

  public String getPhone() {
    return phone;
  }

  public String getAddress() {
    return address;
  }

  @Override
  public String toString() {
	  return "User [firstName=" + firstName + ", lastName=" + lastName + "]";
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