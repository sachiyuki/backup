
public class Test {

	public static void main(String[] args) {
		Person taro= new Person();
		taro.name="山田太郎";
		taro.age=20;
		taro.hobby="水泳";
		taro.birthday="1996.1.1";
		taro.job="会社員";
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.job);
		System.out.println(taro.hobby);
		System.out.println(taro.birthday);
		taro.talk();
		taro.walk();
		taro.run();


		Person hanako=new Person();
		hanako.name="鈴木花子";
		hanako.age=16;
		hanako.birthday="2000.1.2";
		hanako.job="自営業";
		hanako.hobby="買い物";
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.job);
		System.out.println(hanako.hobby);
		System.out.println(hanako.birthday);

		Person jiro=new Person();
		jiro.name="木村次郎";
		jiro.age=18;
		jiro.job="団体職員";
		jiro.hobby="クライミング";
		jiro.birthday="1998.1.3";
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.job);
		System.out.println(jiro.hobby);
		System.out.println(jiro.birthday);

		Person sachi=new Person();
		sachi.name="結城早智";
		sachi.age=25;
		sachi.birthday="";
		sachi.hobby="";
		sachi.job="";
		System.out.println(sachi.name);
		System.out.println(sachi.age);
		System.out.println(sachi.job);
		System.out.println(sachi.hobby);
		System.out.println(sachi.birthday);

	}

}
