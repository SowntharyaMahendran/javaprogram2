
//multiline.java.style

def doc="<html>"+
        "<head>"+
		"<title>"+
		"groovy"+
		"</title>"+
		"</head>"+
	    "</html>"
println doc

//multiline groovy style
doc="""
<html>
<head>
<title>
<groovy>
</title>
</head>
</html>
""";
println doc


def name="Sowntharya"
def age= 18
//java
println name+" "+age+"years old";
//groovy String interpolation
println "${name} ${age} years old";
//short cut without {}
println "$name $age years old";
println "$name $age years old" instancceof groovy.lang.GString;//true

//difference between ''' vs """
def id=1;
def ip="169.1.2.3";
def mac="3456hHGJ";
def make="IBM AX";

//machine configuration:Json represenytation
def machineconfigJson="""
{
"id":$id,
"ip":"$ip",
"mac":"$mac",
"make":"$make"
}
""";
println machineconfigJson;



























