/* This file was generated by SableCC (http://www.sablecc.org/). */

package Cmenos.node;

import java.util.*;
import Cmenos.analysis.*;

@SuppressWarnings("nls")
public final class APrograma extends PPrograma
{
    private final LinkedList<PDeclaracao> _declaracao_ = new LinkedList<PDeclaracao>();

    public APrograma()
    {
        // Constructor
    }

    public APrograma(
        @SuppressWarnings("hiding") List<?> _declaracao_)
    {
        // Constructor
        setDeclaracao(_declaracao_);

    }

    @Override
    public Object clone()
    {
        return new APrograma(
            cloneList(this._declaracao_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPrograma(this);
    }

    public LinkedList<PDeclaracao> getDeclaracao()
    {
        return this._declaracao_;
    }

    public void setDeclaracao(List<?> list)
    {
        for(PDeclaracao e : this._declaracao_)
        {
            e.parent(null);
        }
        this._declaracao_.clear();

        for(Object obj_e : list)
        {
            PDeclaracao e = (PDeclaracao) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._declaracao_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._declaracao_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._declaracao_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PDeclaracao> i = this._declaracao_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PDeclaracao) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}
