/* This file was generated by SableCC (http://www.sablecc.org/). */

package joosc.node;

import java.util.*;
import joosc.analysis.*;

@SuppressWarnings("nls")
public final class AExternConstructor extends PExternConstructor
{
    private TIdentifier _identifier_;
    private final LinkedList<PFormal> _formals_ = new LinkedList<PFormal>();

    public AExternConstructor()
    {
        // Constructor
    }

    public AExternConstructor(
        @SuppressWarnings("hiding") TIdentifier _identifier_,
        @SuppressWarnings("hiding") List<?> _formals_)
    {
        // Constructor
        setIdentifier(_identifier_);

        setFormals(_formals_);

    }

    @Override
    public Object clone()
    {
        return new AExternConstructor(
            cloneNode(this._identifier_),
            cloneList(this._formals_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExternConstructor(this);
    }

    public TIdentifier getIdentifier()
    {
        return this._identifier_;
    }

    public void setIdentifier(TIdentifier node)
    {
        if(this._identifier_ != null)
        {
            this._identifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._identifier_ = node;
    }

    public LinkedList<PFormal> getFormals()
    {
        return this._formals_;
    }

    public void setFormals(List<?> list)
    {
        for(PFormal e : this._formals_)
        {
            e.parent(null);
        }
        this._formals_.clear();

        for(Object obj_e : list)
        {
            PFormal e = (PFormal) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._formals_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._identifier_)
            + toString(this._formals_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._identifier_ == child)
        {
            this._identifier_ = null;
            return;
        }

        if(this._formals_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._identifier_ == oldChild)
        {
            setIdentifier((TIdentifier) newChild);
            return;
        }

        for(ListIterator<PFormal> i = this._formals_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PFormal) newChild);
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
