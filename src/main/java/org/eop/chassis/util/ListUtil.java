package org.eop.chassis.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/**
 * lixinjie 2016-12-26
 */
public final class ListUtil {

	private ListUtil() {
		
	}
	
	public static <T> T getFirst(List<T> list) {
		return getAt(list, 0);
	}
	
	public static <T> T getLast(List<T> list) {
		return getAt(list, -1);
	}
	
	public static <T> T getAt(List<T> list, int index) {
		return list.get(IndexUtil.transform(index, list.size()));
	}
	
	public static <T> List<T> getRange(List<T> list, int beginIndex, int endIndex) {
		int begin = IndexUtil.transform(beginIndex, list.size());
		int end = IndexUtil.transform(endIndex, list.size(), 1);
		List<T> valueList = newList(end - begin);
		for (int i = begin; i < end; i++) {
			valueList.add(getAt(list, i));
		}
		return valueList;
	}
	
	public static <T> List<T> getDisper(List<T> list, List<Integer> indexes) {
		List<T> valueList = newList(indexes.size());
		for (int index : indexes) {
			valueList.add(getAt(list, index));
		}
		return valueList;
	}
	
	public static <T> List<T> getAllAt(List<List<T>> listList, int index) {
		List<T> valueList = newList(listList.size());
		for (List<T> list : listList) {
			valueList.add(getAt(list, index));
		}
		return valueList;
	}
	
	public static <T> List<List<T>> getAllRange(List<List<T>> listList, int beginIndex, int endIndex) {
		List<List<T>> valueListList = newList(listList.size());
		for (List<T> list : listList) {
			valueListList.add(getRange(list, beginIndex, endIndex));
		}
		return valueListList;
	}
	
	public static <T> List<List<T>> getAllDisper(List<List<T>> listList, List<Integer> indexes) {
		List<List<T>> valueListList = newList(listList.size());
		for (List<T> list : listList) {
			valueListList.add(getDisper(list, indexes));
		}
		return valueListList;
	}
	
	
	
	public static <T> T getItem(List<T> list, int index) {
		return TypeUtil.asType(getAt(list, index));
	}
	
	public static <T> List<T> getList(List<T> list, int beginIndex, int endIndex) {
		return TypeUtil.asListType(getRange(list, beginIndex, endIndex));
	}
	
	public static <T> List<T> getList(List<T> list, List<Integer> indexes) {
		return TypeUtil.asListType(getDisper(list, indexes));
	}
	
	
	
	public static <T> List<T> getList(List<List<T>> listList, int index) {
		return TypeUtil.asListType(getAt(listList, index));
	}
	
	public static <T> List<List<T>> getListList(List<List<T>> listList, int beginIndex, int endIndex) {
		return TypeUtil.asListListType(getRange(listList, beginIndex, endIndex));
	}
	
	public static <T> List<List<T>> getListList(List<List<T>> listList, List<Integer> indexes) {
		return TypeUtil.asListListType(getDisper(listList, indexes));
	}
	
	
	
	public static <T> List<List<Map<String, T>>> getMapListList(List<List<List<Object>>> listListList, int index) {
		return TypeUtil.asMapListListType(getAt(listListList, index));
	}
	
	public static <T> List<List<T>> getElementListList(List<List<List<Object>>> listListList, int index) {
		return TypeUtil.asListListType(getAt(listListList, index));
	}
	
	public static <T> List<List<List<T>>> getListListList(List<List<List<Object>>> listListList, int index) {
		return TypeUtil.asListListListType(getAt(listListList, index));
	}
	
	public static <T> List<List<List<T>>> getListListList(List<List<List<Object>>> listListList, int beginIndex, int endIndex) {
		return TypeUtil.asListListListType(getRange(listListList, beginIndex, endIndex));
	}
	
	public static <T> List<List<List<T>>> getListListList(List<List<List<Object>>> listListList, List<Integer> indexes) {
		return TypeUtil.asListListListType(getDisper(listListList, indexes));
	}
	
	
	
	public static <T> List<List<net.sf.json.JSONObject>> getNetsfJsonObjectListList(List<List<List<Object>>> listListList, int index) {
		return TypeUtil.asListListType(getAt(listListList, index));
	}
	
	
	
	public static <T> List<List<com.alibaba.fastjson.JSONObject>> getFastJsonObjectListList(List<List<List<Object>>> listListList, int index) {
		return TypeUtil.asListListType(getAt(listListList, index));
	}
	
	
	
	public static <T> List<List<org.w3c.dom.Element>> getW3cElementListList(List<List<List<Object>>> listListList, int index) {
		return TypeUtil.asListListType(getAt(listListList, index));
	}
	
	
	
	public static <T> List<T> newList() {
		return new ArrayList<>();
	}
	
	public static <T> List<T> newList(int size) {
		return new ArrayList<>(size);
	}
	
	@SafeVarargs
	public static <T> List<T> newList(T... values) {
		return new ArrayList<>(Arrays.asList(values));
	}
}
