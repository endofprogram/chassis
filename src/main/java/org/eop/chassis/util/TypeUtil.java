package org.eop.chassis.util;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
/**
 * lixinjie 2016-12-26
 */
public final class TypeUtil {

	private TypeUtil() {
		
	}
	
	public static BigDecimal toBigDecimal(Object value) {
		return toType(value, BigDecimal.class);
	}
	
	public static BigInteger toBigInteger(Object value) {
		return toType(value, BigInteger.class);
	}
	
	public static Boolean toBoolean(Object value) {
		return toType(value, Boolean.class);
	}
	
	public static Byte toByte(Object value) {
		return toType(value, Byte.class);
	}
	
	public static Date toDate(Object value) {
		return toType(value, Date.class);
	}
	
	public static Date toDate(Object value, String format) {
		return toType(value, Date.class, format);
	}
	
	public static Double toDouble(Object value) {
		return toType(value, Double.class);
	}
	
	public static Float toFloat(Object value) {
		return toType(value, Float.class);
	}
	
	public static Integer toInteger(Object value) {
		return toType(value, Integer.class);
	}
	public static Long toLong(Object value) {
		return toType(value, Long.class);
	}
	
	public static Short toShort(Object value) {
		return toType(value, Short.class);
	}
	
	public static String toString(Object value) {
		return toType(value, String.class);
	}
	
	public static Timestamp toTimestamp(Object value) {
		return toType(value, Timestamp.class);
	}
	
	public static Timestamp toTimestamp(Object value, String format) {
		return toType(value, Timestamp.class, format);
	}
	
	public static <T> List<T> toList(Object value) {
		if (value instanceof List<?>) {
			return asListType(value);
		}
		return asListType(ListUtil.newList(value));
	}
	
	public static <T> T toType(Object value, Class<T> type) {
		return toType(value, type, null);
	}
	
	public static <T> T toType(Object value, Class<T> type, String format) {
		if (value == null) {
			return null;
		}
		if (type == BigDecimal.class) {
			if (value instanceof BigDecimal) {
				return asType(value);
			}
			return asType(new BigDecimal(value.toString()));
		}
		if (type == BigInteger.class) {
			if (value instanceof BigInteger) {
				return asType(value);
			}
			return asType(new BigInteger(value.toString()));
		}
		if (type == Boolean.class) {
			if (value instanceof Boolean) {
				return asType(value);
			}
			return asType(new Boolean(value.toString()));
		}
		if (type == Byte.class) {
			if (value instanceof Byte) {
				return asType(value);
			}
			return asType(new Byte(value.toString()));
		}
		if (type == Date.class) {
			if (value instanceof Date) {
				return asType(value);
			}
			try {
				return asType(new SimpleDateFormat(format).parse(value.toString()));
			} catch (ParseException e) {
				throw new RuntimeException(e);
			}
		}
		if (type == Double.class) {
			if (value instanceof Double) {
				return asType(value);
			}
			return asType(new Double(value.toString()));
		}
		if (type == Float.class) {
			if (value instanceof Float) {
				return asType(value);
			}
			return asType(new Float(value.toString()));
		}
		if (type == Integer.class) {
			if (value instanceof Integer) {
				return asType(value);
			}
			return asType(new Integer(value.toString()));
		}
		if (type == Long.class) {
			if (value instanceof Long) {
				return asType(value);
			}
			return asType(new Long(value.toString()));
		}
		if (type == Short.class) {
			if (value instanceof Short) {
				return asType(value);
			}
			return asType(new Short(value.toString()));
		}
		if (type == String.class) {
			if (value instanceof String) {
				return asType(value);
			}
			return asType(value.toString());
		}
		if (type == Timestamp.class) {
			if (value instanceof Timestamp) {
				return asType(value);
			}
			try {
				return asType(new Timestamp(new SimpleDateFormat(format).parse(value.toString()).getTime()));
			} catch (ParseException e) {
				throw new RuntimeException(e);
			}
		}
		if (type == Object.class) {
			return asType(value);
		}
		return asType(value);
	}
	
