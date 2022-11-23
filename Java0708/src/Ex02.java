
public class Ex02 {

	public static void main(String[] args) {
		
		// 모든 클래스 저장 ctrl + shift + s
		// 창 나눠보기 : 탭 끌고 가면 됨
		
		
		// Tv 설계도 (클래스)  속성과 기능을 생각하면서 설계하자.
		// 1. 속성 : 채널, 볼륨, 전원
		// 2. 기능 : 채널up, 채널down, 볼륨up, 볼륨down, 전원on/off
		
		// 실습1. Tv클래스 속성만 설계하고 Tv 2개 만들기
		
		Tv sstv = new Tv();
		
		sstv.chnl = 1;
		sstv.vlm = 0;
		sstv.pwr = false;
		
		Tv lgtv = new Tv();
		
		lgtv.chnl = 43;
		lgtv.vlm = 11;
		lgtv.pwr = true;
		
		
		System.out.println(sstv); // Tv 타입의 주소가 저장된다.
		System.out.println(lgtv);
		
		// 기능은 메소드로 구현한다. 
		
		System.out.println(sstv.chnl);
		sstv.chnlUp();
		System.out.println(sstv.chnl);
		
		System.out.println(lgtv.chnl);
		lgtv.chnlDown();
		System.out.println(lgtv.chnl);
		
		System.out.println(sstv.vlm);
		sstv.vlmUp();
		System.out.println(sstv.vlm);
		
		System.out.println(lgtv.vlm);
		lgtv.vlmDown();
		System.out.println(lgtv.vlm);
		
		System.out.println(sstv.pwr);
		sstv.pwrSwitch();
		System.out.println(sstv.pwr);
		
		System.out.println(lgtv.pwr);
		lgtv.pwrSwitch();
		System.out.println(lgtv.pwr);
		
		
		
		
		
		
	}
}
