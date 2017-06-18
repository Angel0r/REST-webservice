package com.angelos.wsjava.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class clientGet {

	public static void main(String[] args) {

		try {

			URL url = new URL("http://localhost:8081/WebService/webapi/rest/get");
			HttpURLConnection httpcon = (HttpURLConnection) url.openConnection();
			httpcon.setRequestMethod("GET");
			httpcon.setRequestProperty("Accept", "application/json");

			if (httpcon.getResponseCode() != 200) {
				throw new RuntimeException("Failed! " + httpcon.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((httpcon.getInputStream())));

			String output;
			System.out.println("The date is: ");
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