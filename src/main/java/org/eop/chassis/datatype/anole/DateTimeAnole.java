package org.eop.chassis.datatype.anole;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeAnole {

	private DateTimeAnole() {
		
	}
	
	//=============================== parse ================================//
	
	public static Date parse(String datetime, String format) {
		try {
			return new SimpleDateFormat(format).parse(datetime);
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}
	
	/**format:yyyyMMddHHmmss, type:datetime(none), code:dtn14*/
	public static Date parseDateTimeN14(String datetime) {
		return parse(datetime, "yyyyMMddHHmmss");
	}
	
	/**format:yyyy-MM-dd HH:mm:ss, type:datetime(regular), code:dtr19*/
	public static Date parseDateTimeR19(String datetime) {
		return parse(datetime, "yyyy-MM-dd HH:mm:ss");
	}
	
	/**format:yyyy年MM月dd日 HH时mm分ss秒, type:datetime(zh_CN), code:dtz21*/
	public static Date parseDateTimeZ21(String datetime) {
		return parse(datetime, "yyyy年MM月dd日 HH时mm分ss秒");
	}
	
	/**format:yyyyMMddHH, type:datetime(none), code:dtn10*/
	public static Date parseDateTimeN10(String datetime) {
		return parse(datetime, "yyyyMMddHH");
	}
	
	/**format:yyyyMMdd, type:date(none), code:dn8*/
	public static Date parseDateN8(String date) {
		return parse(date, "yyyyMMdd");
	}
	
	/**format:yyyy-MM-dd, type:date(hyphen), code:dh10*/
	public static Date parseDateH10(String date) {
		return parse(date, "yyyy-MM-dd");
	}
	
	/**format:yyyy年MM月dd日, type:date(zh_CN), code:dz11*/
	public static Date parseDateZ11(String date) {
		return parse(date, "yyyy年MM月dd日");
	}
	
	/**format:yyyyMM, type:date(none), code:dn6*/
	public static Date parseDateN6(String date) {
		return parse(date, "yyyyMM");
	}
	
	/**format:yyyy年MM月, type:date(zh_CN), code:dz8*/
	public static Date parseDateZ8(String date) {
		return parse(date, "yyyy年MM月");
	}
	
	/**format:HHmmss, type:time(none), code:tn6*/
	public static Date parseTimeN6(String time) {
		return parse(time, "HHmmss");
	}
	
	/**format:HH:mm:ss, type:time(colon), code:tc8*/
	public static Date parseTimeC8(String time) {
		return parse(time, "HH:mm:ss");
	}
	
	/**format:HH时mm分ss秒, type:time(zh_CN), code:tz9*/
	public static Date parseTimeZ9(String time) {
		return parse(time, "HH时mm分ss秒");
	}
	
	/**format:HHmm, type:time(none), code:tn4*/
	public static Date parseTimeN4(String time) {
		return parse(time, "HHmm");
	}
	
	/**format:HH:mm, type:time(colon), code:tc5*/
	public static Date parseTimeC5(String time) {
		return parse(time, "HH:mm");
	}
	
	/**format:HH年mm月, type:time(zh_CN), code:tz6*/
	public static Date parseTimeZ6(String time) {
		return parse(time, "HH年mm月");
	}
	
	//=============================== format ================================//
	
	public static String format(Date datetime, String format) {
		return new SimpleDateFormat(format).format(datetime);
	}
	
	/**format:yyyyMMddHHmmss, type:datetime(none), code:dtn14*/
	public static String formatDateTimeN14(Date datetime) {
		return format(datetime, "yyyyMMddHHmmss");
	}
	
	/**format:yyyy-MM-dd HH:mm:ss, type:datetime(regular), code:dtr19*/
	public static String formatDateTimeR19(Date datetime) {
		return format(datetime, "yyyy-MM-dd HH:mm:ss");
	}
	
	/**format:yyyy年MM月dd日 HH时mm分ss秒, type:datetime(zh_CN), code:dtz21*/
	public static String formatDateTimeZ21(Date datetime) {
		return format(datetime, "yyyy年MM月dd日 HH时mm分ss秒");
	}
	
	/**format:yyyyMMddHH, type:datetime(none), code:dtn10*/
	public static String formatDateTimeN10(Date datetime) {
		return format(datetime, "yyyyMMddHH");
	}
	
	/**format:yyyyMMdd, type:date(none), code:dn8*/
	public static String formatDateN8(Date date) {
		return format(date, "yyyyMMdd");
	}
	
	/**format:yyyy-MM-dd, type:date(hyphen), code:dh10*/
	public static String formatDateH10(Date date) {
		return format(date, "yyyy-MM-dd");
	}
	
	/**format:yyyy年MM月dd日, type:date(zh_CN), code:dz11*/
	public static String formatDateZ11(Date date) {
		return format(date, "yyyy年MM月dd日");
	}
	
	/**format:yyyyMM, type:date(none), code:dn6*/
	public static String formatDateN6(Date date) {
		return format(date, "yyyyMM");
	}
	
	/**format:yyyy年MM月, type:date(zh_CN), code:dz8*/
	public static String formatDateZ8(Date date) {
		return format(date, "yyyy年MM月");
	}
	
	/**format:HHmmss, type:time(none), code:tn6*/
	public static String formatTimeN6(Date time) {
		return format(time, "HHmmss");
	}
	
	/**format:HH:mm:ss, type:time(colon), code:tc8*/
	public static String formatTimeC8(Date time) {
		return format(time, "HH:mm:ss");
	}
	
	/**format:HH时mm分ss秒, type:time(zh_CN), code:tz9*/
	public static String formatTimeZ9(Date time) {
		return format(time, "HH时mm分ss秒");
	}
	
	/**format:HHmm, type:time(none), code:tn4*/
	public static String formatTimeN4(Date time) {
		return format(time, "HHmm");
	}
	
	/**format:HH:mm, type:time(colon), code:tc5*/
	public static String formatTimeC5(Date time) {
		return format(time, "HH:mm");
	}
	
	/**format:HH年mm月, type:time(zh_CN), code:tz6*/
	public static String formatTimeZ6(Date time) {
		return format(time, "HH年mm月");
	}
	
	//=============================== add ================================//
	
	public static Date addDelta(Date datetime, int delta, String unit) {
		Calendar cld = Calendar.getInstance();
		cld.setTime(datetime);
		switch(unit) {
			/* year(0000-9999) */
			case "y": cld.add(Calendar.YEAR, delta); break;
			/* month(0-11) */
			case "M": cld.add(Calendar.MONTH, delta); break;
			/* date(day_of_month)(1-28/29/30/31) */
			case "d": cld.add(Calendar.DATE, delta); break;
			/* day_of_month(date)(1-28/29/30/31) */
			case "dom": cld.add(Calendar.DAY_OF_MONTH, delta); break;
			/* day_of_year(1-365/366) */
			case "D": cld.add(Calendar.DAY_OF_YEAR, delta); break;
			/* day_of_week(1-7,sun-sat) */
			case "dow": cld.add(Calendar.DAY_OF_WEEK, delta); break;
			/* hour(0-11) */
			case "h": cld.add(Calendar.HOUR, delta); break;
			/* hour_of_day(0-23) */
			case "H": cld.add(Calendar.HOUR_OF_DAY, delta); break;
			/* minute(0-59) */
			case "m": cld.add(Calendar.MINUTE, delta);break;
			/* second(0-59) */
			case "s": cld.add(Calendar.SECOND, delta); break;
			/* millisecond(0-999) */
			case "S": cld.add(Calendar.MILLISECOND, delta); break;
			/* week_of_month(1-4/5/6) */
			case "w": cld.add(Calendar.WEEK_OF_MONTH, delta); break;
			/* week_of_year(1-53) */
			case "W": cld.add(Calendar.WEEK_OF_YEAR, delta); break;
			/* day_of_week_in_month */
			case "wim": cld.add(Calendar.DAY_OF_WEEK_IN_MONTH, delta); break;
			default: break;
		}
		return cld.getTime();
	}
	
	public static Date addYear(Date datetime, int delta) {
		return addDelta(datetime, delta, "y");
	}
	
	public static Date addMonth(Date datetime, int delta) {
		return addDelta(datetime, delta, "M");
	}
	
	public static Date addDate(Date datetime, int delta) {
		return addDelta(datetime, delta, "d");
	}
	
	public static Date addDayOfMonth(Date datetime, int delta) {
		return addDelta(datetime, delta, "dom");
	}
	
	public static Date addDayOfYear(Date datetime, int delta) {
		return addDelta(datetime, delta, "D");
	}
	
	public static Date addDayOfWeek(Date datetime, int delta) {
		return addDelta(datetime, delta, "dow");
	}
	
	public static Date addAmPm(Date datetime, int delta) {
		return addDelta(datetime, delta, "apm");
	}
	
	public static Date addHour(Date datetime, int delta) {
		return addDelta(datetime, delta, "h");
	}
	
	public static Date addHourOfDay(Date datetime, int delta) {
		return addDelta(datetime, delta, "h");
	}
	
	public static Date addMinute(Date datetime, int delta) {
		return addDelta(datetime, delta, "m");
	}
	
	public static Date addSecond(Date datetime, int delta) {
		return addDelta(datetime, delta, "s");
	}
	
	public static Date addMillisecond(Date datetime, int delta) {
		return addDelta(datetime, delta, "S");
	}
	
	public static Date addWeekOfMonth(Date datetime, int delta) {
		return addDelta(datetime, delta, "w");
	}
	
	public static Date addWeekOfYear(Date datetime, int delta) {
		return addDelta(datetime, delta, "W");
	}
	
	public static Date addDayOfWeekInMonth(Date datetime, int delta) {
		return addDelta(datetime, delta, "wim");
	}
	
	//=============================== set ================================//
	
	public static Date setFixed(Date datetime, int fixed, String unit) {
		Calendar cld = Calendar.getInstance();
		cld.setTime(datetime);
		switch(unit) {
			/* year(0000-9999) */
			case "y": cld.set(Calendar.YEAR, fixed); break;
			/* month(0-11) */
			case "M": cld.set(Calendar.MONTH, fixed); break;
			/* date(day_of_month)(1-28/29/30/31) */
			case "d": cld.set(Calendar.DATE, fixed); break;
			/* day_of_month(date)(1-28/29/30/31) */
			case "dom": cld.set(Calendar.DAY_OF_MONTH, fixed); break;
			/* day_of_year(1-365/366) */
			case "D": cld.set(Calendar.DAY_OF_YEAR, fixed); break;
			/* day_of_week(1-7,sun-sat) */
			case "dow": cld.set(Calendar.DAY_OF_WEEK, fixed); break;
			/* am_pm(0/1) */
			case "apm": cld.set(Calendar.AM_PM, fixed); break;
			/* hour(0-11) */
			case "h": cld.set(Calendar.HOUR, fixed); break;
			/* hour_of_day(0-23) */
			case "H": cld.set(Calendar.HOUR_OF_DAY, fixed); break;
			/* minute(0-59) */
			case "m": cld.set(Calendar.MINUTE, fixed);break;
			/* second(0-59) */
			case "s": cld.set(Calendar.SECOND, fixed); break;
			/* millisecond(0-999) */
			case "S": cld.set(Calendar.MILLISECOND, fixed); break;
			/* week_of_month(1-4/5/6) */
			case "w": cld.set(Calendar.WEEK_OF_MONTH, fixed); break;
			/* week_of_year(1-53) */
			case "W": cld.set(Calendar.WEEK_OF_YEAR, fixed); break;
			/* day_of_week_in_month */
			case "wim": cld.set(Calendar.DAY_OF_WEEK_IN_MONTH, fixed); break;
			default: break;
		}
		return cld.getTime();
	}
	
	public static Date setYear(Date datetime, int fixed) {
		return setFixed(datetime, fixed, "y");
	}
	
	public static Date setMonth(Date datetime, int fixed) {
		return setFixed(datetime, fixed, "M");
	}
	
	public static Date setDate(Date datetime, int fixed) {
		return setFixed(datetime, fixed, "d");
	}
	
	public static Date setDayOfMonth(Date datetime, int fixed) {
		return setFixed(datetime, fixed, "dom");
	}
	
	public static Date setDayOfYear(Date datetime, int fixed) {
		return setFixed(datetime, fixed, "D");
	}
	
	public static Date setDayOfWeek(Date datetime, int fixed) {
		return setFixed(datetime, fixed, "dow");
	}
	
	public static Date setAmPm(Date datetime, int fixed) {
		return setFixed(datetime, fixed, "apm");
	}
	
	public static Date setHour(Date datetime, int fixed) {
		return setFixed(datetime, fixed, "h");
	}
	
	public static Date setHourOfDay(Date datetime, int fixed) {
		return setFixed(datetime, fixed, "h");
	}
	
	public static Date setMinute(Date datetime, int fixed) {
		return setFixed(datetime, fixed, "m");
	}
	
	public static Date setSecond(Date datetime, int fixed) {
		return setFixed(datetime, fixed, "s");
	}
	
	public static Date setMillisecond(Date datetime, int fixed) {
		return setFixed(datetime, fixed, "S");
	}
	
	public static Date setWeekOfMonth(Date datetime, int fixed) {
		return setFixed(datetime, fixed, "w");
	}
	
	public static Date setWeekOfYear(Date datetime, int fixed) {
		return setFixed(datetime, fixed, "W");
	}
	
	public static Date setDayOfWeekInMonth(Date datetime, int fixed) {
		return setFixed(datetime, fixed, "wim");
	}
}
