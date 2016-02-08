/* This file was generated by SableCC (http://www.sablecc.org/). */

package Cmenos.analysis;

import Cmenos.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseTComentarioLinha(TComentarioLinha node);
    void caseTComentarioE(TComentarioE node);
    void caseTComentarioCorpo(TComentarioCorpo node);
    void caseTComentarioD(TComentarioD node);
    void caseTAsterisco(TAsterisco node);
    void caseTBarra(TBarra node);
    void caseTIf(TIf node);
    void caseTElse(TElse node);
    void caseTInt(TInt node);
    void caseTString(TString node);
    void caseTReturn(TReturn node);
    void caseTVoid(TVoid node);
    void caseTWhile(TWhile node);
    void caseTId(TId node);
    void caseTNum(TNum node);
    void caseTBranco(TBranco node);
    void caseTSoma(TSoma node);
    void caseTMult(TMult node);
    void caseTComparador(TComparador node);
    void caseTAtribuicao(TAtribuicao node);
    void caseTFimDeLinha(TFimDeLinha node);
    void caseTVirgula(TVirgula node);
    void caseTParenteses(TParenteses node);
    void caseTColchetes(TColchetes node);
    void caseTChaves(TChaves node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
