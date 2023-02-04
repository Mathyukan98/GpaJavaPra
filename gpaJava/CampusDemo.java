public class CampusDemo{
	public static void main(String[] args){
		General obj =new General("mathy","mannar","2017/ICTS/79","ICTS",2.5,2.3,2.6);
		Special obj1=new Special("mathy","mannar","2017/ICTS/79","ICTS",2.5,2.3,2.6,2.5);
		Staff   obj2=new Staff("mathyukan","mannar","webdeveloper","981533615v",2,10000);
		//Campus on= new Campus("")
		
		double x=obj.getFinalResults();
		double y=obj1.getFinalResultsGAP();
		double z=obj2.getSalary();
		String p=obj1.getFinalResultsGPA();
		String Q=obj.getFinalResults1();
		
		obj2.print();
		//obj1.print();

		System.out.println(x+" "+Q);
		System.out.println(y+" "+p);
		System.out.println(z);
		//System.out.println(p);
		//System.out.println(Q);
	}
}