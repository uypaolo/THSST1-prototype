package model;

import java.util.ArrayList;

public class ConditionInstanceModel {
	private ArrayList<String> synonyms;
	private ArrayList<String> symptoms;
	private ArrayList<String> deficiency;
	private ArrayList<String> abundance;
	private ArrayList<String> recommended;
	private ArrayList<String> avoid;
	
	public ArrayList<String> getSynonyms() {
		return synonyms;
	}
	public void setSynonyms(ArrayList<String> synonyms) {
		this.synonyms = synonyms;
	}
	public ArrayList<String> getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(ArrayList<String> symptoms) {
		this.symptoms = symptoms;
	}
	public ArrayList<String> getDeficiency() {
		return deficiency;
	}
	public void setDeficiency(ArrayList<String> deficiency) {
		this.deficiency = deficiency;
	}
	public ArrayList<String> getAbundance() {
		return abundance;
	}
	public void setAbundance(ArrayList<String> abundance) {
		this.abundance = abundance;
	}
	public ArrayList<String> getRecommended() {
		return recommended;
	}
	public void setRecommended(ArrayList<String> recommended) {
		this.recommended = recommended;
	}
	public ArrayList<String> getAvoid() {
		return avoid;
	}
	public void setAvoid(ArrayList<String> avoid) {
		this.avoid = avoid;
	}
}
