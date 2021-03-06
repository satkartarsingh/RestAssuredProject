import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;



public class Tests_POST {

	//@Test
	public void test_1_post() {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("name", "Raghav");
		map.put("job", "Teacher");
		
		System.out.println(map);
		
		JSONObject request = new JSONObject(map);
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		given().body(request.toJSONString()).when().post("https://reqres.in/api/users").
		then().statusCode(201);
	}
	
	
	@Test
	public void test_2_put() {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("name", "Raghav");
		map.put("job", "Teacher");
		
		System.out.println(map);
		
		JSONObject request = new JSONObject(map);
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		given().body(request.toJSONString()).when().put("https://reqres.in/api/users/2").
		then().statusCode(200).log().all();
	}
	
}
