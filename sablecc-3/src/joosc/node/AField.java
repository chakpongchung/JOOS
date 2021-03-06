/* This file was generated by SableCC (http://www.sablecc.org/). */

package joosc.node;

import java.util.*;
import joosc.analysis.*;

@SuppressWarnings("nls")
public final class AField extends PField
{
    private final LinkedList<POnefield> _fields_ = new LinkedList<POnefield>();

    public AField()
    {
        // Constructor
    }

    public AField(
        @SuppressWarnings("hiding") List<?> _fields_)
    {
        // Constructor
        setFields(_fields_);

    }

    @Override
    public Object clone()
    {
        return new AField(
            cloneList(this._fields_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAField(this);
    }

    public LinkedList<POnefield> getFields()
    {
        return this._fields_;
    }

    public void setFields(List<?> list)
    {
        for(POnefield e : this._fields_)
        {
            e.parent(null);
        }
        this._fields_.clear();

        for(Object obj_e : list)
        {
            POnefield e = (POnefield) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._fields_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._fields_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._fields_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<POnefield> i = this._fields_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((POnefield) newChild);
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
