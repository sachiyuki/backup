
public class Person {

	private String name=null;
	private int age=0;


//　コンストラクタ

	public Person(){}

	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}

//　カプセル化

	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
	}

}
