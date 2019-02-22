package com.tcs.ignio.closure

/*I want to write utility that utility must be used on any object.
 * 
 *  Use case: I am going to create closure that is going to return the variable name in upper case, 
 *  variable name can be part of any object
 */

def upperCaseClosure = {"this is upper case closrue"};

//List the relationship properties  
println"owner = $upperCaseClosure.owner"
println "this = ${upperCaseClosure()}"
println "delegate = $upperCaseClosure.delegate"
 class Utility{
	 def converUpperCase(){
		 def upperCaseClosure = {"this is upper case Closure $this"};
		 println "owner -Inside Utility = $upperCaseClosure.owner" 
	 }
 }
 new Utility().convertUpperCase()
 
 class Employee {
	 String name;
 }
