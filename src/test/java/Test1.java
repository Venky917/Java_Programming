import org.testng.annotations.Test;


import Files.ReUsableMethods;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import java.io.IOException;
import java.nio.file.Files;

import java.nio.file.Paths;


public class Test1 {
	
	
	@Test
	public void addbook() throws IOException {
		
		RestAssured.baseURI="http://216.10.245.166";
	   String response =  given().log().all().header("Content-Type","application/json").body(new String(Files.readAllBytes(Paths.get("C:\\Users\\Admin\\Downloads\\payload_addbook.json"))))
			   .when().post("/Library/Addbook.php")
			   .then().log().all().assertThat().statusCode(200)
	                  .extract().response().asString();
	   System.out.println(response);
	   
	    JsonPath js = ReUsableMethods.rawToJson(response);
		String Id =  js.get("ID");
		System.out.println(Id);
	}

}
