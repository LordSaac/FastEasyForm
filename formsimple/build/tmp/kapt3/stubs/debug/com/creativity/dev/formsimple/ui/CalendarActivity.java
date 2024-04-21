package com.creativity.dev.formsimple.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020$H\u0003J\u0012\u0010&\u001a\u00020$2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0014J\u0010\u0010)\u001a\u00020\u00152\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020\u00152\u0006\u0010-\u001a\u00020.H\u0016J\b\u0010/\u001a\u00020$H\u0003J\u0010\u00100\u001a\u00020$2\u0006\u00101\u001a\u000202H\u0003J\u0010\u00103\u001a\u00020$2\u0006\u00101\u001a\u000202H\u0003R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u0000\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020 \u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"\u00a8\u00064"}, d2 = {"Lcom/creativity/dev/formsimple/ui/CalendarActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/creativity/dev/formsimple/databinding/ActivityCalendarBinding;", "colorBackgroundToolbar", "", "colorTitleToolbar", "context", "getContext", "()Lcom/creativity/dev/formsimple/ui/CalendarActivity;", "formatDate", "", "getFormatDate", "()Ljava/lang/String;", "setFormatDate", "(Ljava/lang/String;)V", "getDateString", "getGetDateString", "setGetDateString", "isCalendar", "", "()Z", "setCalendar", "(Z)V", "objCollectionCalendar", "Lcom/creativity/dev/formsimple/model/ColectionCalendar;", "getObjCollectionCalendar", "()Lcom/creativity/dev/formsimple/model/ColectionCalendar;", "setObjCollectionCalendar", "(Lcom/creativity/dev/formsimple/model/ColectionCalendar;)V", "timerHelper", "Lcom/creativity/dev/formsimple/utils/TimerHelper;", "getTimerHelper", "()Lcom/creativity/dev/formsimple/utils/TimerHelper;", "activityCreateToolbar", "", "getBundleData", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "setRangeDate", "setStringDate", "date", "Ljava/util/Date;", "setTextCalendar", "formsimple_debug"})
public final class CalendarActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull
    private final com.creativity.dev.formsimple.ui.CalendarActivity context = null;
    @org.jetbrains.annotations.NotNull
    private java.lang.String getDateString = "";
    private boolean isCalendar = false;
    @org.jetbrains.annotations.NotNull
    private java.lang.String formatDate;
    private int colorTitleToolbar = android.graphics.Color.WHITE;
    private int colorBackgroundToolbar;
    public com.creativity.dev.formsimple.model.ColectionCalendar objCollectionCalendar;
    @org.jetbrains.annotations.NotNull
    private final com.creativity.dev.formsimple.utils.TimerHelper timerHelper = null;
    private com.creativity.dev.formsimple.databinding.ActivityCalendarBinding binding;
    
    public CalendarActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.creativity.dev.formsimple.ui.CalendarActivity getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getGetDateString() {
        return null;
    }
    
    public final void setGetDateString(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final boolean isCalendar() {
        return false;
    }
    
    public final void setCalendar(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFormatDate() {
        return null;
    }
    
    public final void setFormatDate(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.creativity.dev.formsimple.model.ColectionCalendar getObjCollectionCalendar() {
        return null;
    }
    
    public final void setObjCollectionCalendar(@org.jetbrains.annotations.NotNull
    com.creativity.dev.formsimple.model.ColectionCalendar p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.creativity.dev.formsimple.utils.TimerHelper getTimerHelper() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull
    android.view.MenuItem item) {
        return false;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    @android.annotation.SuppressLint(value = {"SetTextI18n", "SuspiciousIndentation"})
    private final void getBundleData() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void setRangeDate() {
    }
    
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    private final void setTextCalendar(java.util.Date date) {
    }
    
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    private final void setStringDate(java.util.Date date) {
    }
    
    private final void activityCreateToolbar() {
    }
}