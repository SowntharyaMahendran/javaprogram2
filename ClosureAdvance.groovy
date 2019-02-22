package com.tcs.ignio.closure

 //closure with Args + default value
def add={def a,def b ->
	def result = a.plus b
	println "$result"
}
add(5,6)
add();

def greet;
//closure no arg,only body
greet={ ->println "greet"};
greet();

//closure no arg,only body,skip arrow
greet= {println "greet"};
greet();

//single parameter
def sayMyName
//sayMyName ={def name -> println "$name"};this is not neccessary to write like this for single parameter
sayMyName ={println "$it"}
sayMyName ('Sowntharya')

//Returning values

def counter;
counter={ return 10; }
println counter()
//without return statement
counter ={10};
println counter()

//parameter +return
def likeAction;
likeAction= {like-> ++like}
println likeAction(1)
likeAction = {++it}
println likeAction(1);

////////////////
//Typed parameter
def isOdd = {int i ->i%2 !=0}
println isOdd(1) ? "Odd Number": "Even Number"

//Without type


def isEven = {it%2==0}
println isEven(10)? "Even Number" : "Odd Number"

////////////////////////
//Multi line
def UserInput = {
	println "enter your name";
	def name = it.next()
	println "your sweet name is $name";
}
UserInput(new Scanner(System.in))
////////////////////////////////////////

//vai variable:Closure
def hello={println "hello"};
doIt(hello);
//directly we can pass closure
doIt({println "hai"});
////////////////////////////////////////

//closure as parameter with args
def login(def validate)
{
	validate('admin','admin')
}
login({name,password->println "$name $password"})
////////////////////////////////////////

//closure as parameter with args and return
def register(def validate){
	def userInfo=validate('admin','admin');
	println userInfo;
}
register({name,password-> "$name $password"})

////////////////////////////////////////
//Return a closure from a method
/*
 * Closure must be returned by using return statement only 
 * the reson is avoid confusion regarding {}
 * 
 */
def getInfo(){
	return {println "Info"
}
def info=getInfo()
info();
//shortcut is
getInfo()()

//////////////////////////////////////

//When closure returns: params,returns

def getMachineInfo(def info) {
	return {def newInfo ->
		println "$info $newInfo"
	}
}
getMachineInfo('IBM')()
/////////////////////////

//can i call nested closures outside?
def suite ={
	println "suite"
	//def unit={ println "unit" }
	//return unit;
	return {
		println "unit";
		return { println "atomic" }
	}
}
//def unit=suite();
//unit ()();
suite("suit")("unit")("Atomic")
////////////////////////////////////////
class shape{
	def getCordinate(){
		return {x,y,z->
			"$x $y $z"
		}
	}
}
def s=new Shape()
def result=s.getCordinate()
println result(1,2,3)
