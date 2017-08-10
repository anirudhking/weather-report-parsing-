package com.weatherParsing.main;

import com.weatherParsing.utils.Utils;

public class StartingPoint {

	public static void main(String args[]) {

		downloadData();
		Utils.createOutputFile(WeatherConstants.ROOT_LOCATION + WeatherConstants.RESULT_FILE);
		createResult();
	}

	private static void downloadData() {

		Utils.getFileData(WeatherConstants.UK_MAX_TEMP_URL,
				WeatherConstants.ROOT_LOCATION + WeatherConstants.UK_MAX_TEMP_FILE);
		Utils.getFileData(WeatherConstants.UK_MEAN_TEMP_URL,
				WeatherConstants.ROOT_LOCATION + WeatherConstants.UK_MEAN_TEMP_FILE);
		Utils.getFileData(WeatherConstants.UK_SUNSHINE_URL,
				WeatherConstants.ROOT_LOCATION + WeatherConstants.UK_SUNSHINE_FILE);
		Utils.getFileData(WeatherConstants.UK_RAINFALL_URL,
				WeatherConstants.ROOT_LOCATION + WeatherConstants.UK_RAINFALL_FILE);
		Utils.getFileData(WeatherConstants.UK_MIN_TEMP_URL,
				WeatherConstants.ROOT_LOCATION + WeatherConstants.UK_MIN_TEMP_FILE);
		Utils.getFileData(WeatherConstants.ENGLAND_MIN_TEMP_URL,
				WeatherConstants.ROOT_LOCATION + WeatherConstants.ENGLAND_MIN_TEMP_FILE);
		Utils.getFileData(WeatherConstants.ENGLAND_MAX_TEMP_URL,
				WeatherConstants.ROOT_LOCATION + WeatherConstants.ENGLAND_MAX_TEMP_FILE);
		Utils.getFileData(WeatherConstants.ENGLAND_MEAN_TEMP_URL,
				WeatherConstants.ROOT_LOCATION + WeatherConstants.ENGLAND_MEAN_TEMP_FILE);
		Utils.getFileData(WeatherConstants.ENGLAND_SUNSHINE_URL,
				WeatherConstants.ROOT_LOCATION + WeatherConstants.ENGLAND_SUNSHINE_FILE);
		Utils.getFileData(WeatherConstants.ENGLAND_RAINFALL_URL,
				WeatherConstants.ROOT_LOCATION + WeatherConstants.ENGLAND_RAINFALL_FILE);
		Utils.getFileData(WeatherConstants.WALES_MIN_TEMP_URL,
				WeatherConstants.ROOT_LOCATION + WeatherConstants.WALES_MIN_TEMP_FILE);
		Utils.getFileData(WeatherConstants.WALES_MAX_TEMP_URL,
				WeatherConstants.ROOT_LOCATION + WeatherConstants.WALES_MAX_TEMP_FILE);
		Utils.getFileData(WeatherConstants.WALES_MEAN_TEMP_URL,
				WeatherConstants.ROOT_LOCATION + WeatherConstants.WALES_MEAN_TEMP_FILE);
		Utils.getFileData(WeatherConstants.WALES_SUNSHINE_URL,
				WeatherConstants.ROOT_LOCATION + WeatherConstants.WALES_SUNSHINE_FILE);
		Utils.getFileData(WeatherConstants.WALES_RAINFALL_URL,
				WeatherConstants.ROOT_LOCATION + WeatherConstants.WALES_RAINFALL_FILE);
		Utils.getFileData(WeatherConstants.SCOTLAND_MIN_TEMP_URL,
				WeatherConstants.ROOT_LOCATION + WeatherConstants.SCOTLAND_MIN_TEMP_FILE);
		Utils.getFileData(WeatherConstants.SCOTLAND_MAX_TEMP_URL,
				WeatherConstants.ROOT_LOCATION + WeatherConstants.SCOTLAND_MAX_TEMP_FILE);
		Utils.getFileData(WeatherConstants.SCOTLAND_MEAN_TEMP_URL,
				WeatherConstants.ROOT_LOCATION + WeatherConstants.SCOTLAND_MEAN_TEMP_FILE);
		Utils.getFileData(WeatherConstants.SCOTLAND_SUNSHINE_URL,
				WeatherConstants.ROOT_LOCATION + WeatherConstants.SCOTLAND_SUNSHINE_FILE);
		Utils.getFileData(WeatherConstants.SCOTLAND_RAINFALL_URL,
				WeatherConstants.ROOT_LOCATION + WeatherConstants.SCOTLAND_RAINFALL_FILE);
	}

