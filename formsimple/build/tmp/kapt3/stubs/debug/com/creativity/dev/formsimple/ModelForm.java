package com.creativity.dev.formsimple;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015J\b\u0010\u0016\u001a\u00020\u0017H\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0018"}, d2 = {"Lcom/creativity/dev/formsimple/ModelForm;", "Ljava/io/Serializable;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "container", "Landroidx/recyclerview/widget/RecyclerView;", "getContainer", "()Landroidx/recyclerview/widget/RecyclerView;", "setContainer", "(Landroidx/recyclerview/widget/RecyclerView;)V", "mContext", "mode", "Lcom/creativity/dev/formsimple/types/uiMode;", "getMode", "()Lcom/creativity/dev/formsimple/types/uiMode;", "setMode", "(Lcom/creativity/dev/formsimple/types/uiMode;)V", "Body", "", "body", "Lkotlin/Function0;", "isDarkTheme", "", "formsimple_debug"})
public final class ModelForm implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull
    private com.creativity.dev.formsimple.types.uiMode mode = com.creativity.dev.formsimple.types.uiMode.light;
    public androidx.recyclerview.widget.RecyclerView container;
    private android.content.Context mContext;
    
    public ModelForm(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.creativity.dev.formsimple.types.uiMode getMode() {
        return null;
    }
    
    public final void setMode(@org.jetbrains.annotations.NotNull
    com.creativity.dev.formsimple.types.uiMode p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.recyclerview.widget.RecyclerView getContainer() {
        return null;
    }
    
    public final void setContainer(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    public final void Body(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> body) {
    }
    
    private final boolean isDarkTheme() {
        return false;
    }
}