package text.kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	
	public String getMyChoice() {
		
		boolean isValid = false;
		String myChoice = "";
		
		while(!isValid) {
			Scanner scanner = new Scanner(System.in);
			myChoice = scanner.nextLine();	
			isValid=this.isValid(myChoice);
			
			try {
				if(isValid) {
					scanner.close();
				} else {
					throw new IllegalArgumentException();
				}
			} catch(IllegalArgumentException e) {
				System.out.println("r, s, pのどれかを入力してください");
			}
		}
		
		
		return myChoice;
		
		
	}
	// 入力値の判定用
	private boolean isValid(String hand) {
		if (hand.equals("r") || hand.equals("s") || hand.equals("p")) {
			return true;
		} else {
			return false;
		}
	}
	
	// 相手の手を決める
	public String getRandom() {
		String[] hands = new String[] {"r", "s", "p"};		
		int num = (int) Math.floor(Math.random() * 3 );
		return hands[num];
		
	}
	
	public void playGame(String myChoice, String opponentChoice) {
		// 自分と対戦相手のじゃんけんの手を出力する
		// じゃんけんの手の対応をHashMapで作る
		HashMap<String, String> choices = new HashMap<String, String>();
		choices.put("r", "グー");
		choices.put("s", "チョキ");
		choices.put("p", "パー");
		
		System.out.println("自分の手は" + choices.get(myChoice) + ", 対戦相手の手は" + choices.get(opponentChoice));
		
		if (myChoice.equals(opponentChoice)) {
			System.out.println("あいこです");
		} else if ((myChoice.equals("r") && opponentChoice.equals("s")) || (myChoice.equals("s") && opponentChoice.equals("p")) ||
				(myChoice.equals("p") && opponentChoice.equals("r"))) {
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");
		}
	}

}
