/* This file was generated by SableCC (http://www.sablecc.org/). */

package Cmenos.node;

import Cmenos.analysis.*;

@SuppressWarnings("nls")
public final class ABlWhileBlocoWhile extends PBlocoWhile
{
    private TWhile _while_;
    private TParenteseE _parenteseE_;
    private PCondicao _condicao_;
    private TParenteseD _parenteseD_;
    private TChaveE _chaveE_;
    private PComandos _comandos_;
    private TChaveD _chaveD_;

    public ABlWhileBlocoWhile()
    {
        // Constructor
    }

    public ABlWhileBlocoWhile(
        @SuppressWarnings("hiding") TWhile _while_,
        @SuppressWarnings("hiding") TParenteseE _parenteseE_,
        @SuppressWarnings("hiding") PCondicao _condicao_,
        @SuppressWarnings("hiding") TParenteseD _parenteseD_,
        @SuppressWarnings("hiding") TChaveE _chaveE_,
        @SuppressWarnings("hiding") PComandos _comandos_,
        @SuppressWarnings("hiding") TChaveD _chaveD_)
    {
        // Constructor
        setWhile(_while_);

        setParenteseE(_parenteseE_);

        setCondicao(_condicao_);

        setParenteseD(_parenteseD_);

        setChaveE(_chaveE_);

        setComandos(_comandos_);

        setChaveD(_chaveD_);

    }

    @Override
    public Object clone()
    {
        return new ABlWhileBlocoWhile(
            cloneNode(this._while_),
            cloneNode(this._parenteseE_),
            cloneNode(this._condicao_),
            cloneNode(this._parenteseD_),
            cloneNode(this._chaveE_),
            cloneNode(this._comandos_),
            cloneNode(this._chaveD_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABlWhileBlocoWhile(this);
    }

    public TWhile getWhile()
    {
        return this._while_;
    }

    public void setWhile(TWhile node)
    {
        if(this._while_ != null)
        {
            this._while_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._while_ = node;
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

    public PCondicao getCondicao()
    {
        return this._condicao_;
    }

    public void setCondicao(PCondicao node)
    {
        if(this._condicao_ != null)
        {
            this._condicao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._condicao_ = node;
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
            + toString(this._while_)
            + toString(this._parenteseE_)
            + toString(this._condicao_)
            + toString(this._parenteseD_)
            + toString(this._chaveE_)
            + toString(this._comandos_)
            + toString(this._chaveD_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._while_ == child)
        {
            this._while_ = null;
            return;
        }

        if(this._parenteseE_ == child)
        {
            this._parenteseE_ = null;
            return;
        }

        if(this._condicao_ == child)
        {
            this._condicao_ = null;
            return;
        }

        if(this._parenteseD_ == child)
        {
            this._parenteseD_ = null;
            return;
        }

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
        if(this._while_ == oldChild)
        {
            setWhile((TWhile) newChild);
            return;
        }

        if(this._parenteseE_ == oldChild)
        {
            setParenteseE((TParenteseE) newChild);
            return;
        }

        if(this._condicao_ == oldChild)
        {
            setCondicao((PCondicao) newChild);
            return;
        }

        if(this._parenteseD_ == oldChild)
        {
            setParenteseD((TParenteseD) newChild);
            return;
        }

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
