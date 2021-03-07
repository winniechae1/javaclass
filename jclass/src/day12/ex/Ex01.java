package day12.ex;
/*
 	문제1]
 		노래 한곡의 데이터를 기억할 클래스 Song을 정의하고 
 		10곡의 데이터를 입력해서 곡명을 입력하면 
 		해당 곡의 정보를 출력해주는 프로그램을 작성하세요.
 		
 		곡 정보는
			곡명(title), 작곡가(composer), 가수(singer), 장르(genre)
		를 기억하도록 하세요.
		
		extra ]
			가수이름을 입력하면 해당 곡들이 출력되게 하세요.
 */
import java.util.*;
public class Ex01 {
	Scanner sc = new Scanner(System.in);
	
	public Ex01() {
		Song[] song = getDataArr();
		
		toPrint(song);
		exec(song);
		sc.close();
	}
	
	public void exec(Song[] s) {
		while (true) {
			
			System.out.print("이름으로 검색 0 종료는 1");
			int no = sc.nextInt();
			System.out.println("no : " + no);
			sc.nextLine();
			
			if(no == 1) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			if(!(no == 0)) {
				System.out.println("잘못입력했습니다.");
				continue;
			}
			if(no == 0) {
				singerToInfo(s);
				break;
			}
		}
	}
	
	public void singerToInfo(Song[] s) {
		
		System.out.print("가수이름 입력 : ");
		String singer = sc.nextLine();
		
		for(int i = 0; i < s.length; i++) {
			if(s[i].getSinger().equals(singer)) {
				System.out.println(s[i].toString());
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		new Ex01();
	}
	
	public Song[] getDataArr() {
		
		Song[] s = new Song[10];
		
		for(int i = 0; i < s.length; i++) {
			s[i] = new Song();
		}
		
		String[] title = {"lovepoem", "LovesickGirls","Celebrity","circles","ashes","chariot","bellyache"
				,"perfect", "changes","paris in the rain"};
		String[] composer = {"iu","blackpink","iu2","postmalone","stellar","jacob","billie","ed","lauv","lauv"};
		String[] singer = {"iu","blackpink","iu2","postmalone","stellar","jacob","billie","ed","lauv","lauv"};
		String[] genre = {"Ballade","kpop","Ballade","pop","pop","pop","pop","pop","pop","pop"};
	
		for(int i = 0; i < s.length; i++) {
			String tle = title[i];
			String poser = composer[i];
			String ger = singer[i];
			String nre = genre[i];
			
			s[i].setTitle(tle);
			s[i].setComposer(poser);
			s[i].setSinger(ger);
			s[i].setGenre(nre);
		}
		return s;
	}
	
	public void toPrint(Song[] s) {
		for(int i = 0; i < s.length; i++) {
			System.out.println(s[i].toString());
		}
	}
	
	

}
