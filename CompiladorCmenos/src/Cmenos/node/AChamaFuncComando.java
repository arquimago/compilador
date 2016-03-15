/* This file was generated by SableCC (http://www.sablecc.org/). */

package Cmenos.node;

import Cmenos.analysis.*;

@SuppressWarnings("nls")
public final class AChamaFuncComando extends PComando
{
    private PChamaFuncao _chamaFuncao_;

    public AChamaFuncComando()
    {
        // Constructor
    }

    public AChamaFuncComando(
        @SuppressWarnings("hiding") PChamaFuncao _chamaFuncao_)
    {
        // Constructor
        setChamaFuncao(_chamaFuncao_);

    }

    @Override
    public Object clone()
    {
        return new AChamaFuncComando(
            cloneNode(this._chamaFuncao_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAChamaFuncComando(this);
    }

    public PChamaFuncao getChamaFuncao()
    {
        return this._chamaFuncao_;
    }

    public void setChamaFuncao(PChamaFuncao node)
    {
        if(this._chamaFuncao_ != null)
        {
            this._chamaFuncao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._chamaFuncao_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._chamaFuncao_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._chamaFuncao_ == child)
        {
            this._chamaFuncao_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._chamaFuncao_ == oldChild)
        {
            setChamaFuncao((PChamaFuncao) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
