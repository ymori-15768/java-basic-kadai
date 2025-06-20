package text.kadai_018;

public abstract class Kato_Chapter18 {
	public String familyName = "加藤";
	public String givenName;
	public String address ="東京都中野区○×";
	
	// 共通の紹介を出力する
	public void commonIntroduce() {
		System.out.println("住所は" + this.address + "です");
	}
	
	// 個別の紹介を出力する
	public abstract void eachIntroduce();
	
	// 紹介を実行する
	public void execIntroduce() {
		this.commonIntroduce();
		this.eachIntroduce();
	}
 }
