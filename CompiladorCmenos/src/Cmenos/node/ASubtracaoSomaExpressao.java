/* This file was generated by SableCC (http://www.sablecc.org/). */

package Cmenos.node;

import Cmenos.analysis.*;

@SuppressWarnings("nls")
public final class ASubtracaoSomaExpressao extends PSomaExpressao
{
    private PSomaExpressao _somaExpressao_;
    private TMenos _menos_;
    private PTermo _termo_;

    public ASubtracaoSomaExpressao()
    {
        // Constructor
    }

    public ASubtracaoSomaExpressao(
        @SuppressWarnings("hiding") PSomaExpressao _somaExpressao_,
        @SuppressWarnings("hiding") TMenos _menos_,
        @SuppressWarnings("hiding") PTermo _termo_)
    {
        // Constructor
        setSomaExpressao(_somaExpressao_);

        setMenos(_menos_);

        setTermo(_termo_);

    }

    @Override
    public Object clone()
    {
        return new ASubtracaoSomaExpressao(
            cloneNode(this._somaExpressao_),
            cloneNode(this._menos_),
            cloneNode(this._termo_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASubtracaoSomaExpressao(this);
    }

    public PSomaExpressao getSomaExpressao()
    {
        return this._somaExpressao_;
    }

    public void setSomaExpressao(PSomaExpressao node)
    {
        if(this._somaExpressao_ != null)
        {
            this._somaExpressao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._somaExpressao_ = node;
    }

    public TMenos getMenos()
    {
        return this._menos_;
    }

    public void setMenos(TMenos node)
    {
        if(this._menos_ != null)
        {
            this._menos_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._menos_ = node;
    }

    public PTermo getTermo()
    {
        return this._termo_;
    }

    public void setTermo(PTermo node)
    {
        if(this._termo_ != null)
        {
            this._termo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._termo_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._somaExpressao_)
            + toString(this._menos_)
            + toString(this._termo_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._somaExpressao_ == child)
        {
            this._somaExpressao_ = null;
            return;
        }

        if(this._menos_ == child)
        {
            this._menos_ = null;
            return;
        }

        if(this._termo_ == child)
        {
            this._termo_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._somaExpressao_ == oldChild)
        {
            setSomaExpressao((PSomaExpressao) newChild);
            return;
        }

        if(this._menos_ == oldChild)
        {
            setMenos((TMenos) newChild);
            return;
        }

        if(this._termo_ == oldChild)
        {
            setTermo((PTermo) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
