
public class Arrays {

	public static void main(String[] args) {
//Example student marks
//Array is a datastructure useful to store value of similar datatypes.
//10 integer value
//5 float value.
//10 char value.
		//syntax datatype arrayname[]=new dataype[size];
		int size[]= {1,2,3,4,5,6};//this is hardcoading the value.
		int marks[]=new int[6];//iam telling aaray to please store 6 value of similar datatypes.
		System.out.println(marks[0]);
		marks[0]=20;
		System.out.println(marks[0]);
		marks[1]=21;
		System.out.println(marks[1]);
		System.out.println(marks[6]);// it is run time eceptionthat is outofbound exception.
	}
}
