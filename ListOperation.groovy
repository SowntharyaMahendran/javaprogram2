package com.tcs.ignio.collections

//list: Ordered cpllection of elements
//list
def names=["Sowntharya","Manisha","A","B"];//here,it is not an array([]);

//Traditioal way:java
for(def name in name){
	println "$names"
} 
//
//name.each({item->println $item })
names.each{println "$it"}

class Product{
	Integer id;
	String name;
	Double price;
}
def productList = [
	new Product(id1,name:'phone',price:10000.89),
	new Product(id2,name:'Laptop',price:10000.89),
	new Product(id3,name:'Desktop',price:10000.89),
	new Product(id4,name:'TV',price:10000.89),
	new Product(id5,name:'WashingMachine',price:10000.89),
	]
	productList.each{
		println "$it.id $it.name $it.price"
	}
	println productList.get(0).name
	
//////////////////////////////////////////////////////////////////////////////////
	def addItem(item) {
		def items = []//empty list : falsy
		//println items ? "Items" : "No items"
		items.add(item)
		items
	}
	for(int i=1;i<=10;i++)
	{
		addItem(i).each{println "$it"};
	}
//////////////////////////////////////////////////////////////////////////////////
	
	def counters = [1,2,3,4,5,6,7,8]
	println counters instanceof java.util.ArrayList
	
	//List to array conversion
	def counterArray = counters.toArray();
	println counterArray;
	
	/////////////////////////////////////////////////////////////////////////////
	//set : set and list both are same
	
	def uniqueNums = [1,2,3,4,4,6,8,4,6,7];
	//list
	uniqueNums.each{ println  "$it"}
	//set
	println " Set operations"
	def setItems= uniqueNums as Set;
	setItems.each{println "$it"}
	
	/////////////////////////////////////////////////////////////////////////////
	//Set--List--Array--One dimension by default
	//map->Dictionary-Hashtable > key:value
	
	def emptyMap = [:]//empty map
	println emptyMap ? "not empty":"empty"
	
	//employee details in Map
	def empDetails =[
		id:1,
		name:'Sowntharya',
		salary:1000.89
		];
		println empDetails
		//get Map details
		println "${empDetails.id} $empDetails.name $empDetails.Salary"
		
		//
		empDetails.each{KEy,value->
			println "$key - $value"
		}
def save(key,value) {
	def details = [:];
	details.put(key,value);
	details
}	
	def saveResults
	saveResults= save("id",10)
	saveResult.each {key,value->
	println "$key $value"
	}
	/////////////////////////////////////////////////////////////////////////////////
	//Range : which implements list
	def range=0..100;
	range.each {println "$it"}
	def letters = 'a'..'g'
	letter.each {println "$it"
		
	}	
	
	
	
	
	
	
	