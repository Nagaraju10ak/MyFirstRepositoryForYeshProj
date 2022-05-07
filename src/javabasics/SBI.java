package javabasics;

class SBI implements RBI
{

	@Override
	public void customerSavings() {
		System.out.println("SAVING ACCOUNT");
		
	}

	@Override
	public void customerCurrent() {
		// TODO Auto-generated method stub
		
		System.out.println("CURRENT ACCOUNT");
		
	}

	@Override
	public void customerDataSecurity() {
		System.out.println("DATA SECURITY RULES");
		
	}
	
	public void SBIRules()
	{
		System.out.println("SBI RULES");
	}
	
	public static void main(String[] args) {
		RBI obj=new SBI();
	}
	

}