package org.eop.chassis.util;
/**
 * lixinjie 2016-12-26
 */
public final class NullUtil {

	private NullUtil() {
		
	}
	
	public static <T> boolean isNull(T value) {
		return value == null;
	}
	
	public static <T> boolean notNull(T value) {
		return value != null;
	}
}
