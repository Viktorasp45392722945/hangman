package hej1;


import java.util.ArrayList;
import java.util.Scanner;

public class hangman  {
	static public void guess(String word, int life) {
		
		char []filler = new char [word.length()];
		int i=0;
		while(i<word.length()) {
		filler[i]='-';
		if(word.charAt(i)==' ') {
			filler[i]=' ';
		}
		i++;
		}
		System.out.println(filler);
		System.out.println("     liv kvar=" + life);
		
		Scanner s = new Scanner(System.in);  // 
		
		ArrayList<Character> l=new ArrayList<Character>();
		while(life>0) {
			char x=s.next().charAt (0);   //
			
			if(l.contains(x)) {
				System.out.println("redan gjord");
				continue;     //
				
			}
			l.add(x);
			
			
			if(word.contains(x+"")) {
				for(int y=0;y<word.length();y++) {  //
					if(word.charAt(y)==x) {    // 
						filler[y]=x;
					}
				}
			}
			else {
				life--;      //liv
			}
			if(word.equals(String.valueOf(filler))) {
				System.out.println(filler);
				System.out.println("du förlorade!!!");
				break;
			}
			System.out.println(filler);
		System.out.println("   liv kvar" + life);
		}
		if(life==0) {
			System.out.println("du förlorar");
		}
	}
	
	  public static void main(String[] args) {
		
		
		String word = " ggggg";   // ord att gissa
		int life = 5;    // chanser eller liv.
		guess (word,life);
		
	}
}

	

 