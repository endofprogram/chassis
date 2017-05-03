package org.eop.chassis.util;
/**
 * lixinjie 2016-12-26
 */
public final class IndexUtil {

	private IndexUtil() {
		
	}
	
	public static int transform(int index, int size) {
		return transform(index, size, 0);
	}
	
	public static int transform(int index, int size, int delta) {
		if (index < 0) {
			return index + size + delta;
		}
		return index;
	}
}
