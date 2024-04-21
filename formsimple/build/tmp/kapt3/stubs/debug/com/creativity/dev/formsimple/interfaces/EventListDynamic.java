package com.creativity.dev.formsimple.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0005H&\u00a8\u0006\u000b"}, d2 = {"Lcom/creativity/dev/formsimple/interfaces/EventListDynamic;", "", "eventChecked", "", "isSelected", "", "eventEdtiText", "", "str", "", "getSelected", "formsimple_debug"})
public abstract interface EventListDynamic {
    
    public abstract void eventEdtiText(@org.jetbrains.annotations.NotNull
    java.lang.String str);
    
    public abstract int eventChecked(boolean isSelected);
    
    public abstract boolean getSelected();
}