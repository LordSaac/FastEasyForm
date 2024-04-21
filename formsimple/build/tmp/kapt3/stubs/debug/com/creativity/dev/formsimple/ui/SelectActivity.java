package com.creativity.dev.formsimple.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\nH\u0016J\u0016\u0010\u0018\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0017J\b\u0010\u001c\u001a\u00020\u0015H\u0002J\u000e\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001fJ\u0012\u0010 \u001a\u00020\u00152\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\u0010\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020\f2\u0006\u0010\'\u001a\u00020(H\u0016J\b\u0010\u001e\u001a\u00020\u0015H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/creativity/dev/formsimple/ui/SelectActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/creativity/dev/formsimple/interfaces/EventList;", "()V", "binding", "Lcom/creativity/dev/formsimple/databinding/ActivitySelectBinding;", "colorBackgroundToolbar", "", "colorTitleToolbar", "emptyMessages", "", "isSingleCheck", "", "listObject", "Lcom/creativity/dev/formsimple/model/ListObject;", "mAdapter", "Lcom/creativity/dev/formsimple/adapter/options/SelectAdapter;", "mContext", "title", "titleToolBar", "activityCreateToolbar", "", "evenSetSimpleString", "str", "eventSetList", "inputList", "", "", "getPutExtraIntent", "onClickFinish", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "formsimple_debug"})
public final class SelectActivity extends androidx.appcompat.app.AppCompatActivity implements com.creativity.dev.formsimple.interfaces.EventList {
    private java.lang.String title = "";
    private java.lang.String titleToolBar = "";
    private java.lang.String emptyMessages = "";
    private boolean isSingleCheck = false;
    private com.creativity.dev.formsimple.model.ListObject listObject;
    private com.creativity.dev.formsimple.ui.SelectActivity mContext;
    private com.creativity.dev.formsimple.adapter.options.SelectAdapter mAdapter;
    private int colorTitleToolbar = android.graphics.Color.WHITE;
    private int colorBackgroundToolbar;
    private com.creativity.dev.formsimple.databinding.ActivitySelectBinding binding;
    
    public SelectActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    public final void onClickFinish(@org.jetbrains.annotations.NotNull
    android.view.View view) {
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
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    @java.lang.Override
    public void eventSetList(@org.jetbrains.annotations.NotNull
    java.util.List<? extends java.lang.Object> inputList) {
    }
    
    private final void getPutExtraIntent() {
    }
    
    private final void view() {
    }
    
    @java.lang.Override
    public void evenSetSimpleString(@org.jetbrains.annotations.NotNull
    java.lang.String str) {
    }
    
    private final void activityCreateToolbar() {
    }
}