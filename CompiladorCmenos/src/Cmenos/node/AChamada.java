/* This file was generated by SableCC (http://www.sablecc.org/). */

package Cmenos.node;

import Cmenos.analysis.*;

@SuppressWarnings("nls")
public final class AChamada extends PChamada
{
    private TId _id_;
    private TParenteseE _parenteseE_;
    private PArgs _args_;
    private TParenteseD _parenteseD_;

    public AChamada()
    {
        // Constructor
    }

    public AChamada(
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") TParenteseE _parenteseE_,
        @SuppressWarnings("hiding") PArgs _args_,
        @SuppressWarnings("hiding") TParenteseD _parenteseD_)
    {
        // Constructor
        setId(_id_);

        setParenteseE(_parenteseE_);

        setArgs(_args_);

        setParenteseD(_parenteseD_);

    }

    @Override
    public Object clone()
    {
        return new AChamada(
            cloneNode(this._id_),
            cloneNode(this._parenteseE_),
            cloneNode(this._args_),
            cloneNode(this._parenteseD_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAChamada(this);
    }

    public TId getId()
    {
        return this._id_;
    }

    public void setId(TId node)
    {
        if(this._id_ != null)
        {
            this._id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id_ = node;
    }

    public TParenteseE getParenteseE()
    {
        return this._parenteseE_;
    }

    public void setParenteseE(TParenteseE node)
    {
        if(this._parenteseE_ != null)
        {
            this._parenteseE_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parenteseE_ = node;
    }

    public PArgs getArgs()
    {
        return this._args_;
    }

    public void setArgs(PArgs node)
    {
        if(this._args_ != null)
        {
            this._args_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._args_ = node;
    }

    public TParenteseD getParenteseD()
    {
        return this._parenteseD_;
    }

    public void setParenteseD(TParenteseD node)
    {
        if(this._parenteseD_ != null)
        {
            this._parenteseD_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parenteseD_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._id_)
            + toString(this._parenteseE_)
            + toString(this._args_)
            + toString(this._parenteseD_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._parenteseE_ == child)
        {
            this._parenteseE_ = null;
            return;
        }

        if(this._args_ == child)
        {
            this._args_ = null;
            return;
        }

        if(this._parenteseD_ == child)
        {
            this._parenteseD_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(this._parenteseE_ == oldChild)
        {
            setParenteseE((TParenteseE) newChild);
            return;
        }

        if(this._args_ == oldChild)
        {
            setArgs((PArgs) newChild);
            return;
        }

        if(this._parenteseD_ == oldChild)
        {
            setParenteseD((TParenteseD) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}