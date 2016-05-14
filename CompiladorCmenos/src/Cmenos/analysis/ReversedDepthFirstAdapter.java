/* This file was generated by SableCC (http://www.sablecc.org/). */

package Cmenos.analysis;

import java.util.*;
import Cmenos.node.*;

public class ReversedDepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getEOF().apply(this);
        node.getPPrograma().apply(this);
        outStart(node);
    }

    public void inAPrograma(APrograma node)
    {
        defaultIn(node);
    }

    public void outAPrograma(APrograma node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPrograma(APrograma node)
    {
        inAPrograma(node);
        {
            List<PDeclaracao> copy = new ArrayList<PDeclaracao>(node.getDeclaracao());
            Collections.reverse(copy);
            for(PDeclaracao e : copy)
            {
                e.apply(this);
            }
        }
        outAPrograma(node);
    }

    public void inAVariavelDecDeclaracao(AVariavelDecDeclaracao node)
    {
        defaultIn(node);
    }

    public void outAVariavelDecDeclaracao(AVariavelDecDeclaracao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariavelDecDeclaracao(AVariavelDecDeclaracao node)
    {
        inAVariavelDecDeclaracao(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getTipo() != null)
        {
            node.getTipo().apply(this);
        }
        outAVariavelDecDeclaracao(node);
    }

    public void inAFuncaoDecDeclaracao(AFuncaoDecDeclaracao node)
    {
        defaultIn(node);
    }

    public void outAFuncaoDecDeclaracao(AFuncaoDecDeclaracao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFuncaoDecDeclaracao(AFuncaoDecDeclaracao node)
    {
        inAFuncaoDecDeclaracao(node);
        if(node.getCompostoDec() != null)
        {
            node.getCompostoDec().apply(this);
        }
        {
            List<PParametro> copy = new ArrayList<PParametro>(node.getParametro());
            Collections.reverse(copy);
            for(PParametro e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getTipo() != null)
        {
            node.getTipo().apply(this);
        }
        outAFuncaoDecDeclaracao(node);
    }

    public void inAMainDeclaracao(AMainDeclaracao node)
    {
        defaultIn(node);
    }

    public void outAMainDeclaracao(AMainDeclaracao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMainDeclaracao(AMainDeclaracao node)
    {
        inAMainDeclaracao(node);
        if(node.getCompostoDec() != null)
        {
            node.getCompostoDec().apply(this);
        }
        {
            List<PParametro> copy = new ArrayList<PParametro>(node.getParametro());
            Collections.reverse(copy);
            for(PParametro e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getMain() != null)
        {
            node.getMain().apply(this);
        }
        if(node.getInt() != null)
        {
            node.getInt().apply(this);
        }
        outAMainDeclaracao(node);
    }

    public void inAVazioDeclaracao(AVazioDeclaracao node)
    {
        defaultIn(node);
    }

    public void outAVazioDeclaracao(AVazioDeclaracao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVazioDeclaracao(AVazioDeclaracao node)
    {
        inAVazioDeclaracao(node);
        outAVazioDeclaracao(node);
    }

    public void inATVoidTipo(ATVoidTipo node)
    {
        defaultIn(node);
    }

    public void outATVoidTipo(ATVoidTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATVoidTipo(ATVoidTipo node)
    {
        inATVoidTipo(node);
        if(node.getVoid() != null)
        {
            node.getVoid().apply(this);
        }
        outATVoidTipo(node);
    }

    public void inATIntTipo(ATIntTipo node)
    {
        defaultIn(node);
    }

    public void outATIntTipo(ATIntTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATIntTipo(ATIntTipo node)
    {
        inATIntTipo(node);
        if(node.getInt() != null)
        {
            node.getInt().apply(this);
        }
        outATIntTipo(node);
    }

    public void inATStrTipo(ATStrTipo node)
    {
        defaultIn(node);
    }

    public void outATStrTipo(ATStrTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATStrTipo(ATStrTipo node)
    {
        inATStrTipo(node);
        if(node.getString() != null)
        {
            node.getString().apply(this);
        }
        outATStrTipo(node);
    }

    public void inANormalParametro(ANormalParametro node)
    {
        defaultIn(node);
    }

    public void outANormalParametro(ANormalParametro node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANormalParametro(ANormalParametro node)
    {
        inANormalParametro(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getTipo() != null)
        {
            node.getTipo().apply(this);
        }
        outANormalParametro(node);
    }

    public void inAVazioParametro(AVazioParametro node)
    {
        defaultIn(node);
    }

    public void outAVazioParametro(AVazioParametro node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVazioParametro(AVazioParametro node)
    {
        inAVazioParametro(node);
        outAVazioParametro(node);
    }

    public void inACompostoDec(ACompostoDec node)
    {
        defaultIn(node);
    }

    public void outACompostoDec(ACompostoDec node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACompostoDec(ACompostoDec node)
    {
        inACompostoDec(node);
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            Collections.reverse(copy);
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PDeclaracao> copy = new ArrayList<PDeclaracao>(node.getDeclaracao());
            Collections.reverse(copy);
            for(PDeclaracao e : copy)
            {
                e.apply(this);
            }
        }
        outACompostoDec(node);
    }

    public void inAInputComando(AInputComando node)
    {
        defaultIn(node);
    }

    public void outAInputComando(AInputComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAInputComando(AInputComando node)
    {
        inAInputComando(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outAInputComando(node);
    }

    public void inAOutputComando(AOutputComando node)
    {
        defaultIn(node);
    }

    public void outAOutputComando(AOutputComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOutputComando(AOutputComando node)
    {
        inAOutputComando(node);
        if(node.getTipo() != null)
        {
            node.getTipo().apply(this);
        }
        outAOutputComando(node);
    }

    public void inAExpressaoComando(AExpressaoComando node)
    {
        defaultIn(node);
    }

    public void outAExpressaoComando(AExpressaoComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpressaoComando(AExpressaoComando node)
    {
        inAExpressaoComando(node);
        if(node.getExpressaoDec() != null)
        {
            node.getExpressaoDec().apply(this);
        }
        outAExpressaoComando(node);
    }

    public void inAComandosComando(AComandosComando node)
    {
        defaultIn(node);
    }

    public void outAComandosComando(AComandosComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAComandosComando(AComandosComando node)
    {
        inAComandosComando(node);
        if(node.getCompostoDec() != null)
        {
            node.getCompostoDec().apply(this);
        }
        outAComandosComando(node);
    }

    public void inAIfComando(AIfComando node)
    {
        defaultIn(node);
    }

    public void outAIfComando(AIfComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIfComando(AIfComando node)
    {
        inAIfComando(node);
        if(node.getCompostoDec() != null)
        {
            node.getCompostoDec().apply(this);
        }
        if(node.getExpressao() != null)
        {
            node.getExpressao().apply(this);
        }
        outAIfComando(node);
    }

    public void inAIfThenElseComando(AIfThenElseComando node)
    {
        defaultIn(node);
    }

    public void outAIfThenElseComando(AIfThenElseComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIfThenElseComando(AIfThenElseComando node)
    {
        inAIfThenElseComando(node);
        if(node.getF() != null)
        {
            node.getF().apply(this);
        }
        if(node.getV() != null)
        {
            node.getV().apply(this);
        }
        if(node.getExpressao() != null)
        {
            node.getExpressao().apply(this);
        }
        outAIfThenElseComando(node);
    }

    public void inABlocoWhileComando(ABlocoWhileComando node)
    {
        defaultIn(node);
    }

    public void outABlocoWhileComando(ABlocoWhileComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABlocoWhileComando(ABlocoWhileComando node)
    {
        inABlocoWhileComando(node);
        if(node.getCompostoDec() != null)
        {
            node.getCompostoDec().apply(this);
        }
        if(node.getExpressao() != null)
        {
            node.getExpressao().apply(this);
        }
        outABlocoWhileComando(node);
    }

    public void inARetornoComando(ARetornoComando node)
    {
        defaultIn(node);
    }

    public void outARetornoComando(ARetornoComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARetornoComando(ARetornoComando node)
    {
        inARetornoComando(node);
        if(node.getExpressao() != null)
        {
            node.getExpressao().apply(this);
        }
        outARetornoComando(node);
    }

    public void inARetornoVazioComando(ARetornoVazioComando node)
    {
        defaultIn(node);
    }

    public void outARetornoVazioComando(ARetornoVazioComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARetornoVazioComando(ARetornoVazioComando node)
    {
        inARetornoVazioComando(node);
        outARetornoVazioComando(node);
    }

    public void inAExpressaoExpressaoDec(AExpressaoExpressaoDec node)
    {
        defaultIn(node);
    }

    public void outAExpressaoExpressaoDec(AExpressaoExpressaoDec node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpressaoExpressaoDec(AExpressaoExpressaoDec node)
    {
        inAExpressaoExpressaoDec(node);
        if(node.getExpressao() != null)
        {
            node.getExpressao().apply(this);
        }
        outAExpressaoExpressaoDec(node);
    }

    public void inAVazioExpressaoDec(AVazioExpressaoDec node)
    {
        defaultIn(node);
    }

    public void outAVazioExpressaoDec(AVazioExpressaoDec node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVazioExpressaoDec(AVazioExpressaoDec node)
    {
        inAVazioExpressaoDec(node);
        outAVazioExpressaoDec(node);
    }

    public void inAAtribuicaoExpressao(AAtribuicaoExpressao node)
    {
        defaultIn(node);
    }

    public void outAAtribuicaoExpressao(AAtribuicaoExpressao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAtribuicaoExpressao(AAtribuicaoExpressao node)
    {
        inAAtribuicaoExpressao(node);
        if(node.getExpressaoSimples() != null)
        {
            node.getExpressaoSimples().apply(this);
        }
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outAAtribuicaoExpressao(node);
    }

    public void inAAtribuicaoStrExpressao(AAtribuicaoStrExpressao node)
    {
        defaultIn(node);
    }

    public void outAAtribuicaoStrExpressao(AAtribuicaoStrExpressao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAtribuicaoStrExpressao(AAtribuicaoStrExpressao node)
    {
        inAAtribuicaoStrExpressao(node);
        if(node.getStr() != null)
        {
            node.getStr().apply(this);
        }
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outAAtribuicaoStrExpressao(node);
    }

    public void inASimplesExpressao(ASimplesExpressao node)
    {
        defaultIn(node);
    }

    public void outASimplesExpressao(ASimplesExpressao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimplesExpressao(ASimplesExpressao node)
    {
        inASimplesExpressao(node);
        if(node.getExpressaoSimples() != null)
        {
            node.getExpressaoSimples().apply(this);
        }
        outASimplesExpressao(node);
    }

    public void inAVazioExpressao(AVazioExpressao node)
    {
        defaultIn(node);
    }

    public void outAVazioExpressao(AVazioExpressao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVazioExpressao(AVazioExpressao node)
    {
        inAVazioExpressao(node);
        outAVazioExpressao(node);
    }

    public void inAIdSimplesVar(AIdSimplesVar node)
    {
        defaultIn(node);
    }

    public void outAIdSimplesVar(AIdSimplesVar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdSimplesVar(AIdSimplesVar node)
    {
        inAIdSimplesVar(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAIdSimplesVar(node);
    }

    public void inAIdArrayVar(AIdArrayVar node)
    {
        defaultIn(node);
    }

    public void outAIdArrayVar(AIdArrayVar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdArrayVar(AIdArrayVar node)
    {
        inAIdArrayVar(node);
        if(node.getArray() != null)
        {
            node.getArray().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAIdArrayVar(node);
    }

    public void inAArrayMultiploArray(AArrayMultiploArray node)
    {
        defaultIn(node);
    }

    public void outAArrayMultiploArray(AArrayMultiploArray node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArrayMultiploArray(AArrayMultiploArray node)
    {
        inAArrayMultiploArray(node);
        if(node.getExpressao() != null)
        {
            node.getExpressao().apply(this);
        }
        if(node.getArray() != null)
        {
            node.getArray().apply(this);
        }
        outAArrayMultiploArray(node);
    }

    public void inAArrayBaseArray(AArrayBaseArray node)
    {
        defaultIn(node);
    }

    public void outAArrayBaseArray(AArrayBaseArray node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArrayBaseArray(AArrayBaseArray node)
    {
        inAArrayBaseArray(node);
        if(node.getExpressao() != null)
        {
            node.getExpressao().apply(this);
        }
        outAArrayBaseArray(node);
    }

    public void inAParray(AParray node)
    {
        defaultIn(node);
    }

    public void outAParray(AParray node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParray(AParray node)
    {
        inAParray(node);
        outAParray(node);
    }

    public void inAMenorExpressaoSimples(AMenorExpressaoSimples node)
    {
        defaultIn(node);
    }

    public void outAMenorExpressaoSimples(AMenorExpressaoSimples node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMenorExpressaoSimples(AMenorExpressaoSimples node)
    {
        inAMenorExpressaoSimples(node);
        if(node.getExp2() != null)
        {
            node.getExp2().apply(this);
        }
        if(node.getExp1() != null)
        {
            node.getExp1().apply(this);
        }
        outAMenorExpressaoSimples(node);
    }

    public void inAMenorigualExpressaoSimples(AMenorigualExpressaoSimples node)
    {
        defaultIn(node);
    }

    public void outAMenorigualExpressaoSimples(AMenorigualExpressaoSimples node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMenorigualExpressaoSimples(AMenorigualExpressaoSimples node)
    {
        inAMenorigualExpressaoSimples(node);
        if(node.getExp2() != null)
        {
            node.getExp2().apply(this);
        }
        if(node.getExp1() != null)
        {
            node.getExp1().apply(this);
        }
        outAMenorigualExpressaoSimples(node);
    }

    public void inAMaiorExpressaoSimples(AMaiorExpressaoSimples node)
    {
        defaultIn(node);
    }

    public void outAMaiorExpressaoSimples(AMaiorExpressaoSimples node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMaiorExpressaoSimples(AMaiorExpressaoSimples node)
    {
        inAMaiorExpressaoSimples(node);
        if(node.getExp2() != null)
        {
            node.getExp2().apply(this);
        }
        if(node.getExp1() != null)
        {
            node.getExp1().apply(this);
        }
        outAMaiorExpressaoSimples(node);
    }

    public void inAMaiorigualExpressaoSimples(AMaiorigualExpressaoSimples node)
    {
        defaultIn(node);
    }

    public void outAMaiorigualExpressaoSimples(AMaiorigualExpressaoSimples node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMaiorigualExpressaoSimples(AMaiorigualExpressaoSimples node)
    {
        inAMaiorigualExpressaoSimples(node);
        if(node.getExp2() != null)
        {
            node.getExp2().apply(this);
        }
        if(node.getExp1() != null)
        {
            node.getExp1().apply(this);
        }
        outAMaiorigualExpressaoSimples(node);
    }

    public void inAIgualExpressaoSimples(AIgualExpressaoSimples node)
    {
        defaultIn(node);
    }

    public void outAIgualExpressaoSimples(AIgualExpressaoSimples node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIgualExpressaoSimples(AIgualExpressaoSimples node)
    {
        inAIgualExpressaoSimples(node);
        if(node.getExp2() != null)
        {
            node.getExp2().apply(this);
        }
        if(node.getExp1() != null)
        {
            node.getExp1().apply(this);
        }
        outAIgualExpressaoSimples(node);
    }

    public void inADifExpressaoSimples(ADifExpressaoSimples node)
    {
        defaultIn(node);
    }

    public void outADifExpressaoSimples(ADifExpressaoSimples node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADifExpressaoSimples(ADifExpressaoSimples node)
    {
        inADifExpressaoSimples(node);
        if(node.getExp2() != null)
        {
            node.getExp2().apply(this);
        }
        if(node.getExp1() != null)
        {
            node.getExp1().apply(this);
        }
        outADifExpressaoSimples(node);
    }

    public void inAAditivaExpressaoSimples(AAditivaExpressaoSimples node)
    {
        defaultIn(node);
    }

    public void outAAditivaExpressaoSimples(AAditivaExpressaoSimples node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAditivaExpressaoSimples(AAditivaExpressaoSimples node)
    {
        inAAditivaExpressaoSimples(node);
        if(node.getExp2() != null)
        {
            node.getExp2().apply(this);
        }
        if(node.getExp1() != null)
        {
            node.getExp1().apply(this);
        }
        outAAditivaExpressaoSimples(node);
    }

    public void inASubtrativaExpressaoSimples(ASubtrativaExpressaoSimples node)
    {
        defaultIn(node);
    }

    public void outASubtrativaExpressaoSimples(ASubtrativaExpressaoSimples node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASubtrativaExpressaoSimples(ASubtrativaExpressaoSimples node)
    {
        inASubtrativaExpressaoSimples(node);
        if(node.getExp2() != null)
        {
            node.getExp2().apply(this);
        }
        if(node.getExp1() != null)
        {
            node.getExp1().apply(this);
        }
        outASubtrativaExpressaoSimples(node);
    }

    public void inAMultiplicativaExpressaoSimples(AMultiplicativaExpressaoSimples node)
    {
        defaultIn(node);
    }

    public void outAMultiplicativaExpressaoSimples(AMultiplicativaExpressaoSimples node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultiplicativaExpressaoSimples(AMultiplicativaExpressaoSimples node)
    {
        inAMultiplicativaExpressaoSimples(node);
        if(node.getExp2() != null)
        {
            node.getExp2().apply(this);
        }
        if(node.getExp1() != null)
        {
            node.getExp1().apply(this);
        }
        outAMultiplicativaExpressaoSimples(node);
    }

    public void inADivisaoExpressaoSimples(ADivisaoExpressaoSimples node)
    {
        defaultIn(node);
    }

    public void outADivisaoExpressaoSimples(ADivisaoExpressaoSimples node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADivisaoExpressaoSimples(ADivisaoExpressaoSimples node)
    {
        inADivisaoExpressaoSimples(node);
        if(node.getExp2() != null)
        {
            node.getExp2().apply(this);
        }
        if(node.getExp1() != null)
        {
            node.getExp1().apply(this);
        }
        outADivisaoExpressaoSimples(node);
    }

    public void inAExpressaoExpressaoSimples(AExpressaoExpressaoSimples node)
    {
        defaultIn(node);
    }

    public void outAExpressaoExpressaoSimples(AExpressaoExpressaoSimples node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpressaoExpressaoSimples(AExpressaoExpressaoSimples node)
    {
        inAExpressaoExpressaoSimples(node);
        if(node.getExpressao() != null)
        {
            node.getExpressao().apply(this);
        }
        outAExpressaoExpressaoSimples(node);
    }

    public void inAVariavelExpressaoSimples(AVariavelExpressaoSimples node)
    {
        defaultIn(node);
    }

    public void outAVariavelExpressaoSimples(AVariavelExpressaoSimples node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariavelExpressaoSimples(AVariavelExpressaoSimples node)
    {
        inAVariavelExpressaoSimples(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outAVariavelExpressaoSimples(node);
    }

    public void inAChamadaExpressaoSimples(AChamadaExpressaoSimples node)
    {
        defaultIn(node);
    }

    public void outAChamadaExpressaoSimples(AChamadaExpressaoSimples node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAChamadaExpressaoSimples(AChamadaExpressaoSimples node)
    {
        inAChamadaExpressaoSimples(node);
        if(node.getArgs() != null)
        {
            node.getArgs().apply(this);
        }
        if(node.getIdfunc() != null)
        {
            node.getIdfunc().apply(this);
        }
        outAChamadaExpressaoSimples(node);
    }

    public void inANumeroExpressaoSimples(ANumeroExpressaoSimples node)
    {
        defaultIn(node);
    }

    public void outANumeroExpressaoSimples(ANumeroExpressaoSimples node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumeroExpressaoSimples(ANumeroExpressaoSimples node)
    {
        inANumeroExpressaoSimples(node);
        if(node.getNum() != null)
        {
            node.getNum().apply(this);
        }
        outANumeroExpressaoSimples(node);
    }

    public void inAListaArgs(AListaArgs node)
    {
        defaultIn(node);
    }

    public void outAListaArgs(AListaArgs node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAListaArgs(AListaArgs node)
    {
        inAListaArgs(node);
        if(node.getListaArgs() != null)
        {
            node.getListaArgs().apply(this);
        }
        outAListaArgs(node);
    }

    public void inAVazioArgs(AVazioArgs node)
    {
        defaultIn(node);
    }

    public void outAVazioArgs(AVazioArgs node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVazioArgs(AVazioArgs node)
    {
        inAVazioArgs(node);
        outAVazioArgs(node);
    }

    public void inAListaListaArgs(AListaListaArgs node)
    {
        defaultIn(node);
    }

    public void outAListaListaArgs(AListaListaArgs node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAListaListaArgs(AListaListaArgs node)
    {
        inAListaListaArgs(node);
        if(node.getExpressaoSimples() != null)
        {
            node.getExpressaoSimples().apply(this);
        }
        if(node.getListaArgs() != null)
        {
            node.getListaArgs().apply(this);
        }
        outAListaListaArgs(node);
    }

    public void inAExpressaoListaArgs(AExpressaoListaArgs node)
    {
        defaultIn(node);
    }

    public void outAExpressaoListaArgs(AExpressaoListaArgs node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpressaoListaArgs(AExpressaoListaArgs node)
    {
        inAExpressaoListaArgs(node);
        if(node.getExpressaoSimples() != null)
        {
            node.getExpressaoSimples().apply(this);
        }
        outAExpressaoListaArgs(node);
    }
}
