/* This file was generated by SableCC (http://www.sablecc.org/). */

package Cmenos.node;

import Cmenos.analysis.*;

@SuppressWarnings("nls")
public final class AAditivaExpressaoSimples extends PExpressaoSimples
{
    private PExpressaoSimples _exp1_;
    private PExpressaoSimples _exp2_;

    public AAditivaExpressaoSimples()
    {
        // Constructor
    }

    public AAditivaExpressaoSimples(
        @SuppressWarnings("hiding") PExpressaoSimples _exp1_,
        @SuppressWarnings("hiding") PExpressaoSimples _exp2_)
    {
        // Constructor
        setExp1(_exp1_);

        setExp2(_exp2_);

    }

    @Override
    public Object clone()
    {
        return new AAditivaExpressaoSimples(
            cloneNode(this._exp1_),
            cloneNode(this._exp2_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAditivaExpressaoSimples(this);
    }

    public PExpressaoSimples getExp1()
    {
        return this._exp1_;
    }

    public void setExp1(PExpressaoSimples node)
    {
        if(this._exp1_ != null)
        {
            this._exp1_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp1_ = node;
    }

    public PExpressaoSimples getExp2()
    {
        return this._exp2_;
    }

    public void setExp2(PExpressaoSimples node)
    {
        if(this._exp2_ != null)
        {
            this._exp2_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp2_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exp1_)
            + toString(this._exp2_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exp1_ == child)
        {
            this._exp1_ = null;
            return;
        }

        if(this._exp2_ == child)
        {
            this._exp2_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._exp1_ == oldChild)
        {
            setExp1((PExpressaoSimples) newChild);
            return;
        }

        if(this._exp2_ == oldChild)
        {
            setExp2((PExpressaoSimples) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
