class Employee
{
 int id;
 String name;
  
  Employee(int id, String Name)
  {
   this.id=id;
   this.name=Name;
 
   System.out.println(id+" "+name);
 }
}





class ArrayOfObjects
{

public static void main(String args[])
{
//Emploee e1=new Employee(111,"Puja");
Employee[] e1=new Employee[500];
e1[0]=new Employee(112,"priya");
e1[2]=new Employee(113,"Puja");
e1[3]=new Employee(114,"A");

}

}
