package Interface;
 interface k1
 {
	 abstract void Home();
	 void Bangllow();
 }
 interface k2 extends k1
 {
	 void Car();
	 
 }
class interface2 implements k1,k2 
{
public void Home()
{
	 System.out.println("My home");
}
public void Bangllow()
{
	System.out.println("MY Bangloow");
}
public void Car()
{
	System.out.println("MY Car");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interface2 i2=new interface2();
		i2.Home();
		i2.Bangllow();
		i2.Car();
		
	}

}
