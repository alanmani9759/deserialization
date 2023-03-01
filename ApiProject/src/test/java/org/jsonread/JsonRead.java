package org.jsonread;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonRead {

	public static void main(String[] args) throws IOException, ParseException {
		FileReader reader = new FileReader(
				"C:\\Users\\alanl\\eclipse-workspace2\\ApiProject\\src\\test\\resources\\JsonFiles\\Sample.json");

		JSONParser parser = new JSONParser();

		Object obj = parser.parse(reader);

		JSONObject rootObject = (JSONObject) obj;

		System.out.println(rootObject.get("name"));

		Object object = rootObject.get("employee");
		JSONObject empObj = (JSONObject) object;
		Object object2 = empObj.get("empId");
		System.out.println(object2);
		Object object1 = rootObject.get("course");
		JSONArray objArr = (JSONArray) object1;
		System.out.println(objArr.get(1));
	}
}
