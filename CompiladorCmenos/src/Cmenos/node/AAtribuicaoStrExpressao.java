/* This file was generated by SableCC (http://www.sablecc.org/). */

package Cmenos.node;

import Cmenos.analysis.*;

@SuppressWarnings("nls")
public final class AAtribuicaoStrExpressao extends PExpressao
{
    private PVar _var_;
    private TAtribuicao _atribuicao_;
    private TStr _str_;

    public AAtribuicaoStrExpressao()
    {
        // Constructor
    }

    public AAtribuicaoStrExpressao(
        @SuppressWarnings("hiding") PVar _var_,
        @SuppressWarnings("hiding") TAtribuicao _atribuicao_,
        @SuppressWarnings("hiding") TStr _str_)
    {
        // Constructor
        setVar(_var_);

        setAtribuicao(_atribuicao_);

        setStr(_str_);

    }

    @Override
    public Object clone()
    {
        return new AAtribuicaoStrExpressao(
            cloneNode(this._var_),
            cloneNode(this._atribuicao_),
            cloneNode(this._str_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAtribuicaoStrExpressao(this);
    }

    public PVar getVar()
    {
        return this._var_;
    }

    public void setVar(PVar node)
    {
        if(this._var_ != null)
        {
            this._var_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._var_ = node;
    }

    public TAtribuicao getAtribuicao()
    {
        return this._atribuicao_;
    }

    public void setAtribuicao(TAtribuicao node)
    {
        if(this._atribuicao_ != null)
        {
            this._atribuicao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._atribuicao_ = node;
    }

    public TStr getStr()
    {
        return this._str_;
    }

    public void setStr(TStr node)
    {
        if(this._str_ != null)
        {
            this._str_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._str_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._var_)
            + toString(this._atribuicao_)
            + toString(this._str_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._var_ == child)
        {
            this._var_ = null;
            return;
        }

        if(this._atribuicao_ == child)
        {
            this._atribuicao_ = null;
            return;
        }

        if(this._str_ == child)
        {
            this._str_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._var_ == oldChild)
        {
            setVar((PVar) newChild);
            return;
        }

        if(this._atribuicao_ == oldChild)
        {
            setAtribuicao((TAtribuicao) newChild);
            return;
        }

        if(this._str_ == oldChild)
        {
            setStr((TStr) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
