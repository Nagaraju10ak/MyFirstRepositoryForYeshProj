package javabasics;

class MyImp extends Car
{

	@Override
	public void gear() {
		// TODO Auto-generated method stub
		
		System.out.println("My CAR has 5 gears");
		
	}

	@Override
	public void steering() {
		// TODO Auto-generated method stub
		System.out.println("My CAR has POWER STEERING");
	}
	
	public void ownDesign()
	{
		System.out.println("My CAR has barCode scanner");
	}
	
	
	public static void main(String[] args) {
		Car obj = new MyImp();
		
	}
}
