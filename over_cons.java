package pack3;

class Bank
{
  String name;  //class variables
  int acc_no;
  
  Bank()  // constructor with no args
  {
	  name = "naveen";
	  acc_no = 11;
  }
  
  Bank(String name)  //constructor with 1 arg
  {
	  this.name = name;
	  acc_no = 12;
  }
  Bank(String name, int acc_no)
  {
	  this.name =name;
	  this.acc_no = acc_no;
  }
  
  void Show()
  {
	  System.out.println("name = "+name+" acc_no = "+acc_no);  //class var
  }
}

public class over_cons 
{
	public static void main(String[] args) 
	{
Bank obj1 = new Bank();
obj1.Show();
Bank obj2 = new Bank("suresh");
obj2.Show();
Bank obj3 = new Bank("sai",13);
obj3.Show();
	}
}
