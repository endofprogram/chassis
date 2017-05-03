package org.eop.chassis.util;

import java.util.List;
import java.util.Map;
/**
 * lixinjie 2016-12-26
 */
public final class MapUtil {

	private MapUtil() {
		
	}
	
	public static <T> T getValue(Map<String, Object> map, String key) {
		if (TypeUtil.notMap(map.get(key)) && TypeUtil.notList(map.get(key))) {
			return TypeUtil.asType(map.get(key));
		}
		return null;
	}
	
	public static <T> Map<String, T> getMap(Map<String, Object> map, String key) {
		if (TypeUtil.isMap(map.get(key))) {
			return TypeUtil.asMapType(map.get(key));
		}
		return null;
	}
	
	public static <T> List<T> getList(Map<String, Object> map, String key) {
		if (TypeUtil.isList(map.get(key))) {
			return TypeUtil.asListType(map.get(key));
		}
		return null;
	}
	
	public static <T> List<T> getValueList(Map<String, Object> map, String key) {
		List<T> list = getList(map, key);
		if (EmptyUtil.isEmpty(list)) {
			return null;
		}
		if (TypeUtil.notMap(ListUtil.getFirst(list))) {
			return list;
		}
		return null;
	}
	
	public static <T> List<Map<String, T>> getMapList(Map<String, Object> map, String key) {
		List<T> list = getList(map, key);
		if (EmptyUtil.isEmpty(list)) {
			return null;
		}
		if (TypeUtil.isMap(ListUtil.getFirst(list))) {
			return TypeUtil.asMapListType(list);
		}
		return null;
	}
	
	
	
	public static <T> List<List<T>> getListList(Map<String, Object> map, String key) {
		List<T> list = getList(map, key);
		if (EmptyUtil.isEmpty(list)) {
			return null;
		}
		if (TypeUtil.isList(ListUtil.getFirst(list))) {
			return TypeUtil.asListListType(list);
		}
		return null;
	}
	
	public static <T> List<List<Map<String, T>>> getMapListList(Map<String, Object> map, String key) {
		List<T> list = getList(map, key);
		if (EmptyUtil.isEmpty(list)) {
			return null;
		}
		if (TypeUtil.notList(ListUtil.getFirst(list))) {
			return null;
		}
		List<T> first = TypeUtil.asListType(ListUtil.getFirst(list));
		if (TypeUtil.isMap(ListUtil.getFirst(first))) {
			return TypeUtil.asMapListListType(list);
		}
		return null;
	}
	
	public static <T> List<List<List<T>>> getListListList(Map<String, Object> map, String key) {
		List<T> list = getList(map, key);
		if (EmptyUtil.isEmpty(list)) {
			return null;
		}
		if (TypeUtil.notList(ListUtil.getFirst(list))) {
			return null;
		}
		List<T> first = TypeUtil.asListType(ListUtil.getFirst(list));
		if (TypeUtil.isList(ListUtil.getFirst(first))) {
			return TypeUtil.asListListListType(list);
		}
		return null;
	}
	
	public static <T> List<List<T>> getElementListList(Map<String, Object> map, String key) {
		List<T> list = getList(map, key);
		if (EmptyUtil.isEmpty(list)) {
			return null;
		}
		if (TypeUtil.notList(ListUtil.getFirst(list))) {
			return null;
		}
		List<T> first = TypeUtil.asListType(ListUtil.getFirst(list));
		if (TypeUtil.isMap(ListUtil.getFirst(first))) {
			return null;
		}
		if (TypeUtil.isList(ListUtil.getFirst(first))) {
			return null;
		}
		return TypeUtil.asListListType(list);
	}
	
	
	
	public static <T> List<T> getAllValue(List<Map<String, Object>> mapList, String key) {
		List<Object> valueList = ListUtil.newList(mapList.size());
		for (Map<String, Object> map : mapList) {
			valueList.add(getValue(map, key));
		}
		return TypeUtil.asListType(valueList);
	}
	
	public static <T> List<Map<String, T>> getAllMap(List<Map<String, Object>> mapList, String key) {
		List<Object> valueList = ListUtil.newList(mapList.size());
		for (Map<String, Object> map : mapList) {
			valueList.add(getMap(map, key));
		}
		return TypeUtil.asMapListType(valueList);
	}
	
	public static <T> List<List<T>> getAllValueList(List<Map<String, Object>> mapList, String key) {
		List<List<Object>> valueListList = ListUtil.newList(mapList.size());
		for (Map<String, Object> map : mapList) {
			valueListList.add(getValueList(map, key));
		}
		return TypeUtil.asListListType(valueListList);
	}
	
	public static <T> List<List<Map<String, T>>> getAllMapList(List<Map<String, Object>> mapList, String key) {
		List<List<Map<String, Object>>> valueListList = ListUtil.newList(mapList.size());
		for (Map<String, Object> map : mapList) {
			valueListList.add(getMapList(map, key));
		}
		return TypeUtil.asMapListListType(valueListList);
	}
	
	public static <T> List<List<List<T>>> getAllListList(List<Map<String, Object>> mapList, String key) {
		List<List<List<Object>>> valueListList = ListUtil.newList(mapList.size());
		for (Map<String, Object> map : mapList) {
			valueListList.add(getListList(map, key));
		}
		return TypeUtil.asListListListType(valueListList);
	}
}
