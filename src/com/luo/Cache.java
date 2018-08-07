package com.luo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cache {
	
	public static Cache cache = null;
	
	Map<String,List<String>> userFavorites = new HashMap<String,List<String>>();
	
	public static Cache getInstance() {
		if (cache == null) {
			cache = new Cache();
		}
		return cache;
	}
	
	public void put(String key, String value) {
		List<String> values = userFavorites.get(key);
		if (values == null) {
			values = new ArrayList<String>();
			userFavorites.put(key, values);
		}
		values.add(value);
	}
	
	public List<String> get(String key) {
		List<String> values = userFavorites.get(key);
		if (values == null) {
			values = new ArrayList<String>();
			userFavorites.put(key, values);
		}
		return values;
	}
}
