package com.angelos.wsjava.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateService {

	public static String dateFormat() {

		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));

		String datelog = dateFormat.format(date);

		return datelog;
	}
}
