package com.funcpro.major1

object Major1WS {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
def fib(n:Int): Int = {
	
	print(n + " ");
	if(n==0){
		1
	}else if(n==1){
		1
	}else{
		fib(n-1) + fib(n-2)
		
	}



}                                                 //> fib: (n: Int)Int


fib(6)                                            //> 6 5 4 3 2 1 0 1 2 1 0 3 2 1 0 1 4 3 2 1 0 1 2 1 0 res0: Int = 13



def fizzString(fizzString: String): Unit = {
	if(fizzString.startsWith("f") || fizzString.startsWith("F")){
		if(fizzString.endsWith("b") || fizzString.endsWith("B")){
		println("FizzBuzz")
		}else{
		println("Fizz")
		}
	}else if(fizzString.endsWith("b") || fizzString.endsWith("B")){
		println("Buzz")
	}
	
}                                                 //> fizzString: (fizzString: String)Unit

              
fizzString("gib")                                 //> Buzz
fizzString("fib")                                 //> FizzBuzz
fizzString("fig")                                 //> Fizz
    
    
    
 def factorial(n:Int): Int = {
	
	if(n+1==0){
		n
	}else if(n+1==1){
		1
	}else{
		println(n)
		n * factorial(n-1)
		
	}



}                                                 //> factorial: (n: Int)Int
                                                  
 factorial(5)                                     //> 5
                                                  //| 4
                                                  //| 3
                                                  //| 2
                                                  //| 1
                                                  //| res1: Int = 120



def sumDig(n:Int):Int = {
	if(n/10 == 0){
		n
	}	else{
	println(n)
		sumDig(n % 10) + sumDig(n /10)
	}
	

}                                                 //> sumDig: (n: Int)Int



sumDig(11111)                                     //> 11111
                                                  //| 1111
                                                  //| 111
                                                  //| 11
                                                  //| res2: Int = 5
}