/* This file was generated by SableCC (http://www.sablecc.org/). */

package Cmenos.node;

import Cmenos.analysis.*;

@SuppressWarnings("nls")
public final class ANumeroFator extends PFator
{
    private PNumeroOuFuncao _numeroOuFuncao_;

    public ANumeroFator()
    {
        // Constructor
    }

    public ANumeroFator(
        @SuppressWarnings("hiding") PNumeroOuFuncao _numeroOuFuncao_)
    {
        // Constructor
        setNumeroOuFuncao(_numeroOuFuncao_);

    }

    @Override
    public Object clone()
    {
        return new ANumeroFator(
            cloneNode(this._numeroOuFuncao_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANumeroFator(this);
    }

    public PNumeroOuFuncao getNumeroOuFuncao()
    {
        return this._numeroOuFuncao_;
    }

    public void setNumeroOuFuncao(PNumeroOuFuncao node)
    {
        if(this._numeroOuFuncao_ != null)
        {
            this._numeroOuFuncao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._numeroOuFuncao_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._numeroOuFuncao_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._numeroOuFuncao_ == child)
        {
            this._numeroOuFuncao_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._numeroOuFuncao_ == oldChild)
        {
            setNumeroOuFuncao((PNumeroOuFuncao) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
