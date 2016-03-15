/* This file was generated by SableCC (http://www.sablecc.org/). */

package Cmenos.node;

import Cmenos.analysis.*;

@SuppressWarnings("nls")
public final class TInput extends Token
{
    public TInput()
    {
        super.setText("input");
    }

    public TInput(int line, int pos)
    {
        super.setText("input");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TInput(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTInput(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TInput text.");
    }
}
