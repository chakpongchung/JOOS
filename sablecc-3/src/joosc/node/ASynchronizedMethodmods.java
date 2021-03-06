/* This file was generated by SableCC (http://www.sablecc.org/). */

package joosc.node;

import joosc.analysis.*;

@SuppressWarnings("nls")
public final class ASynchronizedMethodmods extends PMethodmods
{
    private TSynchronized _synchronized_;

    public ASynchronizedMethodmods()
    {
        // Constructor
    }

    public ASynchronizedMethodmods(
        @SuppressWarnings("hiding") TSynchronized _synchronized_)
    {
        // Constructor
        setSynchronized(_synchronized_);

    }

    @Override
    public Object clone()
    {
        return new ASynchronizedMethodmods(
            cloneNode(this._synchronized_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASynchronizedMethodmods(this);
    }

    public TSynchronized getSynchronized()
    {
        return this._synchronized_;
    }

    public void setSynchronized(TSynchronized node)
    {
        if(this._synchronized_ != null)
        {
            this._synchronized_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._synchronized_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._synchronized_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._synchronized_ == child)
        {
            this._synchronized_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._synchronized_ == oldChild)
        {
            setSynchronized((TSynchronized) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
