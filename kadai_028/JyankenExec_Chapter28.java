package text.kadai_028;

public class JyankenExec_Chapter28 {

	public static void main(String[] args) {
		
		// じゃんけんクラスのインスタンスを作成する
		Jyanken_Chapter28 jyanken = new Jyanken_Chapter28();
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		// getMyChoiceメソッドを用いて自分のじゃんけんの手を入力する
		String myChoice = jyanken.getMyChoice();
		
		// 対戦相手のじゃんけんの手が乱数で選ばれる
		String opponentChoice = jyanken.getRandom();
		
		// じゃんけんの結果を出力する
		jyanken.playGame(myChoice, opponentChoice);
		
	}

}
