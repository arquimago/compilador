package Main;

import java.io.IOException;
import java.io.PushbackReader;
import Cmenos.lexer.Lexer;
import Cmenos.lexer.LexerException;
import Cmenos.node.*;


public class LexerTh extends Lexer {
	
	private int contador = 0;
	private TComentarioE comentario = null;
	private String texto = " ";
	
	public LexerTh(final PushbackReader in) {
		super(in);
		
	}
	
	private void erroComentario() throws LexerException{
		InvalidToken invalido = new InvalidToken("Token Invalido", token.getLine(), token.getPos());
		throw new LexerException(invalido, "Token Invalido (linha: " + invalido.getLine() + " coluna: " + invalido.getPos() +"):" + texto );
	}
	
	@Override
	protected void filter() throws LexerException, IOException {
		texto.replaceAll(" ","");
		if(state.equals(State.COMENTARIO)){
			if(comentario == null){
				if (token instanceof TComentarioD){
					erroComentario();
				}
				comentario = (TComentarioE) token;
				contador ++;
				token = null;
			} else {
				texto += token.getText();
				if(token instanceof TComentarioE) {
					contador++;
				} else if (token instanceof TComentarioD) {
					contador--;
				} else if (token instanceof EOF) {
					erroComentario(); 
				}
				if(contador!=0){
					token=null;
				} else {
					comentario.setText(texto);
					token = comentario;
					state = State.NORMAL;
					comentario = null;
				}
			}
		}
    }
}
