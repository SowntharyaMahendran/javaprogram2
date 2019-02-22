package com.tcs.ignio.closure

def greet = { println "$it" }
//calling
greet('hey') // greet.call()
greet.call('hello');
println greet instance groovy.lang.Closure
//////////////////////////////////////////////////////
//Typed Closure:Closure can be typed: closure parameters,return values
//can be fixed with type

Closure<Boolean> isActive= {ststus ->
	status
}
println isActive(10)
//////////////////////////////////////////////////////
//functional programming:curry
def log={
	String type,
	Date creation,
	String msg->
	println "$creation, $type:$msg"
};
//log('Info',new Date(),'the record is deleted')
//curry
def typeLog = log.curry("Info")
	//typeLog(new Date(),'the record is deleted')
//curry
	def dateLog = typeLog.curry(new Date());
	dateLog('the record is deleted')
///////////////////////////////////////////////////////
//left curry: pass from right side to left side
def nCopies = { int n,String str-> str*n }
def twice = nCopies.curry(2)
println twice('tcs')
///////////////////////////////////////////////////////
//left curry: pass from left to right
def threetimes = nCopies.rcurry('tcs')
println threetimes(3)
///////////////////////////////////////////////////////
//Index based currying
//In case a closure accept more than 2 parameters,
//it is possible to set an arbitary parameter using ncurry
def Volume = {double 1, double w, double h -> 1*w*h}
def fixedWidthVolume = Volume.ncurry(1, 2d,3d)
println fixedWidthVolume(2d)
/////////////////////////////////////////////////////////////////




