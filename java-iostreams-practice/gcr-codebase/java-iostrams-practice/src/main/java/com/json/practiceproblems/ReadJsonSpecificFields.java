package com.json.practiceproblems;

import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

public class ReadJsonSpecificFields {
	public static void main(String[] args) {
		try {
			
			//read JSON file
			FileReader reader=new FileReader("D:\\File Handling\\JSON\\students.json");
			JSONTokener tokener=new JSONTokener(reader);
			JSONObject jsonObject=new JSONObject(tokener);
			
			//extract specific fields
			String name=jsonObject.getString("name");
			String email=jsonObject.getString("email");
			
			//print extracted fields
			System.out.println("Name: "+name );
			System.out.println("Email: "+email);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}