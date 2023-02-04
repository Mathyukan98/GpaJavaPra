public class Student extends Campus{
	String sid;
	String course;
	public Student(String name,String district,String sid,String course){
		super(name,district);
		this.sid=sid;
		this.course=course;
	}
	void print(){
	System.out.println(sid+" "+course);
	}
}