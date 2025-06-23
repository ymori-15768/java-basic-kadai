package text.kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	// 辞書クラス
	// 英単語の辞書として機能する
	
	HashMap<String, String> dict = new HashMap<String, String>();
	
	// コンストラクタで辞書を生成する
	public Dictionary_Chapter21() {
		
		this.dict.put("apple", "りんご");
		this.dict.put("peach", "桃");
		this.dict.put("banana", "バナナ");
		this.dict.put("lemon", "レモン");
		this.dict.put("pear", "梨");
		this.dict.put("kiwi", "キウィ");
		this.dict.put("strawberry", "いちご");
		this.dict.put("grape", "ぶどう");
		this.dict.put("muscat", "マスカット");
		this.dict.put("cherry", "さくらんぼ");
		
	}
	
	// ??? 辞書を調べるメソッド
	// 引数として単語を配列で受け取けとる
	// 配列の要素一つ一つについて、辞書に存在するかどうか調べる
	// 辞書に追加されている場合、調べた結果を出力する
	// ない場合、辞書に存在していない旨を出力する
	
	public void wordCheck(String words[]) {			
		
		for (String word: words) {
			
			boolean found = false;
			
			for (String key: this.dict.keySet()) {
				if (word.equals(key)) {
					System.out.println(word + "の意味は" + this.dict.get(word));
					found = true;
					break;
				}
			}
			
			if(!found) {
				System.out.println(word + "は辞書に存在していません");
			}
		}
	}
	
	
	
	
	
	
	
	

}
