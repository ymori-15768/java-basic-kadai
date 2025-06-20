package text.kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18 {
	
	public void setGivenName() {
		super.givenName = "花子";
	}
	
	public void eachIntroduce() {
		System.out.println("名前は" + super.familyName + super.givenName + "です");
		System.out.println("趣味は読書です");
	}
}
