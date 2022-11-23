import java.util.ArrayList;
import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        
        
        ArrayList<MemberVO> memberlist = new ArrayList<MemberVO>();

        boolean isLogin = true;

        while(isLogin){
        
            System.out.print("[1]회원가입 [2]로그인 >> ");
            
            switch(scan.nextInt()){
            case 1:
                System.out.println("아이디와 비밀번호를 차례로 쓰세요");
                memberlist.add(new MemberVO(scan.next(), scan.next()));
                break;
            
            case 2:
                System.out.print("아이디 >> ");
                String tryid = scan.next();
                for (int i = 0; i < memberlist.size(); i++) {
						
						if (memberlist.get(i).getId().equals(tryid)) {
                            
                            System.out.print("비밀번호 >> ");
                            String trypw = scan.next();

                            
                            if (memberlist.get(i).getPw().equals(trypw)) {
                                isLogin = false;
                            }

                        }
						
						
					}
                



                break;

            }
        
        }
        
        
        System.out.print("로그인 성공!");
	}
}
