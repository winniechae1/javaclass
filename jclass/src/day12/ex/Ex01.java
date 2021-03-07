package day12.ex;
/*
 	����1]
 		�뷡 �Ѱ��� �����͸� ����� Ŭ���� Song�� �����ϰ� 
 		10���� �����͸� �Է��ؼ� ����� �Է��ϸ� 
 		�ش� ���� ������ ������ִ� ���α׷��� �ۼ��ϼ���.
 		
 		�� ������
			���(title), �۰(composer), ����(singer), �帣(genre)
		�� ����ϵ��� �ϼ���.
		
		extra ]
			�����̸��� �Է��ϸ� �ش� ����� ��µǰ� �ϼ���.
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
			
			System.out.print("�̸����� �˻� 0 ����� 1");
			int no = sc.nextInt();
			System.out.println("no : " + no);
			sc.nextLine();
			
			if(no == 1) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			if(!(no == 0)) {
				System.out.println("�߸��Է��߽��ϴ�.");
				continue;
			}
			if(no == 0) {
				singerToInfo(s);
				break;
			}
		}
	}
	
	public void singerToInfo(Song[] s) {
		
		System.out.print("�����̸� �Է� : ");
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
