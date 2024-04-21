package com.creativity.dev.formsimple.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\bH&\u00a8\u0006\t"}, d2 = {"Lcom/creativity/dev/formsimple/interfaces/EventList;", "", "evenSetSimpleString", "", "str", "", "eventSetList", "inputList", "", "formsimple_debug"})
public abstract interface EventList {
    
    public abstract void eventSetList(@org.jetbrains.annotations.NotNull
    java.util.List<? extends java.lang.Object> inputList);
    
    public abstract void evenSetSimpleString(@org.jetbrains.annotations.NotNull
    java.lang.String str);
}