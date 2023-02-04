public class General extends Student{
	double GPA1;
	double GPA2;
	double GPA3;
	String results;
	
	public General(String name,String district,String sid,String course,double GPA1,double GPA2,double GPA3){
		super(name,district,sid,course);
		this.GPA1=GPA1;
		this.GPA2=GPA2;
		this.GPA3=GPA3;	
		String results;
	    
    }
	double getFinalResults(){
		return((GPA1+GPA2+GPA3)/3.0);
		
	}
	public String getFinalResults1(){
			if(getFinalResults()<3.00)
			{
				results=("pass");
			}
			else if (3.0<=getFinalResults() && getFinalResults()<3.30)
			{
				results=("second class(lower DEVISION)");
			}
			else if (getFinalResults()<3.70 && 3.30>=getFinalResults())
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