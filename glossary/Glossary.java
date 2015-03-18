package com.veinik.glossary;

import java.util.HashMap;

public class Glossary {

	private HashMap<String, String> map;

		public Glossary() {

			map = new HashMap<String, String>();
		}

	public void addWord(String word, String minning) {
		map.put(word, minning);
	}

	public void delWord(String word) {
		map.remove(word);
	}

	public void print(String str){
		System.out.println(str);
	}

	public String showMinning(String word) {
		String antwort = "Cannot find this word";
		if(map.containsKey(word)){
			return map.get(word);
		} else {
			return antwort;
		}
	}
}
