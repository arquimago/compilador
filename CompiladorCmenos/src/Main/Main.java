package Main;
//usar E:\Documents\GitHub\compilador\test.cpp como argumento pra testar!

import java.io.FileReader;
import java.io.PushbackReader;

import Cmenos.node.EOF;
import Cmenos.node.TBranco;
import Cmenos.node.Token;

public class Main {

	public static void main(String[] args) {
		if (args.length > 0) { 
	         try { 
	            LexerTh lexer = new LexerTh (new PushbackReader( 
	               new FileReader(args[0]), 1024));
	            
	            Token atual = null;
	            atual = lexer.next();
	    		
	    		while(!atual.getClass().equals(EOF.class)){
	    			if(atual.getClass().equals(TBranco.class)){
	    				System.out.print(atual.getText());
	    			} else {
	    				String id = atual.getClass().getName().replaceAll("Cmenos.node.T"," ");
	    				System.out.print(id);
	    			}
	    			atual = lexer.next();
	    		}
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
