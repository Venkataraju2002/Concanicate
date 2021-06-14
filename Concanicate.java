import java.util.*;
public class Concanicate {
	public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	System.out.println("enter two numbers");
	int a= s.nextInt();
	int b =s.nextInt();
	String n=Integer.toString(a);
	String n1 =Integer.toString(b);
	String n2 = n +n1;
	int c =Integer.parseInt(n2);//convert string data into int data
	System.out.println(c);

}}
