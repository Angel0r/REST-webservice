package com.angelos.wsjava.service;


import java.io.IOException;

import com.angelos.wsjava.mongodb.mongo;

public class dataService {

	
	public static String createDataInJSON(String dataPost) throws IOException {

		String mongoPost = mongo.postId(dataPost);
		String dateForm = dateService.dateFormat();	
		String result = "New user: " + mongoPost + " at " + dateForm;
		
		System.out.println(result);
		return result;
	}
}
