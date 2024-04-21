// Generated by view binder compiler. Do not edit!
package com.creativity.dev.formsimple.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.creativity.dev.formsimple.R;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ContentLayoutBasic2Binding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final EditText edtText;

  @NonNull
  public final RelativeLayout rlLetterContent;

  @NonNull
  public final TextInputLayout style2;

  @NonNull
  public final TextView tvLettersInps;

  @NonNull
  public final TextView tvMessageError;

  private ContentLayoutBasic2Binding(@NonNull LinearLayout rootView, @NonNull EditText edtText,
      @NonNull RelativeLayout rlLetterContent, @NonNull TextInputLayout style2,
      @NonNull TextView tvLettersInps, @NonNull TextView tvMessageError) {
    this.rootView = rootView;
    this.edtText = edtText;
    this.rlLetterContent = rlLetterContent;
    this.style2 = style2;
    this.tvLettersInps = tvLettersInps;
    this.tvMessageError = tvMessageError;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ContentLayoutBasic2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ContentLayoutBasic2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.content_layout_basic_2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ContentLayoutBasic2Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.edt_text;
      EditText edtText = ViewBindings.findChildViewById(rootView, id);
      if (edtText == null) {
        break missingId;
      }

      id = R.id.rl_letter_content;
      RelativeLayout rlLetterContent = ViewBindings.findChildViewById(rootView, id);
      if (rlLetterContent == null) {
        break missingId;
      }

      id = R.id.style2;
      TextInputLayout style2 = ViewBindings.findChildViewById(rootView, id);
      if (style2 == null) {
        break missingId;
      }

      id = R.id.tv_letters_inps;
      TextView tvLettersInps = ViewBindings.findChildViewById(rootView, id);
      if (tvLettersInps == null) {
        break missingId;
      }

      id = R.id.tv_message_error;
      TextView tvMessageError = ViewBindings.findChildViewById(rootView, id);
      if (tvMessageError == null) {
        break missingId;
      }

      return new ContentLayoutBasic2Binding((LinearLayout) rootView, edtText, rlLetterContent,
          style2, tvLettersInps, tvMessageError);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}