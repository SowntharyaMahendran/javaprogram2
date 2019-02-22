package com.tcs.ignio.closure

def upperCaseClosure = {"${delegate.name.toUpperCase()}"};

class Employe{
	String name;
}

def name = new Employee(name:'Sowntharya')
//I am going to bind emp.name property to upperCaseClosure
//Employee object is going to borrow the Closure.
upperCaseClosure.delegate=emp;
println " upperCaseClosure Delegate is ${upperCaseClosure.delegate}"
println upperCaseClosure("Welcome to ")

//////////////////////////////////////////////////////////////////////////////
//Binding methods dynamically with help of resolvesStrategy
def writer={
	append('Hello\n') // append('hello)
	append('Sowntharya') // append('sowntharya)
	};
def append(String str)
{
	"Fake append"
} 
	
StringBuilder sb = new StringBuilder();
// I am going to bind writer's append method to stringBuilder Object
writer.resolveStrategy=Closure.DELEGATE_FIRST
	write.delegate = sb;
	println writer();
	////////////////////////////////////////////////////////////////////////////
	this.food = "wife food";
	def selsectFood = {"today my food choice is $food"};
	
	class Hotel{
		String food;
	}
	def hotel= new Hotel(food:'Hotel Food');
//selectFood.resolveStrategy =Closure.DELEGATE_ONLY; //which means it will check only delegate if delegate does not
//hold anything means it will thorw an error
	selectFood.resolveStrategy =Closure.DELEGATE_FIRST;
	selectFood.delegate = hotel;
	println selectFood()
	
	
