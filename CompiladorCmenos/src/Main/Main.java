package Main;
//usar E:\Documents\GitHub\compilador\test.cpp como argumento pra testar!

import java.io.FileReader;
import java.io.PushbackReader;

//import Cmenos.node.EOF;
//import Cmenos.node.TBranco;
//import Cmenos.node.Token;
import Cmenos.parser.Parser;

public class Main {

	public static void main(String[] args) {
		if (args.length > 0) { 
	         try { 
	            LexerTh lexer = new LexerTh (new PushbackReader( 
	               new FileReader(args[0]), 1024));
	            
	            //Token atual = null;
	            //atual = lexer.next();
	    		
	    		//while(!atual.getClass().equals(EOF.class)){
	    		//	if(atual.getClass().equals(TBranco.class)){
	    		//		System.out.print(atual.getText());
	    		//	} else {
	    		//		String id = atual.getClass().getName().replaceAll("Cmenos.node.T"," ");
	    		//		System.out.print(id);
	    		//	}
	    		//	atual = lexer.next();
	    		//}
	            
	            Parser parser = new Parser(lexer);
	            parser.parse();
	            
	         } 
	         catch (Exception e) { 
	        	 System.out.println("Houve um erro de sintaxe");
	        	 System.out.println (e) ; 
	         } 
	         
	         System.out.println("Sintaxe analisada com sucesso!");
	         
	    } else { 
	         System.err.println("Use um arquivo escrito em C- como argumento"); 
	         System.exit(1); 
	    }
	}
}
