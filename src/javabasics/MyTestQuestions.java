package javabasics;

public class MyTestQuestions implements A{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}


	

	
}
interface A extends B,C
{
	public void method2();


}
interface B
{
	public void method1();

}


interface C
{
	public void method3();
	public void method1();

}