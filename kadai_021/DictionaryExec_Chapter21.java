package text.kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// 辞書クラスのインスタンスを生成する
		Dictionary_Chapter21 dict = new Dictionary_Chapter21();
		
		// 調べる英単語を配列にセットする
		String[] words = new String[] {"apple", "banana", "grape", "orange"};
		
		
		// 辞書を調べるメソッドを引数指定で呼び出す
		dict.wordCheck(words);

	}

}
