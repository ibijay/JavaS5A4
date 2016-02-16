
public class ClassBankOvrrMain 
{
	public static void main(String[] arg)
	{
		 //Objcbo = new ClassBankOvrr();
		ClassBankOvrr Objsbi = new ClassSBI();
		ClassBankOvrr Objicic = new ClassICIC();
		ClassBankOvrr ObjAxis = new ClassAxis();
		
		System.out.println("State Bank Rate of Interest :"+Objsbi.getRateOfInterest());
		System.out.println("ICICI Bank Rate of Interest :"+Objicic.getRateOfInterest());
		System.out.println("Axis Bank Rate of Interest :"+ObjAxis.getRateOfInterest());
 	}
	
}
