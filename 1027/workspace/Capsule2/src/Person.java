
public class Person {

	private String name=null;
	private int age=0;

	public Person(){}

	public Person(String name, int age){
		this.name=name;
		this.age=age;

	}

	public String getName(){
		return this.name;
	}

	public void getName(String name){
		this.name=name;
	}


}
