/* This file was generated by SableCC (http://www.sablecc.org/). */

package Cmenos.node;

import Cmenos.analysis.*;

@SuppressWarnings("nls")
public final class ARetornoVazioComando extends PComando
{

    public ARetornoVazioComando()
    {
        // Constructor
    }

    @Override
    public Object clone()
    {
        return new ARetornoVazioComando();
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARetornoVazioComando(this);
    }

    @Override
    public String toString()
    {
        return "";
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        throw new RuntimeException("Not a child.");
    }
}