	public static <T> Class<T> getType(String type) {
		if (type == null) {
			return asClassType(Object.class);
		}
		if ("BigDecimal".equals(type)) {
			return asClassType(BigDecimal.class);
		}
		if ("BigInteger".equals(type)) {
			return asClassType(BigInteger.class);
		}
		if ("Boolean".equals(type)) {
			return asClassType(Boolean.class);
		}
		if ("Byte".equals(type)) {
			return asClassType(Byte.class);
		}
		if ("Date".equals(type)) {
			return asClassType(Date.class);
		}
		if ("Double".equals(type)) {
			return asClassType(Double.class);
		}
		if ("Float".equals(type)) {
			return asClassType(Float.class);
		}
		if ("Integer".equals(type)) {
			return asClassType(Integer.class);
		}
		if ("Long".equals(type)) {
			return asClassType(Long.class);
		}
		if ("Short".equals(type)) {
			return asClassType(Short.class);
		}
		if ("String".equals(type)) {
			return asClassType(String.class);
		}
		if ("Timestamp".equals(type)) {
			return asClassType(Timestamp.class);
		}
		if ("Object".equals(type)) {
			return asClassType(Object.class);
		}
		return asClassType(Object.class);
	}
	
	public static <T> T asType(Object value) {
		return (T)value;
	}
	
	public static <T> Class<T> asClassType(Object value) {
		return (Class<T>)value;
	}
	
	public static <T> List<T> asListType(Object value) {
		return (List<T>)value;
	}
	
	public static <T> List<List<T>> asListListType(Object value) {
		return (List<List<T>>)value;
	}
	
	public static <T> Map<String, T> asMapType(Object value) {
		return (Map<String, T>)value;
	}
	
	public static <T> List<Map<String, T>> asMapListType(Object value) {
		return (List<Map<String, T>>)value;
	}
	
	public static <T> List<List<Map<String, T>>> asMapListListType(Object value) {
		return (List<List<Map<String, T>>>)value;
	}
	
	public static <T> List<List<List<T>>> asListListListType(Object value) {
		return (List<List<List<T>>>)value;
	}
	
	public static <T> boolean isMap(T value) {
		return (value instanceof Map<?, ?>);
	}
	
	public static <T> boolean notMap(T value) {
		return !(value instanceof Map<?, ?>);
	}
	
	public static <T> boolean isList(T value) {
		return (value instanceof List<?>);
	}
	
	public static <T> boolean notList(T value) {
		return !(value instanceof List<?>);
	}
	
	public static <T> boolean isNetsfJsonObject(T value) {
		return (value instanceof net.sf.json.JSONObject);
	}
	
	public static <T> boolean notNetsfJsonObject(T value) {
		return !(value instanceof net.sf.json.JSONObject);
	}
	
	public static <T> boolean isNetsfJsonArray(T value) {
		return (value instanceof net.sf.json.JSONArray);
	}
	
	public static <T> boolean notNetsfJsonArray(T value) {
		return !(value instanceof net.sf.json.JSONArray);
	}
	
	public static <T> boolean isFastJsonObject(T value) {
		return (value instanceof com.alibaba.fastjson.JSONObject);
	}
	
	public static <T> boolean notFastJsonObject(T value) {
		return !(value instanceof com.alibaba.fastjson.JSONObject);
	}
	
	public static <T> boolean isFastJsonArray(T value) {
		return (value instanceof com.alibaba.fastjson.JSONArray);
	}
	
	public static <T> boolean notFastJsonArray(T value) {
		return !(value instanceof com.alibaba.fastjson.JSONArray);
	}
	
	public static <T> boolean isW3cElement(T value) {
		return (value instanceof org.w3c.dom.Element);
	}
	
	public static <T> boolean notW3cElement(T value) {
		return !(value instanceof org.w3c.dom.Element);
	}
}
