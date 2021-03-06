/* This file was generated by SableCC (http://www.sablecc.org/). */

package Cmenos.parser;

import Cmenos.node.*;
import Cmenos.analysis.*;

class TokenIndex extends AnalysisAdapter
{
    int index;

    @Override
    public void caseTAsterisco(@SuppressWarnings("unused") TAsterisco node)
    {
        this.index = 0;
    }

    @Override
    public void caseTBarra(@SuppressWarnings("unused") TBarra node)
    {
        this.index = 1;
    }

    @Override
    public void caseTIf(@SuppressWarnings("unused") TIf node)
    {
        this.index = 2;
    }

    @Override
    public void caseTElse(@SuppressWarnings("unused") TElse node)
    {
        this.index = 3;
    }

    @Override
    public void caseTInt(@SuppressWarnings("unused") TInt node)
    {
        this.index = 4;
    }

    @Override
    public void caseTString(@SuppressWarnings("unused") TString node)
    {
        this.index = 5;
    }

    @Override
    public void caseTReturn(@SuppressWarnings("unused") TReturn node)
    {
        this.index = 6;
    }

    @Override
    public void caseTVoid(@SuppressWarnings("unused") TVoid node)
    {
        this.index = 7;
    }

    @Override
    public void caseTWhile(@SuppressWarnings("unused") TWhile node)
    {
        this.index = 8;
    }

    @Override
    public void caseTInput(@SuppressWarnings("unused") TInput node)
    {
        this.index = 9;
    }

    @Override
    public void caseTOutput(@SuppressWarnings("unused") TOutput node)
    {
        this.index = 10;
    }

    @Override
    public void caseTMain(@SuppressWarnings("unused") TMain node)
    {
        this.index = 11;
    }

    @Override
    public void caseTId(@SuppressWarnings("unused") TId node)
    {
        this.index = 12;
    }

    @Override
    public void caseTNum(@SuppressWarnings("unused") TNum node)
    {
        this.index = 13;
    }

    @Override
    public void caseTStr(@SuppressWarnings("unused") TStr node)
    {
        this.index = 14;
    }

    @Override
    public void caseTMais(@SuppressWarnings("unused") TMais node)
    {
        this.index = 15;
    }

    @Override
    public void caseTMenos(@SuppressWarnings("unused") TMenos node)
    {
        this.index = 16;
    }

    @Override
    public void caseTMult(@SuppressWarnings("unused") TMult node)
    {
        this.index = 17;
    }

    @Override
    public void caseTDiv(@SuppressWarnings("unused") TDiv node)
    {
        this.index = 18;
    }

    @Override
    public void caseTMenor(@SuppressWarnings("unused") TMenor node)
    {
        this.index = 19;
    }

    @Override
    public void caseTMenorIgual(@SuppressWarnings("unused") TMenorIgual node)
    {
        this.index = 20;
    }

    @Override
    public void caseTMaior(@SuppressWarnings("unused") TMaior node)
    {
        this.index = 21;
    }

    @Override
    public void caseTMaiorIgual(@SuppressWarnings("unused") TMaiorIgual node)
    {
        this.index = 22;
    }

    @Override
    public void caseTIgualdade(@SuppressWarnings("unused") TIgualdade node)
    {
        this.index = 23;
    }

    @Override
    public void caseTDiferente(@SuppressWarnings("unused") TDiferente node)
    {
        this.index = 24;
    }

    @Override
    public void caseTAtribuicao(@SuppressWarnings("unused") TAtribuicao node)
    {
        this.index = 25;
    }

    @Override
    public void caseTPontoVirgula(@SuppressWarnings("unused") TPontoVirgula node)
    {
        this.index = 26;
    }

    @Override
    public void caseTVirgula(@SuppressWarnings("unused") TVirgula node)
    {
        this.index = 27;
    }

    @Override
    public void caseTParenteseE(@SuppressWarnings("unused") TParenteseE node)
    {
        this.index = 28;
    }

    @Override
    public void caseTParenteseD(@SuppressWarnings("unused") TParenteseD node)
    {
        this.index = 29;
    }

    @Override
    public void caseTColcheteE(@SuppressWarnings("unused") TColcheteE node)
    {
        this.index = 30;
    }

    @Override
    public void caseTColcheteD(@SuppressWarnings("unused") TColcheteD node)
    {
        this.index = 31;
    }

    @Override
    public void caseTChaveE(@SuppressWarnings("unused") TChaveE node)
    {
        this.index = 32;
    }

    @Override
    public void caseTChaveD(@SuppressWarnings("unused") TChaveD node)
    {
        this.index = 33;
    }

    @Override
    public void caseTIdfunc(@SuppressWarnings("unused") TIdfunc node)
    {
        this.index = 34;
    }

    @Override
    public void caseEOF(@SuppressWarnings("unused") EOF node)
    {
        this.index = 35;
    }
}
