package org.eop.chassis.util;

import java.util.List;

import org.w3c.dom.NodeList;
/**
 * lixinjie 2016-12-26
 */
public final class EmptyUtil {

	private EmptyUtil() {
		
	}
	
	public static boolean isEmpty(String str) {
		return NullUtil.isNull(str) || str.isEmpty();
	}
	
	public static boolean notEmpty(String str) {
		return NullUtil.notNull(str) && !str.isEmpty();
	}
	
	public static <T> boolean isEmpty(List<T> list) {
		return NullUtil.isNull(list) || list.isEmpty();
	}
	
	public static <T> boolean notEmpty(List<T> list) {
		return NullUtil.notNull(list) && !list.isEmpty();
	}
	
	public static boolean isEmpty(NodeList nodeList) {
		return NullUtil.isNull(nodeList) || nodeList.getLength() < 1;
	}
	
	public static boolean notEmpty(NodeList nodeList) {
		return NullUtil.notNull(nodeList) && nodeList.getLength() > 0;
	}
	
}
