package com.creativity.dev.formsimple.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u00ce\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0002\u009f\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u009c\u0001\u001a\u00020\u00072\r\u0010\u009d\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0016\u0010\u009e\u0001\u001a\u00020\u00072\r\u0010\u009d\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u0006\u0012\u0002\b\u00030\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\u001a\u0010!\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001b\"\u0004\b\"\u0010\u001dR\u001a\u0010#\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001b\"\u0004\b$\u0010\u001dR\u001a\u0010%\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001b\"\u0004\b&\u0010\u001dR\u001a\u0010\'\u001a\u00020(X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020.X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00103\u001a\u000204X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u00109\u001a\u00020:X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001a\u0010?\u001a\u00020@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001a\u0010E\u001a\u00020FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001a\u0010K\u001a\u00020LX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001a\u0010Q\u001a\u00020RX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u001a\u0010W\u001a\u00020XX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u001a\u0010]\u001a\u00020^X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u001a\u0010c\u001a\u00020dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u001a\u0010i\u001a\u00020jX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\u001a\u0010o\u001a\u00020pX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\u001a\u0010u\u001a\u00020vX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\u001b\u0010{\u001a\u00020|X\u0086\u000e\u00a2\u0006\u000f\n\u0000\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R \u0010\u0081\u0001\u001a\u00030\u0082\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R \u0010\u0087\u0001\u001a\u00030\u0088\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R \u0010\u008d\u0001\u001a\u00030\u008e\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001f\u0010\u0002\u001a\u00030\u0093\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001e\u0010\u0098\u0001\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u0011\n\u0000\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0005\b\u009b\u0001\u0010\u0004\u00a8\u0006\u00a0\u0001"}, d2 = {"Lcom/creativity/dev/formsimple/model/ListDynamic;", "Ljava/io/Serializable;", "type", "", "(I)V", "action", "Lkotlin/Function0;", "", "getAction", "()Lkotlin/jvm/functions/Function0;", "setAction", "(Lkotlin/jvm/functions/Function0;)V", "activity", "Ljava/lang/Class;", "getActivity", "()Ljava/lang/Class;", "setActivity", "(Ljava/lang/Class;)V", "bundleActivity", "Landroid/os/Bundle;", "getBundleActivity", "()Landroid/os/Bundle;", "setBundleActivity", "(Landroid/os/Bundle;)V", "checked", "", "getChecked", "()Z", "setChecked", "(Z)V", "darkModeOn", "getDarkModeOn", "setDarkModeOn", "isAvailable", "setAvailable", "isEndableImageSelected", "setEndableImageSelected", "isSingleList", "setSingleList", "setAlignment", "Lcom/creativity/dev/formsimple/model/Utils/Alignment;", "getSetAlignment", "()Lcom/creativity/dev/formsimple/model/Utils/Alignment;", "setSetAlignment", "(Lcom/creativity/dev/formsimple/model/Utils/Alignment;)V", "setAnimation", "Lcom/creativity/dev/formsimple/model/Utils/Animations;", "getSetAnimation", "()Lcom/creativity/dev/formsimple/model/Utils/Animations;", "setSetAnimation", "(Lcom/creativity/dev/formsimple/model/Utils/Animations;)V", "setColor", "Lcom/creativity/dev/formsimple/model/Utils/Colors;", "getSetColor", "()Lcom/creativity/dev/formsimple/model/Utils/Colors;", "setSetColor", "(Lcom/creativity/dev/formsimple/model/Utils/Colors;)V", "setContainer", "Lcom/creativity/dev/formsimple/model/Utils/Container;", "getSetContainer", "()Lcom/creativity/dev/formsimple/model/Utils/Container;", "setSetContainer", "(Lcom/creativity/dev/formsimple/model/Utils/Container;)V", "setDatePicker", "Lcom/creativity/dev/formsimple/model/Utils/DatePickerJG;", "getSetDatePicker", "()Lcom/creativity/dev/formsimple/model/Utils/DatePickerJG;", "setSetDatePicker", "(Lcom/creativity/dev/formsimple/model/Utils/DatePickerJG;)V", "setEditText", "Lcom/creativity/dev/formsimple/model/Utils/EditText;", "getSetEditText", "()Lcom/creativity/dev/formsimple/model/Utils/EditText;", "setSetEditText", "(Lcom/creativity/dev/formsimple/model/Utils/EditText;)V", "setImage", "Lcom/creativity/dev/formsimple/model/Utils/Images;", "getSetImage", "()Lcom/creativity/dev/formsimple/model/Utils/Images;", "setSetImage", "(Lcom/creativity/dev/formsimple/model/Utils/Images;)V", "setList", "Lcom/creativity/dev/formsimple/model/Utils/Lists;", "getSetList", "()Lcom/creativity/dev/formsimple/model/Utils/Lists;", "setSetList", "(Lcom/creativity/dev/formsimple/model/Utils/Lists;)V", "setMargin", "Lcom/creativity/dev/formsimple/model/Utils/Margin;", "getSetMargin", "()Lcom/creativity/dev/formsimple/model/Utils/Margin;", "setSetMargin", "(Lcom/creativity/dev/formsimple/model/Utils/Margin;)V", "setPadding", "Lcom/creativity/dev/formsimple/model/Utils/Padding;", "getSetPadding", "()Lcom/creativity/dev/formsimple/model/Utils/Padding;", "setSetPadding", "(Lcom/creativity/dev/formsimple/model/Utils/Padding;)V", "setSize", "Lcom/creativity/dev/formsimple/model/Utils/Size;", "getSetSize", "()Lcom/creativity/dev/formsimple/model/Utils/Size;", "setSetSize", "(Lcom/creativity/dev/formsimple/model/Utils/Size;)V", "setSwitch", "Lcom/creativity/dev/formsimple/model/Utils/SwitchJG;", "getSetSwitch", "()Lcom/creativity/dev/formsimple/model/Utils/SwitchJG;", "setSetSwitch", "(Lcom/creativity/dev/formsimple/model/Utils/SwitchJG;)V", "setText", "Lcom/creativity/dev/formsimple/model/Utils/Text;", "getSetText", "()Lcom/creativity/dev/formsimple/model/Utils/Text;", "setSetText", "(Lcom/creativity/dev/formsimple/model/Utils/Text;)V", "setTimePicker", "Lcom/creativity/dev/formsimple/model/Utils/TimePickerJG;", "getSetTimePicker", "()Lcom/creativity/dev/formsimple/model/Utils/TimePickerJG;", "setSetTimePicker", "(Lcom/creativity/dev/formsimple/model/Utils/TimePickerJG;)V", "setValidation", "Lcom/creativity/dev/formsimple/model/Utils/ValidatorJG;", "getSetValidation", "()Lcom/creativity/dev/formsimple/model/Utils/ValidatorJG;", "setSetValidation", "(Lcom/creativity/dev/formsimple/model/Utils/ValidatorJG;)V", "setVisibility", "Lcom/creativity/dev/formsimple/model/Utils/Visibility;", "getSetVisibility", "()Lcom/creativity/dev/formsimple/model/Utils/Visibility;", "setSetVisibility", "(Lcom/creativity/dev/formsimple/model/Utils/Visibility;)V", "setting", "Lcom/creativity/dev/formsimple/model/Utils/Setting;", "getSetting", "()Lcom/creativity/dev/formsimple/model/Utils/Setting;", "setSetting", "(Lcom/creativity/dev/formsimple/model/Utils/Setting;)V", "tag", "", "getTag", "()Ljava/lang/String;", "setTag", "(Ljava/lang/String;)V", "Lcom/creativity/dev/formsimple/model/ListDynamic$TypeRow;", "getType", "()Lcom/creativity/dev/formsimple/model/ListDynamic$TypeRow;", "setType", "(Lcom/creativity/dev/formsimple/model/ListDynamic$TypeRow;)V", "universalContentGravity", "getUniversalContentGravity", "()I", "setUniversalContentGravity", "checkList", "obj", "onClick", "TypeRow", "formsimple_debug"})
public final class ListDynamic implements java.io.Serializable {
    private boolean darkModeOn = false;
    @org.jetbrains.annotations.NotNull
    private java.lang.String tag = "";
    @org.jetbrains.annotations.NotNull
    private com.creativity.dev.formsimple.model.Utils.Text setText;
    @org.jetbrains.annotations.NotNull
    private com.creativity.dev.formsimple.model.Utils.Lists setList;
    @org.jetbrains.annotations.NotNull
    private com.creativity.dev.formsimple.model.Utils.ValidatorJG setValidation;
    @org.jetbrains.annotations.NotNull
    private com.creativity.dev.formsimple.model.Utils.EditText setEditText;
    public kotlin.jvm.functions.Function0<kotlin.Unit> action;
    private boolean checked = false;
    private boolean isAvailable = true;
    private boolean isSingleList = true;
    @org.jetbrains.annotations.NotNull
    private com.creativity.dev.formsimple.model.ListDynamic.TypeRow type = com.creativity.dev.formsimple.model.ListDynamic.TypeRow.ROW_BASIC;
    @org.jetbrains.annotations.NotNull
    private com.creativity.dev.formsimple.model.Utils.Setting setting;
    @org.jetbrains.annotations.NotNull
    private java.lang.Class<?> activity;
    @org.jetbrains.annotations.NotNull
    private android.os.Bundle bundleActivity;
    @org.jetbrains.annotations.NotNull
    private com.creativity.dev.formsimple.model.Utils.Animations setAnimation;
    @org.jetbrains.annotations.NotNull
    private com.creativity.dev.formsimple.model.Utils.Colors setColor;
    @org.jetbrains.annotations.NotNull
    private com.creativity.dev.formsimple.model.Utils.TimePickerJG setTimePicker;
    @org.jetbrains.annotations.NotNull
    private com.creativity.dev.formsimple.model.Utils.DatePickerJG setDatePicker;
    @org.jetbrains.annotations.NotNull
    private com.creativity.dev.formsimple.model.Utils.Size setSize;
    @org.jetbrains.annotations.NotNull
    private com.creativity.dev.formsimple.model.Utils.Padding setPadding;
    @org.jetbrains.annotations.NotNull
    private com.creativity.dev.formsimple.model.Utils.Margin setMargin;
    @org.jetbrains.annotations.NotNull
    private com.creativity.dev.formsimple.model.Utils.Container setContainer;
    @org.jetbrains.annotations.NotNull
    private com.creativity.dev.formsimple.model.Utils.Alignment setAlignment;
    @org.jetbrains.annotations.NotNull
    private com.creativity.dev.formsimple.model.Utils.Visibility setVisibility;
    @org.jetbrains.annotations.NotNull
    private com.creativity.dev.formsimple.model.Utils.SwitchJG setSwitch;
    private int universalContentGravity = android.view.Gravity.CENTER;
    private boolean isEndableImageSelected = true;
    @org.jetbrains.annotations.NotNull
    private com.creativity.dev.formsimple.model.Utils.Images setImage;
    
