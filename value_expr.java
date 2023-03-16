// Q.4 Write a Java program to find the value of specified expression.

class value_expr{

public static void main(String args[]) {


// a) (101 + 0) / 3

float res;
res = (101 + 0) / 3;
System.out.println("the res is:"+res);


// b) 3.0e-6 * 10000000.1

double ans;
ans = 3.0e-6 * 10000000.1;
System.out.println("the answer is:"+ans);


// c) true && true

boolean b;
b = true && true;
System.out.println("the answer is::"+b);

// d) false && true

boolean d;
d = false && true;
System.out.println("the answer is:"+d);


// e) (false && false) || (true && true)

boolean e ;
e = (false && false) || (true && true);
System.out.println("the answer is:" + e);

 
// f) (false || false) && (true && true)

boolean f;
f = (false || false) && (true && true);
    System.out.println("the answer is:" + f);


}
}