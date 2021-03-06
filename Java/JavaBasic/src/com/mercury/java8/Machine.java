package com.mercury.java8;

public interface Machine {

	// all functions are public:
	// 1. abstract (by default) : must no body, 
	// 2. static function : must have body, class level function
	// 3. default : object level function
	
	void test();
	
	// can only be invoked from the interface
	// unable to be called from any object
	static void foo() {
		
	}
	
	// default keyword can only be used in front of a function in interface
	default void bar() {
		
	}
}