	private static void createResult() {
		Utils.createOutputFile(WeatherConstants.RESULT_FILE);
		Utils.readFile(WeatherConstants.ROOT_LOCATION + WeatherConstants.ENGLAND_MAX_TEMP_FILE,
				WeatherConstants.ROOT_LOCATION + WeatherConstants.RESULT_FILE, "England", "Max temp");
		Utils.readFile(WeatherConstants.ROOT_LOCATION + WeatherConstants.ENGLAND_MIN_TEMP_FILE,
				WeatherConstants.ROOT_LOCATION + WeatherConstants.RESULT_FILE, "England", "Min temp");
		Utils.readFile(WeatherConstants.ROOT_LOCATION + WeatherConstants.ENGLAND_MEAN_TEMP_FILE,
				WeatherConstants.ROOT_LOCATION + WeatherConstants.RESULT_FILE, "England", "Mean temp");
		Utils.readFile(WeatherConstants.ROOT_LOCATION + WeatherConstants.ENGLAND_RAINFALL_FILE,
				WeatherConstants.ROOT_LOCATION + WeatherConstants.RESULT_FILE, "England", "Rainfall");
		Utils.readFile(WeatherConstants.ROOT_LOCATION + WeatherConstants.ENGLAND_SUNSHINE_FILE,
				WeatherConstants.ROOT_LOCATION + WeatherConstants.RESULT_FILE, "England", "Sunshine");
		Utils.readFile(WeatherConstants.ROOT_LOCATION + WeatherConstants.UK_MAX_TEMP_FILE,
				WeatherConstants.ROOT_LOCATION + WeatherConstants.RESULT_FILE, "UK", "Max temp");
		Utils.readFile(WeatherConstants.ROOT_LOCATION + WeatherConstants.UK_MIN_TEMP_FILE,
				WeatherConstants.ROOT_LOCATION + WeatherConstants.RESULT_FILE, "UK", "Min temp");
		Utils.readFile(WeatherConstants.ROOT_LOCATION + WeatherConstants.UK_MEAN_TEMP_FILE,
				WeatherConstants.ROOT_LOCATION + WeatherConstants.RESULT_FILE, "UK", "Mean temp");
		Utils.readFile(WeatherConstants.ROOT_LOCATION + WeatherConstants.UK_RAINFALL_FILE,
				WeatherConstants.ROOT_LOCATION + WeatherConstants.RESULT_FILE, "UK", "Rainfall");
		Utils.readFile(WeatherConstants.ROOT_LOCATION + WeatherConstants.UK_SUNSHINE_FILE,
				WeatherConstants.ROOT_LOCATION + WeatherConstants.RESULT_FILE, "UK", "Sunshine");
		Utils.readFile(WeatherConstants.ROOT_LOCATION + WeatherConstants.WALES_MAX_TEMP_FILE,
				WeatherConstants.ROOT_LOCATION + WeatherConstants.RESULT_FILE, "Wales", "Max temp");
		Utils.readFile(WeatherConstants.ROOT_LOCATION + WeatherConstants.WALES_MIN_TEMP_FILE,
				WeatherConstants.ROOT_LOCATION + WeatherConstants.RESULT_FILE, "Wales", "Min temp");
		Utils.readFile(WeatherConstants.ROOT_LOCATION + WeatherConstants.WALES_MEAN_TEMP_FILE,
				WeatherConstants.ROOT_LOCATION + WeatherConstants.RESULT_FILE, "Wales", "Mean temp");
		Utils.readFile(WeatherConstants.ROOT_LOCATION + WeatherConstants.WALES_RAINFALL_FILE,
				WeatherConstants.ROOT_LOCATION + WeatherConstants.RESULT_FILE, "Wales", "Rainfall");
		Utils.readFile(WeatherConstants.ROOT_LOCATION + WeatherConstants.WALES_SUNSHINE_FILE,
				WeatherConstants.ROOT_LOCATION + WeatherConstants.RESULT_FILE, "Wales", "Sunshine");
		Utils.readFile(WeatherConstants.ROOT_LOCATION + WeatherConstants.SCOTLAND_MAX_TEMP_FILE,
				WeatherConstants.ROOT_LOCATION + WeatherConstants.RESULT_FILE, "Scotland", "Max temp");
		Utils.readFile(WeatherConstants.ROOT_LOCATION + WeatherConstants.SCOTLAND_MIN_TEMP_FILE,
				WeatherConstants.ROOT_LOCATION + WeatherConstants.RESULT_FILE, "Scotland", "Min temp");
		Utils.readFile(WeatherConstants.ROOT_LOCATION + WeatherConstants.SCOTLAND_MEAN_TEMP_FILE,
				WeatherConstants.ROOT_LOCATION + WeatherConstants.RESULT_FILE, "Scotland", "Mean temp");
		Utils.readFile(WeatherConstants.ROOT_LOCATION + WeatherConstants.SCOTLAND_RAINFALL_FILE,
				WeatherConstants.ROOT_LOCATION + WeatherConstants.RESULT_FILE, "Scotland", "Rainfall");
		Utils.readFile(WeatherConstants.ROOT_LOCATION + WeatherConstants.SCOTLAND_SUNSHINE_FILE,
				WeatherConstants.ROOT_LOCATION + WeatherConstants.RESULT_FILE, "Scotland", "Sunshine");

	}

}
