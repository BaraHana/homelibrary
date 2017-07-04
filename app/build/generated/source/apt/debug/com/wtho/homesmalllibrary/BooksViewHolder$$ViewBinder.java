// Generated code from Butter Knife. Do not modify!
package com.wtho.homesmalllibrary;

import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class BooksViewHolder$$ViewBinder<T extends BooksViewHolder> implements ViewBinder<T> {
  @Override
  public Unbinder bind(Finder finder, T target, Object source) {
    return new InnerUnbinder<>(target, finder, source);
  }

  protected static class InnerUnbinder<T extends BooksViewHolder> implements Unbinder {
    protected T target;

    protected InnerUnbinder(T target, Finder finder, Object source) {
      this.target = target;

      target.imgBook = finder.findRequiredViewAsType(source, 2131558496, "field 'imgBook'", ImageView.class);
      target.tvBookName = finder.findRequiredViewAsType(source, 2131558497, "field 'tvBookName'", TextView.class);
      target.tvAuthor = finder.findRequiredViewAsType(source, 2131558498, "field 'tvAuthor'", TextView.class);
    }

    @Override
    public void unbind() {
      T target = this.target;
      if (target == null) throw new IllegalStateException("Bindings already cleared.");

      target.imgBook = null;
      target.tvBookName = null;
      target.tvAuthor = null;

      this.target = null;
    }
  }
}
