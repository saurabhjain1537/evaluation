
public class UserClient {

	public static void main(String[] args) {
		UserClient client = new UserClient();
		System.out.println(client.getUser().toString());

	}

	public User getUser() {
		  return new
		    User.UserBuilder("James", "Oconnor")
		    .dob("01-Jan-1988")
		    .phone("1234567")
		    .address("Fake address 1234")
		    .companyName("ABC")
		    .build();
		}
}
