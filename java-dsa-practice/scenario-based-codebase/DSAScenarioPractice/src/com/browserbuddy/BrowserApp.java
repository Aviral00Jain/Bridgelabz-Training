package com.browserbuddy;

public class BrowserApp {
    public static void main(String[] args) {

        BrowserBuddy browser = new BrowserBuddy();

        browser.openTab("google.com");
        BrowserTab tab = browser.getActiveTab();

        tab.visit("github.com");
        tab.visit("stackoverflow.com");

        tab.back();
        tab.back();
        tab.forward();

        browser.closeTab();
        browser.restoreTab();
    }
}