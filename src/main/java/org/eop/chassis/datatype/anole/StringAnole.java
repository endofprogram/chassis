package org.eop.chassis.datatype.anole;

public class StringAnole {

	private StringAnole() {
		
	}
	
	public static String getFirst(String str) {
		return getFirst(str, 1);
	}
	
	public static String getFirst(String str, int endIndex) {
		return str.substring(0, IndexAnole.transform(endIndex, str.length(), 1));
	}
	
	public static String getLast(String str) {
		return getLast(str, -1);
	}
	
	public static String getLast(String str, int beginIndex) {
		return str.substring(IndexAnole.transform(beginIndex, str.length()));
	}
	
	public static String getRange(String str, int beginIndex, int endIndex) {
		return str.substring(IndexAnole.transform(beginIndex, str.length()), IndexAnole.transform(endIndex, str.length(), 1));
	}
	
	public static String replaceAll(String str, String target, String replacement) {
		return str.replace(target, replacement);
	}
	
	public static String regexReplaceFirst(String str, String regex, String replacement) {
		return str.replaceFirst(regex, replacement);
	}
	
	public static String regexReplaceAll(String str, String regex, String replacement) {
		return str.replaceAll(regex, replacement);
	}
	
	public static String lowerCase(String str) {
		return str.toLowerCase();
	}
	
	public static String upperCase(String str) {
		return str.toUpperCase();
	}
	
	public static String trim(String str) {
		return str.trim();
	}
}
