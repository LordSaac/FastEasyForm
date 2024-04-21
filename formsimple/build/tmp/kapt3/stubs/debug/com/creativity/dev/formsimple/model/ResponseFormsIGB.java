package com.creativity.dev.formsimple.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR*\u0010!\u001a\u0012\u0012\u0004\u0012\u00020#0\"j\b\u0012\u0004\u0012\u00020#`$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001a\u0010)\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001b\"\u0004\b+\u0010\u001dR\u001a\u0010,\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\f\"\u0004\b.\u0010\u000eR\u001a\u0010/\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0006\"\u0004\b1\u0010\bR\u001a\u00102\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0006\"\u0004\b4\u0010\bR\u001a\u00105\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0006\"\u0004\b7\u0010\bR\u001a\u00108\u001a\u000209X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=\u00a8\u0006>"}, d2 = {"Lcom/creativity/dev/formsimple/model/ResponseFormsIGB;", "Ljava/io/Serializable;", "()V", "bubble", "", "getBubble", "()Ljava/lang/String;", "setBubble", "(Ljava/lang/String;)V", "checked", "", "getChecked", "()Z", "setChecked", "(Z)V", "date", "Ljava/util/Date;", "getDate", "()Ljava/util/Date;", "setDate", "(Ljava/util/Date;)V", "desc", "getDesc", "setDesc", "iconArrow", "", "getIconArrow", "()I", "setIconArrow", "(I)V", "iconSelected", "getIconSelected", "setIconSelected", "options", "Ljava/util/ArrayList;", "Lcom/creativity/dev/formsimple/model/Select;", "Lkotlin/collections/ArrayList;", "getOptions", "()Ljava/util/ArrayList;", "setOptions", "(Ljava/util/ArrayList;)V", "position", "getPosition", "setPosition", "swtichActive", "getSwtichActive", "setSwtichActive", "tag", "getTag", "setTag", "text", "getText", "setText", "title", "getTitle", "setTitle", "type", "Lcom/creativity/dev/formsimple/model/ListDynamic$TypeRow;", "getType", "()Lcom/creativity/dev/formsimple/model/ListDynamic$TypeRow;", "setType", "(Lcom/creativity/dev/formsimple/model/ListDynamic$TypeRow;)V", "formsimple_debug"})
public final class ResponseFormsIGB implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull
    private java.lang.String tag = "";
    private int position = 0;
    @org.jetbrains.annotations.NotNull
    private java.util.Date date;
    @org.jetbrains.annotations.NotNull
    private java.lang.String text = "";
    @org.jetbrains.annotations.NotNull
    private java.lang.String desc = "";
    @org.jetbrains.annotations.NotNull
    private java.lang.String title = "";
    @org.jetbrains.annotations.NotNull
    private java.lang.String bubble = "";
    private boolean checked = false;
    private boolean swtichActive = false;
    private int iconArrow;
    private int iconSelected;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.creativity.dev.formsimple.model.Select> options;
    public com.creativity.dev.formsimple.model.ListDynamic.TypeRow type;
    
    public ResponseFormsIGB() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTag() {
        return null;
    }
    
    public final void setTag(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final int getPosition() {
        return 0;
    }
    
    public final void setPosition(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date getDate() {
        return null;
    }
    
    public final void setDate(@org.jetbrains.annotations.NotNull
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getText() {
        return null;
    }
    
    public final void setText(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDesc() {
        return null;
    }
    
    public final void setDesc(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBubble() {
        return null;
    }
    
    public final void setBubble(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final boolean getChecked() {
        return false;
    }
    
    public final void setChecked(boolean p0) {
    }
    
    public final boolean getSwtichActive() {
        return false;
    }
    
    public final void setSwtichActive(boolean p0) {
    }
    
    public final int getIconArrow() {
        return 0;
    }
    
    public final void setIconArrow(int p0) {
    }
    
    public final int getIconSelected() {
        return 0;
    }
    
    public final void setIconSelected(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.creativity.dev.formsimple.model.Select> getOptions() {
        return null;
    }
    
    public final void setOptions(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.creativity.dev.formsimple.model.Select> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.creativity.dev.formsimple.model.ListDynamic.TypeRow getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.NotNull
    com.creativity.dev.formsimple.model.ListDynamic.TypeRow p0) {
    }
}