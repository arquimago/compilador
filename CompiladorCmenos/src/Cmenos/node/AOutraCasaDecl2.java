/* This file was generated by SableCC (http://www.sablecc.org/). */

package Cmenos.node;

import Cmenos.analysis.*;

@SuppressWarnings("nls")
public final class AOutraCasaDecl2 extends PCasaDecl2
{
    private TChaveE _chaveE_;
    private PComandos _comandos_;
    private TChaveD _chaveD_;

    public AOutraCasaDecl2()
    {
        // Constructor
    }

    public AOutraCasaDecl2(
        @SuppressWarnings("hiding") TChaveE _chaveE_,
        @SuppressWarnings("hiding") PComandos _comandos_,
        @SuppressWarnings("hiding") TChaveD _chaveD_)
    {
        // Constructor
        setChaveE(_chaveE_);

        setComandos(_comandos_);

        setChaveD(_chaveD_);

    }

    @Override
    public Object clone()
    {
        return new AOutraCasaDecl2(
            cloneNode(this._chaveE_),
            cloneNode(this._comandos_),
            cloneNode(this._chaveD_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOutraCasaDecl2(this);
    }

    public TChaveE getChaveE()
    {
        return this._chaveE_;
    }

    public void setChaveE(TChaveE node)
    {
        if(this._chaveE_ != null)
        {
            this._chaveE_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._chaveE_ = node;
    }

    public PComandos getComandos()
    {
        return this._comandos_;
    }

    public void setComandos(PComandos node)
    {
        if(this._comandos_ != null)
        {
            this._comandos_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comandos_ = node;
    }

    public TChaveD getChaveD()
    {
        return this._chaveD_;
    }

    public void setChaveD(TChaveD node)
    {
        if(this._chaveD_ != null)
        {
            this._chaveD_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._chaveD_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._chaveE_)
            + toString(this._comandos_)
            + toString(this._chaveD_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._chaveE_ == child)
        {
            this._chaveE_ = null;
            return;
        }

        if(this._comandos_ == child)
        {
            this._comandos_ = null;
            return;
        }

        if(this._chaveD_ == child)
        {
            this._chaveD_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._chaveE_ == oldChild)
        {
            setChaveE((TChaveE) newChild);
            return;
        }

        if(this._comandos_ == oldChild)
        {
            setComandos((PComandos) newChild);
            return;
        }

        if(this._chaveD_ == oldChild)
        {
            setChaveD((TChaveD) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
