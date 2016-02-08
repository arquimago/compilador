package Main;
//usar E:\Documents\GitHub\compilador\test.cpp como argumento pra testar!

import java.io.FileReader;
import java.io.PushbackReader;

public class Main {

	public static void main(String[] args) {
		if (args.length > 0) { 
	         try { 
	            LexerTh lexer = new LexerTh (new PushbackReader( 
	               new FileReader(args[0]), 1024));  
	         } 
	         catch (Exception e) { 
	            System.out.println (e) ; 
	         } 
	      } else { 
	         System.err.println("Use um arquivo escrito em C- como argumento"); 
	         System.exit(1); 
	      } 

	}

}
