/* This file was generated by SableCC (http://www.sablecc.org/). */

package Cmenos.node;

import Cmenos.analysis.*;

@SuppressWarnings("nls")
public final class AExpressaoComando extends PComando
{
    private PExpressaoDec _expressaoDec_;

    public AExpressaoComando()
    {
        // Constructor
    }

    public AExpressaoComando(
        @SuppressWarnings("hiding") PExpressaoDec _expressaoDec_)
    {
        // Constructor
        setExpressaoDec(_expressaoDec_);

    }

    @Override
    public Object clone()
    {
        return new AExpressaoComando(
            cloneNode(this._expressaoDec_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpressaoComando(this);
    }

    public PExpressaoDec getExpressaoDec()
    {
        return this._expressaoDec_;
    }

    public void setExpressaoDec(PExpressaoDec node)
    {
        if(this._expressaoDec_ != null)
        {
            this._expressaoDec_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expressaoDec_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expressaoDec_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expressaoDec_ == child)
        {
            this._expressaoDec_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expressaoDec_ == oldChild)
        {
            setExpressaoDec((PExpressaoDec) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}