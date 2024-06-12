package utilities;

import com.github.javafaker.Faker;

public class RandomDataUtility {
	static Faker faker;
	public static String getFirstname() {
		faker=new Faker();
		String first_name=faker.name().firstName();
		return first_name;
		
	}
	public static String getLastname() {
		faker=new Faker();
		String last_name=faker.name().firstName();
		return last_name;
	}
}
