/* This file was generated by SableCC (http://www.sablecc.org/). */

package Cmenos.node;

import Cmenos.analysis.*;

@SuppressWarnings("nls")
public final class AGeralParray extends PParray
{
    private PParray _parray_;
    private TColcheteE _colcheteE_;
    private TColcheteD _colcheteD_;

    public AGeralParray()
    {
        // Constructor
    }

    public AGeralParray(
        @SuppressWarnings("hiding") PParray _parray_,
        @SuppressWarnings("hiding") TColcheteE _colcheteE_,
        @SuppressWarnings("hiding") TColcheteD _colcheteD_)
    {
        // Constructor
        setParray(_parray_);

        setColcheteE(_colcheteE_);

        setColcheteD(_colcheteD_);

    }

    @Override
    public Object clone()
    {
        return new AGeralParray(
            cloneNode(this._parray_),
            cloneNode(this._colcheteE_),
            cloneNode(this._colcheteD_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAGeralParray(this);
    }

    public PParray getParray()
    {
        return this._parray_;
    }

    public void setParray(PParray node)
    {
        if(this._parray_ != null)
        {
            this._parray_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parray_ = node;
    }

    public TColcheteE getColcheteE()
    {
        return this._colcheteE_;
    }

    public void setColcheteE(TColcheteE node)
    {
        if(this._colcheteE_ != null)
        {
            this._colcheteE_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._colcheteE_ = node;
    }

    public TColcheteD getColcheteD()
    {
        return this._colcheteD_;
    }

    public void setColcheteD(TColcheteD node)
    {
        if(this._colcheteD_ != null)
        {
            this._colcheteD_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._colcheteD_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._parray_)
            + toString(this._colcheteE_)
            + toString(this._colcheteD_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._parray_ == child)
        {
            this._parray_ = null;
            return;
        }

        if(this._colcheteE_ == child)
        {
            this._colcheteE_ = null;
            return;
        }

        if(this._colcheteD_ == child)
        {
            this._colcheteD_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._parray_ == oldChild)
        {
            setParray((PParray) newChild);
            return;
        }

        if(this._colcheteE_ == oldChild)
        {
            setColcheteE((TColcheteE) newChild);
            return;
        }

        if(this._colcheteD_ == oldChild)
        {
            setColcheteD((TColcheteD) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
