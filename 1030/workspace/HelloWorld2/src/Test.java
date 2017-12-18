
public class Test {

	public static void main(String[] args) {
		Person taro= new Person();
		taro.name="山田太郎";
		taro.age=20;
		System.out.println(taro.name);
		System.out.println(taro.age);

		Person hanako=new Person();
		hanako.name="山田花子";
		hanako.age=18;
		System.out.println(hanako.name);
		System.out.println(hanako.age);

		taro.talk();
		taro.walk();
		taro.run();

		hanako.talk();
		hanako.walk();
		hanako.run();

		Person jiro = new Person("山田次郎",21);
		System.out.println(jiro.name);
		System.out.println(jiro.age);

	}

}
