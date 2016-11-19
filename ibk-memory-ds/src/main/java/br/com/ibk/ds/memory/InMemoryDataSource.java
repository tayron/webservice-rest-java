package br.com.ibk.ds.memory;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class InMemoryDataSource {
	private static final Map<Class, Map<Integer, Object>> tables = new HashMap<Class, Map<Integer, Object>>();
	
	public static <T> void registerTable(Class<T> tableName) {
		if (tables.containsKey(tableName)) {
			throw new RuntimeException("Table already exist");
		}
		tables.put(tableName, new HashMap<Integer, Object>());
	}
	
	@SuppressWarnings("unchecked")
	public static <T> Collection<T> queryAll(Class<T> tableName) {
		checkTableIsValid(tableName);
		return (Collection<T>)tables.get(tableName).values();
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T queryById(Class<T> tableName, Integer id) {
		checkTableIsValid(tableName);
		return (T)tables.get(tableName).get(id);
	}
	
	public static <T> void add(Class<T> tableName, Integer id, T object) {
		checkTableIsValid(tableName);
		checkForDuplicate(tableName, id);
		tables.get(tableName).put(id, object);
	}
	
	public static <T> void update(Class<T> tableName, Integer id, T object) {
		checkTableIsValid(tableName);
		checkIfObjectExist(tableName, id);
		tables.get(tableName).put(id, object);
	}
	
	public static <T> void delete(Class<T> tableName, Integer id) {
		checkTableIsValid(tableName);
		checkIfObjectExist(tableName, id);
		tables.get(tableName).remove(id);
	}
	
	private static <T> void checkTableIsValid(Class<T> tableName) {
		if (!tables.containsKey(tableName)) {
			throw new RuntimeException("Table does not exist");
		}
	}
	
	private static <T> void checkForDuplicate(Class<T> tableName, Integer id) {
		if (tables.containsKey(tableName) && tables.get(tableName).containsKey(id)) {
			throw new RuntimeException("Object already inserted");
		}
	}
	
	private static <T> void checkIfObjectExist(Class<T> tableName, Integer id) {
		if (tables.containsKey(tableName) && !tables.get(tableName).containsKey(id)) {
			throw new RuntimeException("Object does not exists");
		}
	}
	
	
}

