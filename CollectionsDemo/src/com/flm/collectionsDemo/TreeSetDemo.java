package com.flm.collectionsDemo;

import java.util.ArrayList;

public class TreeSetDemo  {
	public static void main(String[] args) {
		Student s1 =new Student(1,"aswini");
		Student s2 =new Student(2,"aswini");
		Student s3 =new Student(8,"aswini");
		Student s4 =new Student(9,"aswini");
		
		ArrayList<Student> ts =new ArrayList<>();
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		
		System.out.println(ts);
		
		
		
	}
}
	 class Student implements Comparable<Student>{
		private int id;
		private String name;

		Student(int id,String name){
			this.id =id;
			this.name =name;
			
		}

		@Override
		public int compareTo(Student student) {
			this.id=id;
			if(this.id >student.id) {
				return 1;
			}
			return 0;
		}
		
	

}
