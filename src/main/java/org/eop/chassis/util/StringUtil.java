package org.eop.chassis.util;

import java.util.ArrayList;
import java.util.List;
/**
 * lixinjie 2016-12-26
 */
public final class StringUtil {

	private StringUtil() {
		
	}
	
	public static List<String> splitStr(String str, String delimiter) {
		List<String> strList = new ArrayList<>();
		splitStr(str, delimiter, strList);
		return strList;
	}
	
	public static void splitStr(String str, String delimiter, List<String> strList) {
		int fromIndex = 0;
		int index;
		do {
			index = str.indexOf(delimiter, fromIndex);
			if (index <= fromIndex) {
				strList.add(str.substring(fromIndex));
				break;
			}
			strList.add(str.substring(fromIndex, index));
			fromIndex = index + 1;
		} while(true);
	}
	
	public static String getFirst(String str) {
		return getFirst(str, 1);
	}
	
	public static String getFirst(String str, int endIndex) {
		return str.substring(0, IndexUtil.transform(endIndex, str.length(), 1));
	}
	
	public static String getLast(String str) {
		return getLast(str, -1);
	}
	
	public static String getLast(String str, int beginIndex) {
		return str.substring(IndexUtil.transform(beginIndex, str.length()));
	}
}
