class MyClass {
  void add(int x, int y)  //adding two integers 
  {
    System.out.println("Sum of two numbers: " &x+y);
 }
}
int division=x/y;//caculate Division of two numbers
System.out.println("Division of "+x+" and "+y+":"+division);
}
public static void main(String args[]){//main method
Scanner scan=new Scanner(System.in);
System.out.print("Enter the value to num1: ");
int num1=scan.nextInt();//reading the user input for num1
System.out.print("Enter the value to num2: ");
int num2=scan.nextInt();//reading the user input for num2
divisionNum(num1,num2);//calling the method
}
