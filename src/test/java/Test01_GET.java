import org.testng.annotations.Test;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Test01_GET {
//@Test 
//	void test_() {
//	
//	Response response = RestAssured.get("https://reqres.in/api/users?page=2");
//	
//	System.out.println(response.asString());
//	System.out.println(response.getBody().asString());
//	System.out.println(response.getStatusCode());
//	System.out.println(response.getHeader("content-type"));
//	System.out.println(response.getStatusLine());
//	System.out.println(response.getTime());	
//}

	///////////////////////////////// login user/////////////////////////////
//	@Test
	@Test
	void test1_login() {

		JSONObject request = new JSONObject();

		request.put("username", "tiruba@tafmail.com");
		request.put("password", "anisha");

		System.out.println(request);
		// System.out.println(request.toJSONString());

		given().header("Content-Type", "application/json").header("x-site-context",
				"{\"stage\": \"sandbox\", \"account\": \"614bacaa4a74a70009d69d33\", \"channel\": \"1\", \"date\": \"2021-06-21\", \"site\": \"fabric.inc\"}")
				.header("x-api-key", "d41d8cd98f00b204e9800998ecf8427e").body(request.toJSONString()).when()
				.post("https://uat01-apigw.autocado.fabric.zone/api-commerceIdentity/auth/local/login").
				 then().
				statusCode(200).
				 log().all();
				// extract().
				// jsonPath().
				// getString()
			
				

	}

	//////////////////////////////////// guest user////////////////////
	// @Test
	@Test
	void test2_guest() {

//		JSONObject request = new JSONObject();
//		
//		request.put("username", "qele@zetmail.com");
//		request.put("password", "anisha");
//		
//		System.out.println(request);
		// System.out.println(request.toJSONString());

		given().
		// header("Authorization","eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjYxZjk2Mjg1ZThhODQ3MzllN2U2YTBmMyIsInJvbGVzIjpbeyJpZCI6IjVlMTk2MjUwNWVmNjEyMDAwODlmM2IyMiJ9XSwicGVybWlzc2lvbnMiOltdLCJhY2NvdW50aWQiOiI2MWY5NjI4NWM2NDBmNjAwMDk5YTBmMmYiLCJhY2NvdW50SWQiOm51bGwsInVzZXJUeXBlIjp7ImtpbmQiOiJSRUdJU1RFUkVEIn0sImlzc3VlciI6IjM4MjU3NjUwNjgxMSIsImlhdCI6MTY0Mzc5NjM2OSwiZXhwIjoxNjQzNzk4MTY5fQ.lXLz2c88EgC6ldsI0615AWAlSz7UjW8zHD5b3avSpQW7C2LxWZHD1xQhwCFVLhVrkIiCPjkapTtBlVZhMv-dbn2jJNl3Hh5vHfyezJuBASWbYo5gjU0o6WJSV8FWYX8b9MhMFaOCjzG2bxiPNjXONDLULaPHpB6kIuu044F7N_k").
				header("Content-Type", "application/json")
				.header("x-site-context",
						"{\"stage\": \"sandbox\", \"account\": \"614bacaa4a74a70009d69d33\", \"channel\": \"1\", \"date\": \"2021-06-21\", \"site\": \"fabric.inc\"}")
				.header("x-api-key", "d41d8cd98f00b204e9800998ecf8427e")
				.get("https://uat01-apigw.autocado.fabric.zone/api-commerceIdentity/user/guest").then().statusCode(200)
				.log().all();

	}

/////////////////////////////////Change password////////////////////
	// @Test
	@Test
	void test1_changepswd() {

		JSONObject request = new JSONObject();

		request.put("username", "tiruba@tafmail.com");

		// System.out.println(request);
		// System.out.println(request.toJSONString());

		given().header("Authorization",
				"eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjYxZmE1ZjEyYmZlMjZmOWU4OTA5ODJhNSIsInJvbGVzIjpbeyJpZCI6IjVlMTk2MjUwNWVmNjEyMDAwODlmM2IyMiJ9XSwicGVybWlzc2lvbnMiOltdLCJhY2NvdW50aWQiOiI2MWZhNWYxMmI0NDJhZTAwMDk5ZDllODkiLCJhY2NvdW50SWQiOm51bGwsInVzZXJUeXBlIjp7ImtpbmQiOiJSRUdJU1RFUkVEIn0sImlzc3VlciI6IjM4MjU3NjUwNjgxMSIsImlhdCI6MTY0Mzc5ODc1NywiZXhwIjoxNjQzODAwNTU3fQ.t0olvGuoTWZzviT4FHMh-tevWq4b_n5MjMBc0_oZfexgHAaC7uHwBnauTLFUfVUXI0CfHlZNBPMpqZzVKIlsS-qlFgvIaQyOBvZ9FWK6OcacNP7VnnTDqP6C_cEFA5uhbnCkwFzeW2NGbhpvcRbjov4B3Bf6Q5D1g9PVLcTy-9")
				.header("Content-Type", "application/json")
				.header("x-site-context",
						"{\"stage\": \"sandbox\", \"account\": \"614bacaa4a74a70009d69d33\", \"channel\": \"1\", \"date\": \"2021-06-21\", \"site\": \"fabric.inc\"}")
				.header("x-api-key", "d41d8cd98f00b204e9800998ecf8427e").body(request.toJSONString())
				.patch("https://uat01-apigw.autocado.fabric.zone/api-commerceIdentity/auth/local/reset").then()
				.statusCode(200).log().all();

	}

/////////////////////////////update password using token///////////

//@Test
	@Test
	void test1_changeusepswd() {

		JSONObject request = new JSONObject();

		request.put("userId", "61fa5f12bfe26f9e890982a5");
		request.put("resetToken", "2729f5bd121e9f67746830ce");
		request.put("newPassword", "anisha");

		// System.out.println(request);
		// System.out.println(request.toJSONString());

		given().header("Authorization",
				"eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjYxZmE1ZjEyYmZlMjZmOWU4OTA5ODJhNSIsInJvbGVzIjpbeyJpZCI6IjVlMTk2MjUwNWVmNjEyMDAwODlmM2IyMiJ9XSwicGVybWlzc2lvbnMiOltdLCJhY2NvdW50aWQiOiI2MWZhNWYxMmI0NDJhZTAwMDk5ZDllODkiLCJhY2NvdW50SWQiOm51bGwsInVzZXJUeXBlIjp7ImtpbmQiOiJSRUdJU1RFUkVEIn0sImlzc3VlciI6IjM4MjU3NjUwNjgxMSIsImlhdCI6MTY0Mzc5OTc4NSwiZXhwIjoxNjQzODAxNTg1fQ.qQ9NZD79Os6kGdAyW1tCO00m8o3d_VtTN0h0xOSF1Llczm8cZMiUaio6KrrAflogaq2hQJnE38DSudnf8F295LjCXhKVALg4YkFHPCtTCwvB1w8XbTVWhg3RnyTLbvyELUQ1Mdls-P0gdr9jFLLXu2ZodG58MHg9Fz9V7-cR3bE")
				.header("Content-Type", "application/json")
				.header("x-site-context",
						"{\"stage\": \"sandbox\", \"account\": \"614bacaa4a74a70009d69d33\", \"channel\": \"1\", \"date\": \"2021-06-21\", \"site\": \"fabric.inc\"}")
				.header("x-api-key", "d41d8cd98f00b204e9800998ecf8427e").body(request.toJSONString())
				.patch("https://uat01-apigw.autocado.fabric.zone/api-commerceIdentity/auth/password").then()
				.statusCode(200).log().all();

	}

//////////////////////////////reset password token//////////////////
	@Test
	void test1_resetpswdtoken() {

		JSONObject request = new JSONObject();

		request.put("username", "tiruba@tafmail.com");

		// System.out.println(request);
		// System.out.println(request.toJSONString());

		given().header("Authorization",
				"eeyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjYxZmE1ZjEyYmZlMjZmOWU4OTA5ODJhNSIsInJvbGVzIjpbeyJpZCI6IjVlMTk2MjUwNWVmNjEyMDAwODlmM2IyMiJ9XSwicGVybWlzc2lvbnMiOltdLCJhY2NvdW50aWQiOiI2MWZhNWYxMmI0NDJhZTAwMDk5ZDllODkiLCJhY2NvdW50SWQiOm51bGwsInVzZXJUeXBlIjp7ImtpbmQiOiJSRUdJU1RFUkVEIn0sImlzc3VlciI6IjM4MjU3NjUwNjgxMSIsImlhdCI6MTY0MzgwMzUxNywiZXhwIjoxNjQzODA1MzE3fQ.o8DMtbX7iMLfU7MukKhA6cRmfqxzP_CHowN2LlAvvIeP43gJ51pufdCmf9ehntpZYo78uYq-y1WspGwMX-k0QKduz7dUzcINsSk6y1GPer8XqcQaCBqCv11Q-odcjOsF8GUqVF5k2g9cWCYMR4j3OOhVAEfv0R8UkaP1EFZ7VrY")
				.header("Content-Type", "application/json")
				.header("x-site-context",
						"{\"stage\": \"sandbox\", \"account\": \"614bacaa4a74a70009d69d33\", \"channel\": \"1\", \"date\": \"2021-06-21\", \"site\": \"fabric.inc\"}")
				.header("x-api-key", "d41d8cd98f00b204e9800998ecf8427e").body(request.toJSONString())
				.patch("https://uat01-apigw.autocado.fabric.zone/api-commerceIdentity/auth/local/reset/token").then()
				.statusCode(200).log().all();

	}

///////////////////////////////////Verify reset token/////////////////////////

//@Test
	@Test
	void test2_verifytoken() {

//	JSONObject request = new JSONObject();
//	
//	request.put("username", "qele@zetmail.com");
//	request.put("password", "anisha");
//	
//	System.out.println(request);
		// System.out.println(request.toJSONString());

		given().header("Authorization",
				"eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjYxZmE1ZjEyYmZlMjZmOWU4OTA5ODJhNSIsInJvbGVzIjpbeyJpZCI6IjVlMTk2MjUwNWVmNjEyMDAwODlmM2IyMiJ9XSwicGVybWlzc2lvbnMiOltdLCJhY2NvdW50aWQiOiI2MWZhNWYxMmI0NDJhZTAwMDk5ZDllODkiLCJhY2NvdW50SWQiOm51bGwsInVzZXJUeXBlIjp7ImtpbmQiOiJSRUdJU1RFUkVEIn0sImlzc3VlciI6IjM4MjU3NjUwNjgxMSIsImlhdCI6MTY0MzgwNDI3NywiZXhwIjoxNjQzODA2MDc3fQ.EfVIM7lMrJ2gGKWsWArKSevDEiYi60mUV3CgUyahgYgDWUX-gsMISTDgFn5r4675dRWKGAM4oc6T8YTDReYgmzlVzk3vpAvJ3PSsBeYN-S6EQnzta51ZmbRi-59NpQZdlA5HTH1cZzRUw0Yuz3MEV7xAVXU8A4SjI2Lq1ZaBN6k")
				.header("Content-Type", "application/json")
				.header("x-site-context",
						"{\"stage\": \"sandbox\", \"account\": \"614bacaa4a74a70009d69d33\", \"channel\": \"1\", \"date\": \"2021-06-21\", \"site\": \"fabric.inc\"}")
				.header("x-api-key", "d41d8cd98f00b204e9800998ecf8427e")
				.get("https://uat01-apigw.autocado.fabric.zone/api-commerceIdentity/auth/token/fe6c2ce00773dc40ad6626b5")
				.then().statusCode(200).log().all();

	}

/////////////////////////////Refresh Access Token///////////////////

	@Test
	void test1_refreshtoken() {

		JSONObject request = new JSONObject();

		request.put("refreshToken",
				"eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjYxZmE1ZjEyYmZlMjZmOWU4OTA5ODJhNSIsInJvbGVzIjpbeyJpZCI6IjVlMTk2MjUwNWVmNjEyMDAwODlmM2IyMiJ9XSwicGVybWlzc2lvbnMiOltdLCJhY2NvdW50aWQiOiI2MWZhNWYxMmI0NDJhZTAwMDk5ZDllODkiLCJhY2NvdW50SWQiOm51bGwsInVzZXJUeXBlIjp7ImtpbmQiOiJSRUdJU1RFUkVEIn0sImlzc3VlciI6IjM4MjU3NjUwNjgxMSIsImlhdCI6MTY0MzgwNDg4OCwiZXhwIjoxNjQzODA2Njg4fQ.nQmhW4V5l9Hu5VfaihzdYATI9sBstQxptx30O3F2UgelwlYfmVl_Hnz8z2b1NIioalAwpBMqDYLyWX1CYc0dL2dK9E57LMxelbYig0lZebPke-jV_hFjFQvaGgXsVAApslb4U3NamOjnC7f916EgYw7df1dsUwzczd_x9KjHZvc");

		System.out.println(request);
		// System.out.println(request.toJSONString());

		given().

				header("Content-Type", "application/json")
				.header("x-site-context",
						"{\"stage\": \"sandbox\", \"account\": \"614bacaa4a74a70009d69d33\", \"channel\": \"1\", \"date\": \"2021-06-21\", \"site\": \"fabric.inc\"}")
				.header("x-api-key", "d41d8cd98f00b204e9800998ecf8427e").body(request.toJSONString()).when()
				.post("https://uat01-apigw.autocado.fabric.zone/api-commerceIdentity/auth/local/refresh").then()
				.statusCode(200).log().all();

	}

}
