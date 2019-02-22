package com.tcs.ignio.closure


/* Trampoline: Recursive algorithm are often restricted by a
 *  physical limit: the maximum stack height.
 */

 def factorial
 factorial={ int n,def accu = 1g ->
	 if(n<2)return accu
	 factorial.trampoline(n-1,n*accu)
 }
 factorial=factorial.trampoline()
 //factorial=factorial
 println factorial(1000)