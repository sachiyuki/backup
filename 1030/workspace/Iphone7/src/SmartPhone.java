
public class SmartPhone implements Mp3Player, NewFunction {

	@Override
	public void play() {
		System.out.println("再生");

	}

	@Override
	public void stop() {
		System.out.println("停止");

	}

	@Override
	public void next() {
		System.out.println("次へ");

	}

	@Override
	public void back() {
		System.out.println("戻る");

	}

	@Override
	public void call() {
		System.out.println("電話");

	}

	@Override
	public void mail() {
		System.out.println("メール");

	}

	@Override
	public void photo() {
		System.out.println("写真");

	}

	@Override
	public void internet() {
		System.out.println("インターネット");

	}


}
