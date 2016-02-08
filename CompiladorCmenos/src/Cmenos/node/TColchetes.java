/* This file was generated by SableCC (http://www.sablecc.org/). */

package Cmenos.node;

import Cmenos.analysis.*;

@SuppressWarnings("nls")
public final class TColchetes extends Token
{
    public TColchetes(String text)
    {
        setText(text);
    }

    public TColchetes(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TColchetes(getText(), getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTColchetes(this);
    }
}