    public final boolean getDarkModeOn() {
        return false;
    }
    
    public final void setDarkModeOn(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTag() {
        return null;
    }
    
    public final void setTag(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.creativity.dev.formsimple.model.Utils.Text getSetText() {
        return null;
    }
    
    public final void setSetText(@org.jetbrains.annotations.NotNull
    com.creativity.dev.formsimple.model.Utils.Text p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.creativity.dev.formsimple.model.Utils.Lists getSetList() {
        return null;
    }
    
    public final void setSetList(@org.jetbrains.annotations.NotNull
    com.creativity.dev.formsimple.model.Utils.Lists p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.creativity.dev.formsimple.model.Utils.ValidatorJG getSetValidation() {
        return null;
    }
    
    public final void setSetValidation(@org.jetbrains.annotations.NotNull
    com.creativity.dev.formsimple.model.Utils.ValidatorJG p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.creativity.dev.formsimple.model.Utils.EditText getSetEditText() {
        return null;
    }
    
    public final void setSetEditText(@org.jetbrains.annotations.NotNull
    com.creativity.dev.formsimple.model.Utils.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getAction() {
        return null;
    }
    
    public final void setAction(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    public final boolean getChecked() {
        return false;
    }
    
    public final void setChecked(boolean p0) {
    }
    
    public final boolean isAvailable() {
        return false;
    }
    
    public final void setAvailable(boolean p0) {
    }
    
    public final boolean isSingleList() {
        return false;
    }
    
    public final void setSingleList(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.creativity.dev.formsimple.model.ListDynamic.TypeRow getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.NotNull
    com.creativity.dev.formsimple.model.ListDynamic.TypeRow p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.creativity.dev.formsimple.model.Utils.Setting getSetting() {
        return null;
    }
    
    public final void setSetting(@org.jetbrains.annotations.NotNull
    com.creativity.dev.formsimple.model.Utils.Setting p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Class<?> getActivity() {
        return null;
    }
    
    public final void setActivity(@org.jetbrains.annotations.NotNull
    java.lang.Class<?> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.os.Bundle getBundleActivity() {
        return null;
    }
    
    public final void setBundleActivity(@org.jetbrains.annotations.NotNull
    android.os.Bundle p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.creativity.dev.formsimple.model.Utils.Animations getSetAnimation() {
        return null;
    }
    
    public final void setSetAnimation(@org.jetbrains.annotations.NotNull
    com.creativity.dev.formsimple.model.Utils.Animations p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.creativity.dev.formsimple.model.Utils.Colors getSetColor() {
        return null;
    }
    
    public final void setSetColor(@org.jetbrains.annotations.NotNull
    com.creativity.dev.formsimple.model.Utils.Colors p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.creativity.dev.formsimple.model.Utils.TimePickerJG getSetTimePicker() {
        return null;
    }
    
    public final void setSetTimePicker(@org.jetbrains.annotations.NotNull
    com.creativity.dev.formsimple.model.Utils.TimePickerJG p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.creativity.dev.formsimple.model.Utils.DatePickerJG getSetDatePicker() {
        return null;
    }
    
    public final void setSetDatePicker(@org.jetbrains.annotations.NotNull
    com.creativity.dev.formsimple.model.Utils.DatePickerJG p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.creativity.dev.formsimple.model.Utils.Size getSetSize() {
        return null;
    }
    
    public final void setSetSize(@org.jetbrains.annotations.NotNull
    com.creativity.dev.formsimple.model.Utils.Size p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.creativity.dev.formsimple.model.Utils.Padding getSetPadding() {
        return null;
    }
    
    public final void setSetPadding(@org.jetbrains.annotations.NotNull
    com.creativity.dev.formsimple.model.Utils.Padding p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.creativity.dev.formsimple.model.Utils.Margin getSetMargin() {
        return null;
    }
    
    public final void setSetMargin(@org.jetbrains.annotations.NotNull
    com.creativity.dev.formsimple.model.Utils.Margin p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.creativity.dev.formsimple.model.Utils.Container getSetContainer() {
        return null;
    }
    
    public final void setSetContainer(@org.jetbrains.annotations.NotNull
    com.creativity.dev.formsimple.model.Utils.Container p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.creativity.dev.formsimple.model.Utils.Alignment getSetAlignment() {
        return null;
    }
    
    public final void setSetAlignment(@org.jetbrains.annotations.NotNull
    com.creativity.dev.formsimple.model.Utils.Alignment p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.creativity.dev.formsimple.model.Utils.Visibility getSetVisibility() {
        return null;
    }
    
    public final void setSetVisibility(@org.jetbrains.annotations.NotNull
    com.creativity.dev.formsimple.model.Utils.Visibility p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.creativity.dev.formsimple.model.Utils.SwitchJG getSetSwitch() {
        return null;
    }
    
    public final void setSetSwitch(@org.jetbrains.annotations.NotNull
    com.creativity.dev.formsimple.model.Utils.SwitchJG p0) {
    }
    
    public final int getUniversalContentGravity() {
        return 0;
    }
    
    public final void setUniversalContentGravity(int p0) {
    }
    
    public final boolean isEndableImageSelected() {
        return false;
    }
    
    public final void setEndableImageSelected(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.creativity.dev.formsimple.model.Utils.Images getSetImage() {
        return null;
    }
    
    public final void setSetImage(@org.jetbrains.annotations.NotNull
    com.creativity.dev.formsimple.model.Utils.Images p0) {
    }
    
    public ListDynamic(int type) {
        super();
    }
    
    public final void checkList(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> obj) {
    }
    
    public final void onClick(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> obj) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0018\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018\u00a8\u0006\u0019"}, d2 = {"Lcom/creativity/dev/formsimple/model/ListDynamic$TypeRow;", "", "(Ljava/lang/String;I)V", "ROW_BASIC", "ROW_TITLE", "ROW_DESCRIPTION", "ROW_ACTIVITY", "ROW_ACTION", "ROW_CHECK", "ROW_COMMENT", "ROW_DIALOG_CO", "ONLY_CHECK", "CHECK_AND_CUESTION", "ROW_EDIT", "ROW_CHECK_TITLE", "ROW_SINGLE_CHECK_LIST", "ROW_MULTIPLE_CHECK_LIST", "ROW_INFO", "ROW_CALENDAR_HOUR", "ROW_CALENDAR_DAY", "ROW_DATE_PICKER", "ROW_TIME_PICKER", "ROW_ON_CLICK", "ROW_SWITCH", "ROW_EMPTY", "formsimple_debug"})
    public static enum TypeRow {
        /*public static final*/ ROW_BASIC /* = new ROW_BASIC() */,
        /*public static final*/ ROW_TITLE /* = new ROW_TITLE() */,
        /*public static final*/ ROW_DESCRIPTION /* = new ROW_DESCRIPTION() */,
        /*public static final*/ ROW_ACTIVITY /* = new ROW_ACTIVITY() */,
        /*public static final*/ ROW_ACTION /* = new ROW_ACTION() */,
        /*public static final*/ ROW_CHECK /* = new ROW_CHECK() */,
        /*public static final*/ ROW_COMMENT /* = new ROW_COMMENT() */,
        /*public static final*/ ROW_DIALOG_CO /* = new ROW_DIALOG_CO() */,
        /*public static final*/ ONLY_CHECK /* = new ONLY_CHECK() */,
        /*public static final*/ CHECK_AND_CUESTION /* = new CHECK_AND_CUESTION() */,
        /*public static final*/ ROW_EDIT /* = new ROW_EDIT() */,
        /*public static final*/ ROW_CHECK_TITLE /* = new ROW_CHECK_TITLE() */,
        /*public static final*/ ROW_SINGLE_CHECK_LIST /* = new ROW_SINGLE_CHECK_LIST() */,
        /*public static final*/ ROW_MULTIPLE_CHECK_LIST /* = new ROW_MULTIPLE_CHECK_LIST() */,
        /*public static final*/ ROW_INFO /* = new ROW_INFO() */,
        /*public static final*/ ROW_CALENDAR_HOUR /* = new ROW_CALENDAR_HOUR() */,
        /*public static final*/ ROW_CALENDAR_DAY /* = new ROW_CALENDAR_DAY() */,
        /*public static final*/ ROW_DATE_PICKER /* = new ROW_DATE_PICKER() */,
        /*public static final*/ ROW_TIME_PICKER /* = new ROW_TIME_PICKER() */,
        /*public static final*/ ROW_ON_CLICK /* = new ROW_ON_CLICK() */,
        /*public static final*/ ROW_SWITCH /* = new ROW_SWITCH() */,
        /*public static final*/ ROW_EMPTY /* = new ROW_EMPTY() */;
        
        TypeRow() {
        }
    }
}