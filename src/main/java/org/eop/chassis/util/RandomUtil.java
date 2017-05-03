package org.eop.chassis.util;

import java.util.Random;
/**
 * lixinjie 2016-12-26
 */
public final class RandomUtil {

	private RandomUtil() {
		
	}
	
	private static final char[] ALPHABET_LOWERCASE = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'g', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
	private static final char[] ALPHABET_UPPERCASE = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'G', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
	
	/**随机数字*/
	public static String getRandomNum(int len) {
		StringBuilder sb = new StringBuilder(len);
		Random random = new Random();
		for (int i = 0; i < len; i++) {
			sb.append(random.nextInt(10));
		}
		return sb.toString();
	}
	
	/**随机小写字母*/
	public static String getRandomLCAlpha(int len) {
		StringBuilder sb = new StringBuilder(len);
		Random random = new Random();
		for (int i = 0; i < len; i++) {
			sb.append(ALPHABET_LOWERCASE[random.nextInt(26)]);
		}
		return sb.toString();
	}
	
	/**随机大写字母*/
	public static String getRandomUCAlpha(int len) {
		StringBuilder sb = new StringBuilder(len);
		Random random = new Random();
		for (int i = 0; i < len; i++) {
			sb.append(ALPHABET_UPPERCASE[random.nextInt(26)]);
		}
		return sb.toString();
	}
	
	/**随机大小写字母*/
	public static String getRandomMCAlpha(int len) {
		StringBuilder sb = new StringBuilder(len);
		Random random = new Random();
		int index;
		for (int i = 0; i < len; i++) {
			index = random.nextInt(52);
			if (index < 26) {
				sb.append(ALPHABET_LOWERCASE[index]);
			} else {
				sb.append(ALPHABET_UPPERCASE[index - 26]);
			}
		}
		return sb.toString();
	}
}
