package com.tcs.ignio.metapgm

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
@ToString(includeNames=true)
@EqualsAndHashCode(includes=["id","name"])
class Customer{
    Integer id;
	String name;
}
def cust =new Customer(id:1,name:'ram')
println cust.toString() 
def newcust =new Customer(id:1,name:'ram')
println cust.equals(newcust);