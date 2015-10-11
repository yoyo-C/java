package containers;

import java.util.HashSet;

class Score{
	private String name;
	private String course;
	private float grade;

	public Score(String name, String course, float grade){
		this.name = name;
		this.course = course;
		this.grade = grade;
	}
	
	
	public float getGrade(){
		return grade;
	}
	
	public String getName(){
		return name;
	}
	
	public String getCourse(){
		return course;
	}	
}

class Table{
	private HashSet<Score> all = new HashSet<Score>();
	
	public void add(Score i){
		all.add(i);
	}
	
	public void query_name(String name){
		for (Score i : all){
			if (i.getName() == name){
				System.out.println(i.getCourse()+"  "+i.getGrade());
			}
			else{
				System.out.println("Not Found!");
			}
		}
	}
	
	public void query_course(String course){
		for(Score i:all){
			if(i.getCourse() == course){
				System.out.println(i.getName()+"  "+i.getGrade());
		  	}
			else{
				System.out.println("Not Found!");
			}
		}
	}
}


public class ScoreTable {
	public static void main(String[] args){
		Table tb = new Table();
		tb.add(new Score("111","aaa",7));
		tb.add(new Score("112","aaa",8));
		tb.add(new Score("111","bbb",9));
		tb.add(new Score("112","bbb",10));
		tb.add(new Score("113","aaa",9));
		   
		tb.query_name("111");
		System.out.println("----------------------");
		tb.query_course("bbb");
	}
	

}
