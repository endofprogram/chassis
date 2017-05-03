package org.eop.chassis.datatype.anole;

public class IndexAnole {

	private IndexAnole() {
		
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
