// Q.5 Write a Java program to check whether Java is installed on your computer. 

class javainstall{

public static void main(String args[]) {

//Java Version: 1.8.0_71  
System.out.println("Java Version:"+System.getProperty("java.version"));                                                          

//Java Runtime Version: 1.8.0_71-b15                                                
System.out.println("Java Runtime Version:"+System.getProperty("java.runtime.version"));

//Java Home: /opt/jdk/jdk1.8.0_71/jre                                               
System.out.println("Java Home:"+System.getProperty("java.Home"));

//Java Vendor: Oracle Corporation                                                   
System.out.println("Java Vendor:"+System.getProperty("java.vendor"));

//Java Vendor URL: http://Java.oracle.com/                                          
System.out.println("Java Vendor URL:"+System.getProperty("java.vendor.url"));

//Java Class Path: .
System.out.println("Java Class Path:"+System.getProperty("java.class.path"));

}
}