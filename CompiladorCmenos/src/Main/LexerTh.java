package Main;

import java.io.PushbackReader;

import Cmenos.lexer.IPushbackReader;
import Cmenos.lexer.Lexer;

public class LexerTh extends Lexer {

	public LexerTh(IPushbackReader in) {
		super(in);
		
	}
	
	public LexerTh(final PushbackReader in) {
		super(in);
		
	}

}
