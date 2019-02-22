package com.tcs.ignio.groovy.parsing
import.groovy.json.JsonSlurper

defaultMetaClass inputText = '{ "name" : "groovy", "year": 2005 }'

//json into object
def slurper =new JsonSlurper();
def obj=slurper.parserText(inputText);
println obj
def slurperFile=new jsonSlurper();
def users = sluperFile.parse(new File("assets/users.json"));
users.each{
	user->
	println "$user.id $user.name"
}