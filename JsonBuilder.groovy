package com.tcs.ignio.groovy.parsing

import groovy.json.JsonBuilder;
def conntent=[id:1,name:'sowntharya'];
def builder=new JsonBuilder(content)
printlln builder.toPrettyString()

