package com.creativity.dev.formsimple.utils;

import java.lang.System;

/**
 * Created by jgutierrez on 3/22/2018.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/creativity/dev/formsimple/utils/FontManager;", "", "()V", "Companion", "formsimple_debug"})
public final class FontManager {
    @org.jetbrains.annotations.NotNull
    public static final com.creativity.dev.formsimple.utils.FontManager.Companion Companion = null;
    private static final java.lang.String ruteFont = "fonts/";
    private static final java.lang.String typeFont = ".ttf";
    private static final java.lang.String fontAwesome = "fontawesome-webfont";
    private static final java.lang.String fontAwesomeRegular = "fa-regular-400";
    private static final java.lang.String fontAwesomeSolid = "fa-solid-900";
    private static final java.lang.String fontAwesomeBrands = "fa-brands-400";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String fontList = "\uf46d";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String fontDownload = "\uf381";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String fontEndDay = "\uf0c7";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String fontLogOut = "\uf2f5";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String fontInventory = "\uf466";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String fontSettings = "\uf085";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String fontSupport = "\uf0ad";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String fontChevronRight = "\uf054";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String fontChange = "\uf362";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String fontWarning = "\uf071";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String fontBack = "\uf359";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String fontInstal = "\uf0ad";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String fontListConstans = "\uf46d";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String fontChain = "\uf0c1";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String fontNotch = "\uf1ce";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String fontPlus = "\uf055";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String fontBriefCase = "\uf0b1";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String fontCamera = "\uf030";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String fontsend = "\uf1d8";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String fontExclametion = "\uf06a";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String fontCheckReady = "\uf058";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String fontMine = "\uf056";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String fontFolder = "\uf07c";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String fontDownloadRow = "\uf019";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String fontEdit = "\uf044";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String fontErase = "\uf2ed";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String fontDelete = "\uf057";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String fontLocation = "\uf3c5";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String fontIdCard = "\uf2c2";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String fontBasicCheck = "\uf00c";
    
    public FontManager() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\bD\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010G\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\nR\u0014\u0010\u0015\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\nR\u0014\u0010\u0017\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\nR\u0014\u0010\u0019\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\nR\u0014\u0010\u001b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\nR\u0014\u0010\u001d\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\nR\u0014\u0010\u001f\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\nR\u0014\u0010!\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\nR\u0014\u0010#\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\nR\u0014\u0010%\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\nR\u0014\u0010\'\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\nR\u0014\u0010)\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\nR\u0014\u0010+\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\nR\u0014\u0010-\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\nR\u0014\u0010/\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\nR\u0014\u00101\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\nR\u0014\u00103\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\nR\u0014\u00105\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010\nR\u0014\u00107\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010\nR\u0014\u00109\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010\nR\u0014\u0010;\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010\nR\u0014\u0010=\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010\nR\u0014\u0010?\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010\nR\u0014\u0010A\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010\nR\u0014\u0010C\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010\nR\u000e\u0010E\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006H"}, d2 = {"Lcom/creativity/dev/formsimple/utils/FontManager$Companion;", "", "()V", "fontAwesome", "", "fontAwesomeBrands", "fontAwesomeRegular", "fontAwesomeSolid", "fontBack", "getFontBack", "()Ljava/lang/String;", "fontBasicCheck", "getFontBasicCheck", "fontBriefCase", "getFontBriefCase", "fontCamera", "getFontCamera", "fontChain", "getFontChain", "fontChange", "getFontChange", "fontCheckReady", "getFontCheckReady", "fontChevronRight", "getFontChevronRight", "fontDelete", "getFontDelete", "fontDownload", "getFontDownload", "fontDownloadRow", "getFontDownloadRow", "fontEdit", "getFontEdit", "fontEndDay", "getFontEndDay", "fontErase", "getFontErase", "fontExclametion", "getFontExclametion", "fontFolder", "getFontFolder", "fontIdCard", "getFontIdCard", "fontInstal", "getFontInstal", "fontInventory", "getFontInventory", "fontList", "getFontList", "fontListConstans", "getFontListConstans", "fontLocation", "getFontLocation", "fontLogOut", "getFontLogOut", "fontMine", "getFontMine", "fontNotch", "getFontNotch", "fontPlus", "getFontPlus", "fontSettings", "getFontSettings", "fontSupport", "getFontSupport", "fontWarning", "getFontWarning", "fontsend", "getFontsend", "ruteFont", "typeFont", "getRuteFASolid", "formsimple_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getFontList() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getFontDownload() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getFontEndDay() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getFontLogOut() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getFontInventory() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getFontSettings() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getFontSupport() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getFontChevronRight() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getFontChange() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getFontWarning() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getFontBack() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getFontInstal() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getFontListConstans() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getFontChain() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getFontNotch() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getFontPlus() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getFontBriefCase() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getFontCamera() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getFontsend() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getFontExclametion() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getFontCheckReady() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getFontMine() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getFontFolder() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getFontDownloadRow() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getFontEdit() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getFontErase() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getFontDelete() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getFontLocation() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getFontIdCard() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getFontBasicCheck() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getRuteFASolid() {
            return null;
        }
    }
}