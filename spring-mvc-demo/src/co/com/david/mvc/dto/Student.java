package co.com.david.mvc.dto;

import java.util.LinkedHashMap;
import java.util.List;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private String favoriteLanguage;
	private List<String> operatingSystemsList;
	private LinkedHashMap<String, String> countries;
	private LinkedHashMap<String, String> languages;
	private LinkedHashMap<String, String> operatingSystemsHash;

	public Student() {
		countries = new LinkedHashMap<>();
		countries.put("BR", "Brazil");
		countries.put("FR", "France");
		countries.put("DE", "Germany");
		countries.put("IN", "India");

		languages = new LinkedHashMap<>();
		languages.put("Java", "Java");
		languages.put("C#", "C#");
		languages.put("Ruby", "Ruby");
		languages.put("JavaScript", "JavaScript");

		operatingSystemsHash = new LinkedHashMap<>();
		operatingSystemsHash.put("Linux", "Linux");
		operatingSystemsHash.put("Windows", "Windows");
		operatingSystemsHash.put("Mac", "Mac");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountries() {
		return countries;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public LinkedHashMap<String, String> getLanguages() {
		return languages;
	}

	public List<String> getOperatingSystemsList() {
		return operatingSystemsList;
	}

	public void setOperatingSystemsList(List<String> operatingSystemsList) {
		this.operatingSystemsList = operatingSystemsList;
	}

	public LinkedHashMap<String, String> getOperatingSystemsHash() {
		return operatingSystemsHash;
	}

}