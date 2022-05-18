package upskaill.dummy.restAssureTest;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;
public class GetAllemployeeRecord {
	@Test
	public void GetEmployeeDetails() {
		
		//Getting API HTTP response using restAssured
		Response resp=RestAssured.get("http://dummy.restapiexample.com/api/v1/employees");
		//Getting Status Code & Validation
		
		int statusCode=resp.getStatusCode();
		
		Assert.assertEquals(200, statusCode);
		
		//Getting the response body
		
		
		String responseBOdy=resp.asString();
		
		
		//printing Status code & response body
		
		System.out.println(" status code is "+ statusCode);
		
		
		System.out.println("Response body :" + responseBOdy);
		
	}
		
		
		@Test
		public void GetAllEmployeeDetails2() {
		    given().
		    when().
		        get("http://dummy.restapiexample.com/api/v1/employees").
		    then().
		        assertThat().
		        statusCode(200);
		}
		
		
		
		
		
		
	}
	
	


