package com.creativity.dev.formsimple.adapter.forms;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\'\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u00012\u00020\u00032\u00020\u0004:\u0001(B;\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f\u00a2\u0006\u0002\u0010\u0010J\b\u0010\u001c\u001a\u00020\u001dH\u0016J>\u0010\u001e\u001a\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fH&J\u001c\u0010!\u001a\u00020\u001f2\n\u0010\"\u001a\u00060\u0002R\u00020\u00002\u0006\u0010#\u001a\u00020\u001dH\u0016J\u001c\u0010$\u001a\u00060\u0002R\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u001dH\u0016R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R!\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006)"}, d2 = {"Lcom/creativity/dev/formsimple/adapter/forms/DynamicListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/creativity/dev/formsimple/adapter/forms/DynamicListAdapter$DynamicListHolder;", "Lcom/creativity/dev/formsimple/interfaces/DelegateDialogAlert;", "Lcom/creativity/dev/formsimple/adapter/forms/Interfaces/DynamicListAdapterI;", "model", "", "Lcom/creativity/dev/formsimple/model/ListDynamic;", "mContext", "Landroid/content/Context;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "positionRow", "Ljava/util/ArrayList;", "Lcom/creativity/dev/formsimple/model/CollectionControlsList;", "Lkotlin/collections/ArrayList;", "(Ljava/util/List;Landroid/content/Context;Landroidx/recyclerview/widget/RecyclerView;Ljava/util/ArrayList;)V", "list", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "getMContext", "()Landroid/content/Context;", "getPositionRow", "()Ljava/util/ArrayList;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "getItemCount", "", "init", "", "listMenu", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DynamicListHolder", "formsimple_debug"})
public abstract class DynamicListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.creativity.dev.formsimple.adapter.forms.DynamicListAdapter.DynamicListHolder> implements com.creativity.dev.formsimple.interfaces.DelegateDialogAlert, com.creativity.dev.formsimple.adapter.forms.Interfaces.DynamicListAdapterI {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context mContext = null;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.creativity.dev.formsimple.model.ListDynamic> list;
    @org.jetbrains.annotations.NotNull
    private final androidx.recyclerview.widget.RecyclerView recyclerView = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<com.creativity.dev.formsimple.model.CollectionControlsList> positionRow = null;
    
    public DynamicListAdapter(@org.jetbrains.annotations.NotNull
    java.util.List<com.creativity.dev.formsimple.model.ListDynamic> model, @org.jetbrains.annotations.NotNull
    android.content.Context mContext, @org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.creativity.dev.formsimple.model.CollectionControlsList> positionRow) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getMContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.creativity.dev.formsimple.model.ListDynamic> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull
    java.util.List<com.creativity.dev.formsimple.model.ListDynamic> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.recyclerview.widget.RecyclerView getRecyclerView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.creativity.dev.formsimple.model.CollectionControlsList> getPositionRow() {
        return null;
    }
    
