package com.creativity.dev.formsimple.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\u001e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004H\u0007J\u000e\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0012\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/creativity/dev/formsimple/utils/TimerHelper;", "", "()V", "srtFormat", "", "strRespons", "getFormateHour", "getTrasformHour", "hour", "", "minute", "isMilitary", "", "setTextCalendar", "date", "Ljava/util/Date;", "format", "transformMinute12to24Hours", "transformMinute24to12Hours", "Companion", "formsimple_debug"})
public final class TimerHelper {
    private java.lang.String strRespons = "";
    private java.lang.String srtFormat = "";
    @org.jetbrains.annotations.NotNull
    public static final com.creativity.dev.formsimple.utils.TimerHelper.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    private static java.lang.String longDate = "MMMM dd yyyy";
    @org.jetbrains.annotations.NotNull
    private static java.lang.String timeFormatBasic = "HH:mm";
    
    public TimerHelper() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public final java.lang.String getFormateHour() {
        return null;
    }
    
    public final int transformMinute24to12Hours(int hour) {
        return 0;
    }
    
    public final int transformMinute12to24Hours(int hour) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public final java.lang.String setTextCalendar(@org.jetbrains.annotations.NotNull
    java.util.Date date, @org.jetbrains.annotations.NotNull
    java.lang.String format) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTrasformHour(int hour, int minute, boolean isMilitary) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/creativity/dev/formsimple/utils/TimerHelper$Companion;", "", "()V", "longDate", "", "getLongDate", "()Ljava/lang/String;", "setLongDate", "(Ljava/lang/String;)V", "timeFormatBasic", "getTimeFormatBasic", "setTimeFormatBasic", "formsimple_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getLongDate() {
            return null;
        }
        
        public final void setLongDate(@org.jetbrains.annotations.NotNull
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getTimeFormatBasic() {
            return null;
        }
        
        public final void setTimeFormatBasic(@org.jetbrains.annotations.NotNull
        java.lang.String p0) {
        }
    }
}