import java.util.*;

interface StudentService {
	public List getStuentInfo();
}
class StudentServiceImpl implements StudentService{
	public List getStuentInfo(){
		List studentInfo = new LinkedList();
		studentInfo.add("Samantha");
		studentInfo.add("Trisha");
		studentInfo.add("Vijay");
		studentInfo.add("Ajith");
		return studentInfo;
	}
}
class BIT{
	public static void main(String[] a){
		//parent reference child object -> Abstraction
		StudentService ss = new StudentServiceImpl();
		List studentInfo = ss.getStuentInfo();
		for(int i = 0; i<studentInfo.size(); i++){
			System.out.println(studentInfo.get(i));
		}
	}
}