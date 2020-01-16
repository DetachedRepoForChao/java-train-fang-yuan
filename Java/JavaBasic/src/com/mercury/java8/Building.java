package com.mercury.java8;


public interface Building {

	// FunctionalInterface contains only 1 abstract function + (0-n) default / static function
	
	void fall();
	
	String toString();
	int hashCode();
	boolean equals(Object o);
	
	
	default void x() {};
	default void y() {};
	
	static void z() {};
	static void w() {};
}
