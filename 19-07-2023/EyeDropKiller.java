class OilKiller{
public static void main (String [] cooking){
System.out.println("invoking main of oil");
Oil oil=new Oil(); System.out.println(oil.name);//null
System.out.println(oil.viscosity);//0.0
System.out.println(oil.quantity);//0

Oil oil1=new Oil("Sun flower");//implicit
System.out.println(oil.name);
String value="sun flower";
Oil oil2=new Oil(value);//explicit
System.out.println(oil2.name);

Oil oil3=new Oil("coconut",50);//implicit
System.out.println(oil3.name);
System.out.println(oil3.viscosity);

Oil oil4=new Oil(80,50,"palm");//implicit
System.out.println(oil4.name);
System.out.println(oil4.viscosity);
System.out.println(oil4.quantity);

}
//Logback tool in companies
}