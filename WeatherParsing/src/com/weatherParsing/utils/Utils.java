package com.weatherParsing.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Pattern;

public class Utils {

	public static void getFileData(String URL, String fileName) {

		HttpURLConnection connection = null;
		URL url = makeUrl(URL);

		if (url == null)
			return;

		try {
			connection = (HttpURLConnection) url.openConnection();
			connection.connect();
			if (connection.getResponseCode() == 200) {
				System.out.println("connection successful");
				InputStream inputStream = connection.getInputStream();
				readFromStream(inputStream, fileName);
			}

			else {
				System.out.println("connection unsuccessful");
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		connection.disconnect();

	}

	private static void readFromStream(InputStream input, String fileName) throws IOException {
		FileWriter out;
		out = new FileWriter(fileName);

		InputStreamReader reader = new InputStreamReader(input);
		BufferedReader br = new BufferedReader(reader);
		String line;
		while ((line = br.readLine()) != null) {
			out.append(line);
			out.append("\n");
		}
		br.close();
		out.close();

	}

	private static URL makeUrl(String urlString) {
		URL url = null;
		if (urlString.isEmpty())
			return null;

		try {
			url = new URL(urlString);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return url;

	}

	public static void makeFile(String name, String data) {

		FileWriter out;
		try {
			out = new FileWriter(name);
			out.write(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void createOutputFile(String name) {

		try {
			FileWriter writer = new FileWriter(name);
			writer.write("region_code,weather_param,year, key, value\n");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void readFile(String sourceName, String destinationName, String region, String code) {
		String line = null;
		String[] keys = new String[18];
		FileWriter writer;
		int maxLength = 0;

		try {
			FileReader reader = new FileReader(sourceName);
			writer = new FileWriter(destinationName, true);
			BufferedReader bufferedReader = new BufferedReader(reader);

			// ignoring the title of the document
			for (int i = 0; i < 8; i++)
				line = bufferedReader.readLine();

			maxLength = line.length();

			// get keys from first line:
			Pattern pattern = Pattern.compile("[ ]+");
			line = line.replaceAll(pattern.toString(), ",");
			keys = line.split(",");

			int i = 1;
			String[] values2 = new String[18];
			int indexOfValues2 = 0;

			// read data
			while ((line = bufferedReader.readLine()) != null) {

				int index = 0;
				indexOfValues2 = 0;
				int lenghtOfLine = line.length();

				// if length is less add extra spaces to line
				if (lenghtOfLine < maxLength) {
					for (int l = 0; l < (maxLength - lenghtOfLine); l++)
						line = line + " ";

					line = line + "\n";
				}

				char a;
				String temp = "";

				while (index < maxLength) {
					a = line.charAt(index);
					if (a != ' ') {
						temp = temp + a;
					}

					else {
						int count = 0;

						if (temp.trim().equalsIgnoreCase("---")) {
							temp = "NA";
						}
						values2[indexOfValues2] = temp;
						indexOfValues2++;
						temp = "";
						while (line.charAt(index) == ' ') {
							count++;
							index++;

						}

						if (count > 5) {
							int noOfMissingData = count / 7;
							for (int c = 0; c < noOfMissingData; c++) {
								values2[indexOfValues2] = "NA";
								indexOfValues2++;
							}

						}
						index--;
					}

					index++;
				}
				if (indexOfValues2 < 18) {
					values2[indexOfValues2] = temp;
				}

				int lenght = values2.length;

				String lineData;
				String year = values2[0];
				for (int j = 1; j < lenght; j++) {
					lineData = region + "," + code + "," + year + "," + keys[i++] + "," + values2[j] + "\n";
					System.out.print(lineData);
					writer.append(lineData);
				}
				i = 1;

			}
			bufferedReader.close();
			writer.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
