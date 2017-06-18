package com.angelos.wsjava.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class clientPost {

	public static void main(String[] args) {

		try {

			URL url = new URL("http://localhost:8081/WebService/webapi/rest/post");
			HttpURLConnection httpcon = (HttpURLConnection) url.openConnection();
			httpcon.setDoOutput(true);
			httpcon.setRequestMethod("POST");
			httpcon.setRequestProperty("Content-Type", "application/json");
			
			String post = "{\"name\":\"Angelos\",\"message\":\"Hello!\"}";

			OutputStream os = httpcon.getOutputStream();
			os.write(post.getBytes());
			os.flush();

			if (httpcon.getResponseCode() != HttpURLConnection.HTTP_CREATED) {
				throw new RuntimeException("Failed : HTTP error code : " + httpcon.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((httpcon.getInputStream())));

			String output;
			System.out.println("The info of the user is: \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}

			httpcon.disconnect();

		} catch (MalformedURLException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}
