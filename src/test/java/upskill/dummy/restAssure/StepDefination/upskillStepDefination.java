package upskill.dummy.restAssure.StepDefination;

import java.io.File;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class upskillStepDefination {
	
	@Given("^Create new employee record in database$")
	public void create_new_employee_record_in_database() throws Throwable {
	    
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

	@Given("^Update an employee Salary with Increment$")
	public void update_an_employee_Salary_with_Increment() throws Throwable {
	    
	   
	}

	@When("^Get all employee data$")
	public void get_all_employee_data() throws Throwable {
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

	@When("^Get a single employee data by id$")
	public void get_a_single_employee_data_by_id() throws Throwable {
	    
	   
	}

	@Then("^Delete an employee record$")
	public void delete_an_employee_record() throws Throwable {
	    
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
