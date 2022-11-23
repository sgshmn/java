
public class Tv {

	int chnl;
	int vlm;
	boolean pwr;
	
	// private 로 하면 다른 클래스에서 접근 할 수가 없다
	// static 안 쓴다. 왜?
	
	public void chnlUp() {
		chnl++;
	}
	
	public void chnlDown() {
		chnl--;
	}
	
	public void vlmUp() {
		vlm++;
	}
	
	public void vlmDown() {
		vlm--;
	}
	
	public void pwrSwitch() {
		pwr = !pwr;
	}
	
}
