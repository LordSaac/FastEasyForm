package com.example.dreamteach.listselectdinamic.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0014"}, d2 = {"Lcom/example/dreamteach/listselectdinamic/utils/AlertDialogManager;", "", "mContext", "Landroid/content/Context;", "delegate", "Lcom/creativity/dev/formsimple/interfaces/DelegateDialogAlert;", "(Landroid/content/Context;Lcom/creativity/dev/formsimple/interfaces/DelegateDialogAlert;)V", "getDelegate", "()Lcom/creativity/dev/formsimple/interfaces/DelegateDialogAlert;", "setDelegate", "(Lcom/creativity/dev/formsimple/interfaces/DelegateDialogAlert;)V", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "alertComment", "", "str", "", "Companion", "formsimple_debug"})
public final class AlertDialogManager {
    @org.jetbrains.annotations.NotNull
    private android.content.Context mContext;
    @org.jetbrains.annotations.NotNull
    private com.creativity.dev.formsimple.interfaces.DelegateDialogAlert delegate;
    @org.jetbrains.annotations.NotNull
    public static final com.example.dreamteach.listselectdinamic.utils.AlertDialogManager.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getMContext() {
        return null;
    }
    
    public final void setMContext(@org.jetbrains.annotations.NotNull
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.creativity.dev.formsimple.interfaces.DelegateDialogAlert getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.NotNull
    com.creativity.dev.formsimple.interfaces.DelegateDialogAlert p0) {
    }
    
    public AlertDialogManager(@org.jetbrains.annotations.NotNull
    android.content.Context mContext, @org.jetbrains.annotations.NotNull
    com.creativity.dev.formsimple.interfaces.DelegateDialogAlert delegate) {
        super();
    }
    
    public final void alertComment(@org.jetbrains.annotations.NotNull
    java.lang.String str, @org.jetbrains.annotations.NotNull
    android.content.Context mContext) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b\u00a8\u0006\n"}, d2 = {"Lcom/example/dreamteach/listselectdinamic/utils/AlertDialogManager$Companion;", "", "()V", "simpleAlerts", "", "context", "Landroid/content/Context;", "title", "", "sms", "formsimple_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void simpleAlerts(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        java.lang.String title, @org.jetbrains.annotations.NotNull
        java.lang.String sms) {
        }
    }
}