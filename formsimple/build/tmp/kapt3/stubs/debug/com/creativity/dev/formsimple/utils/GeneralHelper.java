package com.creativity.dev.formsimple.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/creativity/dev/formsimple/utils/GeneralHelper;", "", "()V", "Companion", "formsimple_debug"})
public final class GeneralHelper {
    @org.jetbrains.annotations.NotNull
    public static final com.creativity.dev.formsimple.utils.GeneralHelper.Companion Companion = null;
    
    public GeneralHelper() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J&\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004J.\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004J\u0016\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004J\u0006\u0010\u0014\u001a\u00020\u0006J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0007J\u0016\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0016\u00a8\u0006!"}, d2 = {"Lcom/creativity/dev/formsimple/utils/GeneralHelper$Companion;", "", "()V", "countLines", "", "str", "", "createSimpleToolbar", "", "context", "Landroid/app/Activity;", "nameActivity", "colorTitle", "colorBackground", "createToolbar", "mToolbar", "Landroidx/appcompat/widget/Toolbar;", "getColor", "Landroid/content/Context;", "color", "keyBundle", "parseDate", "Ljava/util/Date;", "srt", "format", "setContentEmpty", "mActivity", "Lcom/creativity/dev/formsimple/databinding/ActivitySelectBinding;", "isVisible", "", "toCalendar", "Ljava/util/Calendar;", "date", "formsimple_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final int countLines(@org.jetbrains.annotations.NotNull
        java.lang.String str) {
            return 0;
        }
        
        public final int getColor(@org.jetbrains.annotations.NotNull
        android.content.Context context, int color) {
            return 0;
        }
        
        public final void createToolbar(@org.jetbrains.annotations.NotNull
        android.app.Activity context, @org.jetbrains.annotations.NotNull
        androidx.appcompat.widget.Toolbar mToolbar, @org.jetbrains.annotations.NotNull
        java.lang.String nameActivity, int colorTitle, int colorBackground) {
        }
        
        public final void createSimpleToolbar(@org.jetbrains.annotations.NotNull
        android.app.Activity context, @org.jetbrains.annotations.NotNull
        java.lang.String nameActivity, int colorTitle, int colorBackground) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String keyBundle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.Calendar toCalendar(@org.jetbrains.annotations.NotNull
        java.util.Date date) {
            return null;
        }
        
        public final void setContentEmpty(@org.jetbrains.annotations.NotNull
        com.creativity.dev.formsimple.databinding.ActivitySelectBinding mActivity, boolean isVisible) {
        }
        
        @org.jetbrains.annotations.NotNull
        @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
        public final java.util.Date parseDate(@org.jetbrains.annotations.NotNull
        java.lang.String srt, @org.jetbrains.annotations.NotNull
        java.lang.String format) {
            return null;
        }
    }
}