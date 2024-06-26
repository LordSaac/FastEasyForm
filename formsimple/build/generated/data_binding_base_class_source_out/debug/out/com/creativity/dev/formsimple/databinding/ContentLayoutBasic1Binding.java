// Generated by view binder compiler. Do not edit!
package com.creativity.dev.formsimple.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.creativity.dev.formsimple.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ContentLayoutBasic1Binding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout lnyBasic1;

  @NonNull
  public final RelativeLayout rlLetterContent;

  @NonNull
  public final TextView tvDesc;

  @NonNull
  public final TextView tvDescInsp;

  @NonNull
  public final TextView tvLettersInps;

  @NonNull
  public final TextView tvTitleInsp;

  private ContentLayoutBasic1Binding(@NonNull LinearLayout rootView,
      @NonNull LinearLayout lnyBasic1, @NonNull RelativeLayout rlLetterContent,
      @NonNull TextView tvDesc, @NonNull TextView tvDescInsp, @NonNull TextView tvLettersInps,
      @NonNull TextView tvTitleInsp) {
    this.rootView = rootView;
    this.lnyBasic1 = lnyBasic1;
    this.rlLetterContent = rlLetterContent;
    this.tvDesc = tvDesc;
    this.tvDescInsp = tvDescInsp;
    this.tvLettersInps = tvLettersInps;
    this.tvTitleInsp = tvTitleInsp;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ContentLayoutBasic1Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ContentLayoutBasic1Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.content_layout_basic_1, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ContentLayoutBasic1Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.lny_basic_1;
      LinearLayout lnyBasic1 = ViewBindings.findChildViewById(rootView, id);
      if (lnyBasic1 == null) {
        break missingId;
      }

      id = R.id.rl_letter_content;
      RelativeLayout rlLetterContent = ViewBindings.findChildViewById(rootView, id);
      if (rlLetterContent == null) {
        break missingId;
      }

      id = R.id.tv_desc;
      TextView tvDesc = ViewBindings.findChildViewById(rootView, id);
      if (tvDesc == null) {
        break missingId;
      }

      id = R.id.tv_desc_insp;
      TextView tvDescInsp = ViewBindings.findChildViewById(rootView, id);
      if (tvDescInsp == null) {
        break missingId;
      }

      id = R.id.tv_letters_inps;
      TextView tvLettersInps = ViewBindings.findChildViewById(rootView, id);
      if (tvLettersInps == null) {
        break missingId;
      }

      id = R.id.tv_title_insp;
      TextView tvTitleInsp = ViewBindings.findChildViewById(rootView, id);
      if (tvTitleInsp == null) {
        break missingId;
      }

      return new ContentLayoutBasic1Binding((LinearLayout) rootView, lnyBasic1, rlLetterContent,
          tvDesc, tvDescInsp, tvLettersInps, tvTitleInsp);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
