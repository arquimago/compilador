/* This file was generated by SableCC (http://www.sablecc.org/). */

package Cmenos.node;

import java.util.*;
import Cmenos.analysis.*;

@SuppressWarnings("nls")
public final class AMainDeclaracao extends PDeclaracao
{
    private TInt _int_;
    private TMain _main_;
    private final LinkedList<PParametro> _parametro_ = new LinkedList<PParametro>();
    private PCompostoDec _compostoDec_;

    public AMainDeclaracao()
    {
        // Constructor
    }

    public AMainDeclaracao(
        @SuppressWarnings("hiding") TInt _int_,
        @SuppressWarnings("hiding") TMain _main_,
        @SuppressWarnings("hiding") List<?> _parametro_,
        @SuppressWarnings("hiding") PCompostoDec _compostoDec_)
    {
        // Constructor
        setInt(_int_);

        setMain(_main_);

        setParametro(_parametro_);

        setCompostoDec(_compostoDec_);

    }

    @Override
    public Object clone()
    {
        return new AMainDeclaracao(
            cloneNode(this._int_),
            cloneNode(this._main_),
            cloneList(this._parametro_),
            cloneNode(this._compostoDec_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMainDeclaracao(this);
    }

    public TInt getInt()
    {
        return this._int_;
    }

    public void setInt(TInt node)
    {
        if(this._int_ != null)
        {
            this._int_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._int_ = node;
    }

    public TMain getMain()
    {
        return this._main_;
    }

    public void setMain(TMain node)
    {
        if(this._main_ != null)
        {
            this._main_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._main_ = node;
    }

    public LinkedList<PParametro> getParametro()
    {
        return this._parametro_;
    }

    public void setParametro(List<?> list)
    {
        for(PParametro e : this._parametro_)
        {
            e.parent(null);
        }
        this._parametro_.clear();

        for(Object obj_e : list)
        {
            PParametro e = (PParametro) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._parametro_.add(e);
        }
    }

    public PCompostoDec getCompostoDec()
    {
        return this._compostoDec_;
    }

    public void setCompostoDec(PCompostoDec node)
    {
        if(this._compostoDec_ != null)
        {
            this._compostoDec_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._compostoDec_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._int_)
            + toString(this._main_)
            + toString(this._parametro_)
            + toString(this._compostoDec_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._int_ == child)
        {
            this._int_ = null;
            return;
        }

        if(this._main_ == child)
        {
            this._main_ = null;
            return;
        }

        if(this._parametro_.remove(child))
        {
            return;
        }

        if(this._compostoDec_ == child)
        {
            this._compostoDec_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._int_ == oldChild)
        {
            setInt((TInt) newChild);
            return;
        }

        if(this._main_ == oldChild)
        {
            setMain((TMain) newChild);
            return;
        }

        for(ListIterator<PParametro> i = this._parametro_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PParametro) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._compostoDec_ == oldChild)
        {
            setCompostoDec((PCompostoDec) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}