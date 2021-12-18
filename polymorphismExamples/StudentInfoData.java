package polymorphismExamples;

public class StudentInfoData{
	public void StudentInfo(int num) {
		
	}
	public void StudentInfo(String name) {
		
	} 
	public void StudentInfo(String email,int ph) {
		
	}
	
	

	public static void main(String[] args) {
		StudentInfoData info=new StudentInfoData();
info.StudentInfo(10);

info.StudentInfo("damu");
	}}
