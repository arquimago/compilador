/* This file was generated by SableCC (http://www.sablecc.org/). */

package Cmenos.node;

import Cmenos.analysis.*;

@SuppressWarnings("nls")
public final class AListaListaArgs extends PListaArgs
{
    private PListaArgs _listaArgs_;
    private TVirgula _virgula_;
    private PExpressao _expressao_;

    public AListaListaArgs()
    {
        // Constructor
    }

    public AListaListaArgs(
        @SuppressWarnings("hiding") PListaArgs _listaArgs_,
        @SuppressWarnings("hiding") TVirgula _virgula_,
        @SuppressWarnings("hiding") PExpressao _expressao_)
    {
        // Constructor
        setListaArgs(_listaArgs_);

        setVirgula(_virgula_);

        setExpressao(_expressao_);

    }

    @Override
    public Object clone()
    {
        return new AListaListaArgs(
            cloneNode(this._listaArgs_),
            cloneNode(this._virgula_),
            cloneNode(this._expressao_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAListaListaArgs(this);
    }

    public PListaArgs getListaArgs()
    {
        return this._listaArgs_;
    }

    public void setListaArgs(PListaArgs node)
    {
        if(this._listaArgs_ != null)
        {
            this._listaArgs_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._listaArgs_ = node;
    }

    public TVirgula getVirgula()
    {
        return this._virgula_;
    }

    public void setVirgula(TVirgula node)
    {
        if(this._virgula_ != null)
        {
            this._virgula_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._virgula_ = node;
    }

    public PExpressao getExpressao()
    {
        return this._expressao_;
    }

    public void setExpressao(PExpressao node)
    {
        if(this._expressao_ != null)
        {
            this._expressao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expressao_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._listaArgs_)
            + toString(this._virgula_)
            + toString(this._expressao_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._listaArgs_ == child)
        {
            this._listaArgs_ = null;
            return;
        }

        if(this._virgula_ == child)
        {
            this._virgula_ = null;
            return;
        }

        if(this._expressao_ == child)
        {
            this._expressao_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._listaArgs_ == oldChild)
        {
            setListaArgs((PListaArgs) newChild);
            return;
        }

        if(this._virgula_ == oldChild)
        {
            setVirgula((TVirgula) newChild);
            return;
        }

        if(this._expressao_ == oldChild)
        {
            setExpressao((PExpressao) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
