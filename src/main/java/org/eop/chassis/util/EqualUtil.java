package org.eop.chassis.util;

/**
 * @author lixinjie 2017-04-14
 */
public class EqualUtil {
	
	private EqualUtil() {
		
	}
	
	public static <T> boolean isEqual(T obj1, T obj2) {
		if (NullUtil.isNull(obj1) && NullUtil.isNull(obj2)) {
			return true;
		}
		if (NullUtil.notNull(obj1) && NullUtil.notNull(obj2)) {
			return obj1.equals(obj2);
		}
		return false;
	}
	
	public static <T> boolean notEqual(T obj1, T obj2) {
		if (NullUtil.isNull(obj1) && NullUtil.isNull(obj2)) {
			return false;
		}
		if (NullUtil.notNull(obj1) && NullUtil.notNull(obj2)) {
			return !obj1.equals(obj2);
		}
		return true;
	}
}
