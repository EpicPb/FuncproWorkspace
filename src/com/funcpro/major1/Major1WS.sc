package com.funcpro.major1

object Major1WS {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
def fib(n:Int): Int = {
	
	
	if(n==0){
		1
	}else if(n==1){
		1
	}else{

		fib(n-1) + fib(n-2)
		
	}



}                                                 //> fib: (n: Int)Int
def fibPrint(n:Int){
	if( n == 0 ){
		print(1)
	}else{
		print(fib(n) + ",")
		fibPrint(n-1)
	}
}                                                 //> fibPrint: (n: Int)Unit


fibPrint(6);                                      //> 13,8,5,3,2,1,1



def fizzString(fizzString: String): Unit = {
	
	val fizz = fizzString.startsWith("f") || fizzString.startsWith("F");
	val buzz = fizzString.endsWith("b") || fizzString.endsWith("B");
	
	if(fizz && buzz){
		println("FizzBuzz")
	}else if(fizz){
		println("Fizz");
	}else if(buzz){
		println("Buzz");
	}else {
	  println(fizzString);
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
                                                  //| res0: Int = 120



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
                                                  //| res1: Int = 5
                                                  
                                                  
                                                  
                                                  
                                                  
}