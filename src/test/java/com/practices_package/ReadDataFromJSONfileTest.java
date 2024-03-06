package com.practices_package;

import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.mysql.cj.xdevapi.JsonParser;

/* in pom.xml add json.simple ver 1.1.1 depndency*/
/*<!-- https://mvnrepository.com/artifact/com.googlecode.json-simple/json-simple -->
<dependency>
    <groupId>com.googlecode.json-simple</groupId>
    <artifactId>json-simple</artifactId>
    <version>1.1.1</version>
</dependency>
*/

public class ReadDataFromJSONfileTest {
	public static void main(String[] args) throws IOException, ParseException {
		
		FileReader filePath = new FileReader(".\\src\\test\\resources\\data.json"); //file location
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(filePath);
		
		//from below any line is fine 
//		JSONObject map = (JSONObject) obj ; //Typecasting
		Map<?, ?> map = (JSONObject) obj ; //upcasting
		
		System.out.println(map.get("browser"));
		System.out.println(map.get("url"));
		System.out.println(map.get("staffID"));
		System.out.println(map.get("password"));
	}
}
