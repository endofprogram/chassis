package org.eop.chassis.util;

import java.util.UUID;
/**
 * lixinjie 2016-12-26
 */
public final class UuidUtil {

	private UuidUtil() {
		
	}
	
	public static String getUuidStr() {
		return UUID.randomUUID().toString();
	}
}
