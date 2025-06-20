package text.kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18 {
	
	public void setGivenName() {
		super.givenName = "太郎" ;
	}
	
	public void eachIntroduce() {
		System.out.println("名前は" + super.familyName + super.givenName + "です");
		System.out.println("私はJavaが得意です");
	}

}
