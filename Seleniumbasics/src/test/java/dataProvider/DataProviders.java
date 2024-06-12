package dataProvider;

import org.testng.annotations.DataProvider;

public class DataProviders {
	@DataProvider (name="invalidUserCredentials")
public Object[][] userCredentialsData() {
	Object[][]data= new Object[3][2];
	data[0][0]="akhilamshaji0@gmail.com";
	data[0][1]="Akhila@123";
	
	data[1][0]="akhilamshaji@gmail.com";
	data[1][1]="Akhifla@123";
	
	data[2][0]="akhilamshaji0@gmail.com";
	data[2][1]="Akhila@h123";
	return data;
}
	
	

}
