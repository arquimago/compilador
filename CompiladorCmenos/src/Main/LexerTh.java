package Main;

import java.io.IOException;
import java.io.PushbackReader;
import Cmenos.lexer.Lexer;
import Cmenos.lexer.LexerException;
import Cmenos.node.*;


public class LexerTh extends Lexer {
	
	private int contador = 0;
	private TComentarioCorpo comentario;
	private StringBuffer texto;
	
	public LexerTh(final PushbackReader in) {
		super(in);
		
	}
	
	@Override
	protected void filter() throws LexerException, IOException {
		//Tokens new4 TComentarioCorpo (comentario + texto) e new5 TComentarioD (fecha)
		/*Adicionar SEMPRE no Lexer.java as linhas:
		if(state.id==0) this.state = State.COMENTARIO;
		no m�todo getToken() nos tokens TComentarioCorpo e TComentarioD
		public final static State COMENTARIO = new State(1);
		na classe interna State	*/
		if(state.equals(State.COMENTARIO)){
			if(comentario == null){
				comentario = (TComentarioCorpo) token;
				contador ++;
				token = null;
			} else {
				System.out.println("entrou no else do lexer pra comentario");
				texto.append(token.getText());
				if(token instanceof TComentarioCorpo) {
					contador++;
				} else if (token instanceof TComentarioD) {
					contador--;
				} else {
					InvalidToken invalido = new InvalidToken("Token Invalido", comentario.getLine(), comentario.getPos());
					throw new LexerException(invalido, "Token Invalido:" + texto); 
				}
				if(contador!=0){
					token=null;
				} else {
					comentario.setText(texto.toString());
					token = comentario;
					state = State.INITIAL;
					comentario = null;
				}
			}
		}
    }
	

}
