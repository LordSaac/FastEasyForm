package com.creativity.dev.formsimple.adapter.forms.Interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\u0018\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rH&J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH&J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00102\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\u0018\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\fH&J\b\u0010\u0015\u001a\u00020\u0005H&J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\u0017"}, d2 = {"Lcom/creativity/dev/formsimple/adapter/forms/Interfaces/DynamicListAdapterI;", "", "eventChecked", "", "isSelected", "", "position", "finishProgressView", "tag", "", "getResultAll", "Ljava/util/ArrayList;", "Lcom/creativity/dev/formsimple/model/ResponseFormsIGB;", "Lkotlin/collections/ArrayList;", "getResultByTag", "getResults", "", "startProgressView", "updateRow", "tagOrTitle", "objRespIGB", "validateAll", "validateByTag", "formsimple_debug"})
public abstract interface DynamicListAdapterI {
    
    public abstract boolean validateAll();
    
    public abstract boolean validateByTag(@org.jetbrains.annotations.NotNull
    java.lang.String tag);
    
    @org.jetbrains.annotations.NotNull
    public abstract com.creativity.dev.formsimple.model.ResponseFormsIGB getResultByTag(@org.jetbrains.annotations.NotNull
    java.lang.String tag);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.creativity.dev.formsimple.model.ResponseFormsIGB> getResults(@org.jetbrains.annotations.NotNull
    java.lang.String tag);
    
    public abstract boolean updateRow(@org.jetbrains.annotations.NotNull
    java.lang.String tagOrTitle, @org.jetbrains.annotations.NotNull
    com.creativity.dev.formsimple.model.ResponseFormsIGB objRespIGB);
    
    public abstract int eventChecked(boolean isSelected, int position);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.ArrayList<com.creativity.dev.formsimple.model.ResponseFormsIGB> getResultAll();
    
    public abstract boolean startProgressView(@org.jetbrains.annotations.NotNull
    java.lang.String tag);
    
    public abstract boolean finishProgressView(@org.jetbrains.annotations.NotNull
    java.lang.String tag);
}