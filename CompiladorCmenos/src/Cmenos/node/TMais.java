/* This file was generated by SableCC (http://www.sablecc.org/). */

package Cmenos.node;

import Cmenos.analysis.*;

@SuppressWarnings("nls")
public final class TMais extends Token
{
    public TMais(String text)
    {
        setText(text);
    }

    public TMais(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TMais(getText(), getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTMais(this);
    }
}
