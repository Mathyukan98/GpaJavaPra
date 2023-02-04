public class Special extends Student{
	double GPA1;
	double GPA2;
	double GPA3;
	double GPA4;
	String results;
	double finalGPA=0.0;
	
	public Special(String name,String district,String sid,String course,double GPA1,double GPA2,double GPA3,double GPA4){
		super(name,district,sid,course);
		this.GPA1=GPA1;
		this.GPA2=GPA2;
		this.GPA3=GPA3;
		this.GPA4=GPA4;
		}
		double getFinalResultsGAP(){
		return ((GPA1+GPA2+GPA3+GPA4)/4.0);
	}
	public String getFinalResultsGPA(){
			if(getFinalResultsGAP()<3.00)
			{
				results=("pass");
			}
			else if (3.0<=getFinalResultsGAP() && getFinalResultsGAP()<3.30)
			{
				results=("second class(lower DEVISION)");
			}
			else if (getFinalResultsGAP()<3.70 && 3.30>=getFinalResultsGAP())
			{
				results=("second class(upper DEVISION)");
			}
			else 
			{
				results=("fist class");
			}
		return results;
	}	 
	
}