    public abstract void init(@org.jetbrains.annotations.NotNull
    java.util.List<com.creativity.dev.formsimple.model.ListDynamic> listMenu, @org.jetbrains.annotations.NotNull
    android.content.Context mContext, @org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.creativity.dev.formsimple.model.CollectionControlsList> positionRow);
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.creativity.dev.formsimple.adapter.forms.DynamicListAdapter.DynamicListHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.creativity.dev.formsimple.adapter.forms.DynamicListAdapter.DynamicListHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010z\u001a\u00020{2\u0006\u0010|\u001a\u00020{2\u0006\u0010}\u001a\u00020~H\u0002J\u0013\u0010\u007f\u001a\u00030\u0080\u00012\b\u0010\u0081\u0001\u001a\u00030\u0082\u0001H\u0016J\u0011\u0010\u0083\u0001\u001a\u00020{2\u0006\u0010}\u001a\u00020~H\u0016J\u0014\u0010\u0084\u0001\u001a\u00030\u0080\u00012\b\u0010\u0081\u0001\u001a\u00030\u0082\u0001H\u0016J\u001b\u0010\u0085\u0001\u001a\u00030\u0080\u00012\u000f\u0010\u0086\u0001\u001a\n\u0012\u0005\u0012\u00030\u0088\u00010\u0087\u0001H\u0016J\t\u0010\u0089\u0001\u001a\u00020~H\u0016J\u0013\u0010\u008a\u0001\u001a\u00030\u0080\u00012\u0007\u0010\u008b\u0001\u001a\u00020\u0006H\u0017J\u0012\u0010\u008c\u0001\u001a\u00030\u0080\u00012\u0006\u0010|\u001a\u00020{H\u0002J\u0013\u0010\u008d\u0001\u001a\u00030\u0080\u00012\u0007\u0010\u008e\u0001\u001a\u00020{H\u0003J\u0013\u0010\u008f\u0001\u001a\u00030\u0080\u00012\u0007\u0010\u008e\u0001\u001a\u00020{H\u0003R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000b\"\u0004\b\"\u0010\rR\u001a\u0010#\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000b\"\u0004\b%\u0010\rR\u001a\u0010&\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u000b\"\u0004\b(\u0010\rR\u001a\u0010)\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u000b\"\u0004\b+\u0010\rR\u001a\u0010,\u001a\u00020-X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u00102\u001a\u000203X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001a\u00108\u001a\u000203X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u00105\"\u0004\b:\u00107R\u001a\u0010;\u001a\u00020<X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001a\u0010A\u001a\u000203X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u00105\"\u0004\bC\u00107R\u001a\u0010D\u001a\u000203X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u00105\"\u0004\bF\u00107R\u001a\u0010G\u001a\u00020HX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001a\u0010M\u001a\u00020HX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010J\"\u0004\bO\u0010LR\u001a\u0010P\u001a\u00020HX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010J\"\u0004\bR\u0010LR\u001a\u0010S\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u0010\u000b\"\u0004\bU\u0010\rR\u001a\u0010V\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u0010\u000b\"\u0004\bX\u0010\rR\u001a\u0010Y\u001a\u000203X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bZ\u00105\"\u0004\b[\u00107R\u001a\u0010\\\u001a\u00020]X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u001a\u0010b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bc\u0010\u000b\"\u0004\bd\u0010\rR\u001a\u0010e\u001a\u00020fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u001a\u0010k\u001a\u00020lX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\u001a\u0010q\u001a\u000203X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\br\u00105\"\u0004\bs\u00107R\u001a\u0010t\u001a\u000203X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bu\u00105\"\u0004\bv\u00107R\u001a\u0010w\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bx\u0010\u000b\"\u0004\by\u0010\r\u00a8\u0006\u0090\u0001"}, d2 = {"Lcom/creativity/dev/formsimple/adapter/forms/DynamicListAdapter$DynamicListHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "Lcom/creativity/dev/formsimple/interfaces/EventListDynamic;", "Lcom/creativity/dev/formsimple/interfaces/EventList;", "view", "Landroid/view/View;", "(Lcom/creativity/dev/formsimple/adapter/forms/DynamicListAdapter;Landroid/view/View;)V", "UnvContent", "Landroid/widget/LinearLayout;", "getUnvContent", "()Landroid/widget/LinearLayout;", "setUnvContent", "(Landroid/widget/LinearLayout;)V", "cardViewContent", "Landroidx/cardview/widget/CardView;", "getCardViewContent", "()Landroidx/cardview/widget/CardView;", "setCardViewContent", "(Landroidx/cardview/widget/CardView;)V", "check", "Landroid/widget/CheckBox;", "getCheck", "()Landroid/widget/CheckBox;", "setCheck", "(Landroid/widget/CheckBox;)V", "constraintMainLayout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getConstraintMainLayout", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "setConstraintMainLayout", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "content", "getContent", "setContent", "contentBasic1", "getContentBasic1", "setContentBasic1", "contentBobble", "getContentBobble", "setContentBobble", "contentImg", "getContentImg", "setContentImg", "contentLetter", "Landroid/widget/RelativeLayout;", "getContentLetter", "()Landroid/widget/RelativeLayout;", "setContentLetter", "(Landroid/widget/RelativeLayout;)V", "description", "Landroid/widget/TextView;", "getDescription", "()Landroid/widget/TextView;", "setDescription", "(Landroid/widget/TextView;)V", "descriptionBottom", "getDescriptionBottom", "setDescriptionBottom", "editText", "Landroid/widget/EditText;", "getEditText", "()Landroid/widget/EditText;", "setEditText", "(Landroid/widget/EditText;)V", "errorMessage", "getErrorMessage", "setErrorMessage", "icon", "getIcon", "setIcon", "iconLeft", "Landroid/widget/ImageView;", "getIconLeft", "()Landroid/widget/ImageView;", "setIconLeft", "(Landroid/widget/ImageView;)V", "img", "getImg", "setImg", "img2", "getImg2", "setImg2", "includeBasic1", "getIncludeBasic1", "setIncludeBasic1", "includeBasic2", "getIncludeBasic2", "setIncludeBasic2", "letter", "getLetter", "setLetter", "progressBarRight", "Landroid/widget/ProgressBar;", "getProgressBarRight", "()Landroid/widget/ProgressBar;", "setProgressBarRight", "(Landroid/widget/ProgressBar;)V", "seperatorContent", "getSeperatorContent", "setSeperatorContent", "styleEditText", "Lcom/google/android/material/textfield/TextInputLayout;", "getStyleEditText", "()Lcom/google/android/material/textfield/TextInputLayout;", "setStyleEditText", "(Lcom/google/android/material/textfield/TextInputLayout;)V", "swtichActive", "Landroid/widget/Switch;", "getSwtichActive", "()Landroid/widget/Switch;", "setSwtichActive", "(Landroid/widget/Switch;)V", "title", "getTitle", "setTitle", "tvBubble", "getTvBubble", "setTvBubble", "universalContent", "getUniversalContent", "setUniversalContent", "actionSelect", "", "pos", "isSelected", "", "evenSetSimpleString", "", "str", "", "eventChecked", "eventEdtiText", "eventSetList", "inputList", "", "", "getSelected", "onClick", "v", "response", "showDatePicker", "setPosition", "showTimePicker", "formsimple_debug"})
    public final class DynamicListHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener, com.creativity.dev.formsimple.interfaces.EventListDynamic, com.creativity.dev.formsimple.interfaces.EventList {
        @org.jetbrains.annotations.NotNull
        private android.widget.TextView title;
        @org.jetbrains.annotations.NotNull
        private android.widget.TextView letter;
        @org.jetbrains.annotations.NotNull
        private android.widget.TextView errorMessage;
        @org.jetbrains.annotations.NotNull
        private android.widget.TextView icon;
        @org.jetbrains.annotations.NotNull
        private android.widget.TextView tvBubble;
        @org.jetbrains.annotations.NotNull
        private android.widget.TextView descriptionBottom;
        @org.jetbrains.annotations.NotNull
        private android.widget.EditText editText;
        @org.jetbrains.annotations.NotNull
        private android.widget.TextView description;
        @org.jetbrains.annotations.NotNull
        private android.widget.CheckBox check;
        @org.jetbrains.annotations.NotNull
        private android.widget.RelativeLayout contentLetter;
        @org.jetbrains.annotations.NotNull
        private android.widget.LinearLayout content;
        @org.jetbrains.annotations.NotNull
        private android.widget.LinearLayout UnvContent;
        @org.jetbrains.annotations.NotNull
        private androidx.cardview.widget.CardView cardViewContent;
        @org.jetbrains.annotations.NotNull
        private android.widget.LinearLayout contentImg;
        @org.jetbrains.annotations.NotNull
        private android.widget.LinearLayout contentBobble;
        @org.jetbrains.annotations.NotNull
        private android.widget.LinearLayout contentBasic1;
        @org.jetbrains.annotations.NotNull
        private android.widget.LinearLayout includeBasic1;
        @org.jetbrains.annotations.NotNull
        private android.widget.LinearLayout includeBasic2;
        @org.jetbrains.annotations.NotNull
        private android.widget.LinearLayout seperatorContent;
        @org.jetbrains.annotations.NotNull
        private android.widget.LinearLayout universalContent;
        @org.jetbrains.annotations.NotNull
        private androidx.constraintlayout.widget.ConstraintLayout constraintMainLayout;
        @org.jetbrains.annotations.NotNull
        private com.google.android.material.textfield.TextInputLayout styleEditText;
        @org.jetbrains.annotations.NotNull
        private android.widget.ImageView img;
        @org.jetbrains.annotations.NotNull
        private android.widget.ImageView img2;
        @org.jetbrains.annotations.NotNull
        private android.widget.ImageView iconLeft;
        @org.jetbrains.annotations.NotNull
        private android.widget.ProgressBar progressBarRight;
        @org.jetbrains.annotations.NotNull
        private android.widget.Switch swtichActive;
        
        public DynamicListHolder(@org.jetbrains.annotations.NotNull
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getTitle() {
            return null;
        }
        
        public final void setTitle(@org.jetbrains.annotations.NotNull
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getLetter() {
            return null;
        }
        
        public final void setLetter(@org.jetbrains.annotations.NotNull
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getErrorMessage() {
            return null;
        }
        
        public final void setErrorMessage(@org.jetbrains.annotations.NotNull
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getIcon() {
            return null;
        }
        
        public final void setIcon(@org.jetbrains.annotations.NotNull
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getTvBubble() {
            return null;
        }
        
        public final void setTvBubble(@org.jetbrains.annotations.NotNull
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getDescriptionBottom() {
            return null;
        }
        
        public final void setDescriptionBottom(@org.jetbrains.annotations.NotNull
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.EditText getEditText() {
            return null;
        }
        
        public final void setEditText(@org.jetbrains.annotations.NotNull
        android.widget.EditText p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getDescription() {
            return null;
        }
        
        public final void setDescription(@org.jetbrains.annotations.NotNull
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.CheckBox getCheck() {
            return null;
        }
        
        public final void setCheck(@org.jetbrains.annotations.NotNull
        android.widget.CheckBox p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.RelativeLayout getContentLetter() {
            return null;
        }
        
        public final void setContentLetter(@org.jetbrains.annotations.NotNull
        android.widget.RelativeLayout p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.LinearLayout getContent() {
            return null;
        }
        
        public final void setContent(@org.jetbrains.annotations.NotNull
        android.widget.LinearLayout p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.LinearLayout getUnvContent() {
            return null;
        }
        
        public final void setUnvContent(@org.jetbrains.annotations.NotNull
        android.widget.LinearLayout p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.cardview.widget.CardView getCardViewContent() {
            return null;
        }
        
        public final void setCardViewContent(@org.jetbrains.annotations.NotNull
        androidx.cardview.widget.CardView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.LinearLayout getContentImg() {
            return null;
        }
        
        public final void setContentImg(@org.jetbrains.annotations.NotNull
        android.widget.LinearLayout p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.LinearLayout getContentBobble() {
            return null;
        }
        
        public final void setContentBobble(@org.jetbrains.annotations.NotNull
        android.widget.LinearLayout p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.LinearLayout getContentBasic1() {
            return null;
        }
        
        public final void setContentBasic1(@org.jetbrains.annotations.NotNull
        android.widget.LinearLayout p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.LinearLayout getIncludeBasic1() {
            return null;
        }
        
        public final void setIncludeBasic1(@org.jetbrains.annotations.NotNull
        android.widget.LinearLayout p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.LinearLayout getIncludeBasic2() {
            return null;
        }
        
        public final void setIncludeBasic2(@org.jetbrains.annotations.NotNull
        android.widget.LinearLayout p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.LinearLayout getSeperatorContent() {
            return null;
        }
        
        public final void setSeperatorContent(@org.jetbrains.annotations.NotNull
        android.widget.LinearLayout p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.LinearLayout getUniversalContent() {
            return null;
        }
        
        public final void setUniversalContent(@org.jetbrains.annotations.NotNull
        android.widget.LinearLayout p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.constraintlayout.widget.ConstraintLayout getConstraintMainLayout() {
            return null;
        }
        
        public final void setConstraintMainLayout(@org.jetbrains.annotations.NotNull
        androidx.constraintlayout.widget.ConstraintLayout p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.google.android.material.textfield.TextInputLayout getStyleEditText() {
            return null;
        }
        
        public final void setStyleEditText(@org.jetbrains.annotations.NotNull
        com.google.android.material.textfield.TextInputLayout p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.ImageView getImg() {
            return null;
        }
        
        public final void setImg(@org.jetbrains.annotations.NotNull
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.ImageView getImg2() {
            return null;
        }
        
        public final void setImg2(@org.jetbrains.annotations.NotNull
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.ImageView getIconLeft() {
            return null;
        }
        
        public final void setIconLeft(@org.jetbrains.annotations.NotNull
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.ProgressBar getProgressBarRight() {
            return null;
        }
        
        public final void setProgressBarRight(@org.jetbrains.annotations.NotNull
        android.widget.ProgressBar p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.Switch getSwtichActive() {
            return null;
        }
        
        public final void setSwtichActive(@org.jetbrains.annotations.NotNull
        android.widget.Switch p0) {
        }
        
        @android.annotation.SuppressLint(value = {"QueryPermissionsNeeded"})
        @java.lang.Override
        public void onClick(@org.jetbrains.annotations.NotNull
        android.view.View v) {
        }
        
        @java.lang.Override
        public void eventEdtiText(@org.jetbrains.annotations.NotNull
        java.lang.String str) {
        }
        
        @java.lang.Override
        public int eventChecked(boolean isSelected) {
            return 0;
        }
        
        @java.lang.Override
        public boolean getSelected() {
            return false;
        }
        
        @java.lang.Override
        public void evenSetSimpleString(@org.jetbrains.annotations.NotNull
        java.lang.String str) {
        }
        
        @java.lang.Override
        public void eventSetList(@org.jetbrains.annotations.NotNull
        java.util.List<? extends java.lang.Object> inputList) {
        }
        
        private final int actionSelect(int pos, boolean isSelected) {
            return 0;
        }
        
        private final void response(int pos) {
        }
        
        @android.annotation.SuppressLint(value = {"SetTextI18n"})
        private final void showDatePicker(int setPosition) {
        }
        
        @android.annotation.SuppressLint(value = {"SetTextI18n"})
        private final void showTimePicker(int setPosition) {
        }
    }
}