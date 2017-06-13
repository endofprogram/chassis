package org.eop.chassis.chars;

/**
 * @author lixinjie
 * @since 2017-05-04
 */
public class Location {

	private Position begin;
	private Position end;
	
	public Location() {
		this(new Position(), new Position());
	}
	
	public Location(Position begin, Position end) {
		this.begin = begin;
		this.end = end;
	}

	public Position getBegin() {
		return begin;
	}

	public Position getEnd() {
		return end;
	}

	@Override
	public String toString() {
		return "[" + begin + "-" + end + "]";
	}

}
