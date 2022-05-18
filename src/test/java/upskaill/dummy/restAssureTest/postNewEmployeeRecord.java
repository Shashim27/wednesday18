package upskaill.dummy.restAssureTest;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class postNewEmployeeRecord {
	@Test
	public void postNewEmployeeRecords() {
		File payload = new File("C:/Users/hpoll/eclipse1/rasel1/src/test/resources/payLoad/newEmployee.json");
		
		RequestSpecification request=RestAssured.given();
		
		request.header("Content-Type", "application/json");
		request.body(payload);
		Response resp=request.post("http://dummy.restapiexample.com/api/v1/create ");
		int statuesCode=resp.getStatusCode();
		Assert.assertEquals(200, statuesCode);
		String responsebody=resp.asString();
		
		System.out.println("Status code"+statuesCode);
		System.out.println(" responsebody"+responsebody);
		
	}
	
	@Test
	public void GetAllEmployeeDetails2() {
	   /* given().
	    when().
	        get("http://dummy.restapiexample.com/api/v1/create").
	    then().
	        assertThat().
	        statusCode(200);
	        */
		
		//Getting API HTTP response using restAssured
				Response resp=RestAssured.get("http://dummy.restapiexample.com/api/v1/create");
				//Getting Status Code & Validation
				
				int statusCode=resp.getStatusCode();
				
				Assert.assertEquals(200, statusCode);
				
				//Getting the response body
				
				
				String responseBOdy=resp.asString();
				
				
				//printing Status code & response body
				
				System.out.println(" status code is "+ statusCode);
				
				
				System.out.println("Response body :" + responseBOdy);
	}

}
