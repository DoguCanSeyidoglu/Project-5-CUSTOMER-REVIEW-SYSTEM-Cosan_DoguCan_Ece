
public class Registration
{
	// Register new user:
	public void createNewUser(String name, String password)
	{
		@SuppressWarnings("unused")
		User newUser = new User(name, password);
	}
}
