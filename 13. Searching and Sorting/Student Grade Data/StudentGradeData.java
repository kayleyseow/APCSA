//basically the client, user enters info using this and this file calls on the StudentInformation object
import java.util.*;///scanner
import java.io.*;//file thingy
public class StudentGradeData{
	public static void main(String[] args) throws FileNotFoundException {// if the user inputs wrong/missing file, will give this message
	    Scanner console = new Scanner(System.in);
	    System.out.println("Enter student data file name: ");
	    Scanner inputtedfilename = new Scanner(new File(console.next()));
		List<StudentInformation> studentl = new ArrayList<StudentInformation>();
		do{//do while loop to enter the data into the StudentInformation object
			StudentInformation student = new StudentInformation(inputtedfilename.nextLine());
			studentl.add(student);
		}
		while (inputtedfilename.hasNext());//end condition
		sortln(studentl);//calls all of the 10 sorting methods
		sortfn(studentl);
		sorts(studentl);
		sortp(studentl);
		sortg(studentl);
		sortlnrev(studentl);
		sortfnrev(studentl);
		sortsrev(studentl);
		sortprev(studentl);
		sortgrev(studentl);
	}
	public static void sortln(List<StudentInformation> silist){
		System.out.println("Student data, by last name:");
		Comparator<StudentInformation> ln= new Comparator<StudentInformation>(){
			public int compare(StudentInformation student1, StudentInformation student2){
				return student1.lastname.compareTo(student2.lastname);
			}
		};
		Collections.sort(silist, ln);
		for(StudentInformation st:silist) System.out.println(st.toString());
		System.out.println();
	}
	public static void sortfn(List<StudentInformation> silist){
		System.out.println("Student data, by first name:");
		Comparator<StudentInformation> fn= new Comparator<StudentInformation>(){
			public int compare(StudentInformation student1, StudentInformation student2){
				return student1.firstname.compareTo(student2.firstname);
			}
		};
		Collections.sort(silist, fn);
		for(StudentInformation st:silist) System.out.println(st.toString());
		System.out.println();
	}
	public static void sorts(List<StudentInformation> silist){
		System.out.println("Student data, by student id:");
		Comparator<StudentInformation> s= new Comparator<StudentInformation>(){
			public int compare(StudentInformation student1, StudentInformation student2){
				return student1.id-student2.id;
			}
		};
		Collections.sort(silist, s);
		for(StudentInformation st:silist) System.out.println(st.toString());
		System.out.println();
	}
	public static void sortp(List<StudentInformation> silist){
		System.out.println("Student data, by percentage:");
		Comparator<StudentInformation> p= new Comparator<StudentInformation>(){
			public int compare(StudentInformation student1, StudentInformation student2){
				if (student1.p>student2.p)return 1;
				if (student1.p<student2.p)return -1;
				return 0;
			}
		};
		Collections.sort(silist, p);
		for(StudentInformation st:silist) System.out.println(st.toString());
		System.out.println();
	}
	public static void sortg(List<StudentInformation> silist){
		System.out.println("Student data, by grade:");
		Comparator<StudentInformation> g= new Comparator<StudentInformation>(){
			public int compare(StudentInformation student1, StudentInformation student2){
				return student1.grd.compareTo(student2.grd);
			}
		};
		Collections.sort(silist, g);
		for(StudentInformation st:silist) System.out.println(st.toString());
		System.out.println();
	}
	public static void sortlnrev(List<StudentInformation> silist){
		System.out.println("Student data, by last name(reversed):");
		Comparator<StudentInformation> ln= new Comparator<StudentInformation>(){
			public int compare(StudentInformation student1, StudentInformation student2){
				return student2.lastname.compareTo(student1.lastname);
			}
		};
		Collections.sort(silist, ln);
		for(StudentInformation st:silist) System.out.println(st.toString());
		System.out.println();
	}
	public static void sortfnrev(List<StudentInformation> silist){
		System.out.println("Student data, by first name(reversed):");
		Comparator<StudentInformation> fn= new Comparator<StudentInformation>(){
			public int compare(StudentInformation student1, StudentInformation student2){
				return student2.firstname.compareTo(student1.firstname);
			}
		};
		Collections.sort(silist, fn);
		for(StudentInformation st:silist) System.out.println(st.toString());
		System.out.println();
	}
	public static void sortsrev(List<StudentInformation> silist){
		System.out.println("Student data, by student id(reversed):");
		Comparator<StudentInformation> s= new Comparator<StudentInformation>(){
			public int compare(StudentInformation student1, StudentInformation student2){
				return student2.id-student1.id;
			}
		};
		Collections.sort(silist, s);
		for(StudentInformation st:silist) System.out.println(st.toString());
		System.out.println();
	}
	public static void sortprev(List<StudentInformation> silist){
		System.out.println("Student data, by percentage(reversed):");
		Comparator<StudentInformation> p= new Comparator<StudentInformation>(){
			public int compare(StudentInformation student1, StudentInformation student2){
				if (student2.p>student1.p)return 1;
				if (student2.p<student1.p)return -1;
				return 0;
			}
		};
		Collections.sort(silist, p);
		for(StudentInformation st:silist) System.out.println(st.toString());
		System.out.println();
	}
	public static void sortgrev(List<StudentInformation> silist){
		System.out.println("Student data, by grade(reversed):");
		Comparator<StudentInformation> g= new Comparator<StudentInformation>(){
			public int compare(StudentInformation student1, StudentInformation student2){
				return student2.grd.compareTo(student1.grd);
			}
		};
		Collections.sort(silist, g);
		for(StudentInformation st:silist) System.out.println(st.toString());
		System.out.println();
	}
}
