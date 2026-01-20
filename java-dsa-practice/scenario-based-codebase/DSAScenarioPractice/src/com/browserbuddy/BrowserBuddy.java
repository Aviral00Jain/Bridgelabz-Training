package com.browserbuddy;

import java.util.Stack;

class BrowserBuddy {

    private Stack<BrowserTab> closedTabs = new Stack<>();
    private BrowserTab activeTab;

    public void openTab(String homepage) {
        activeTab = new BrowserTab(homepage);
        System.out.println("New tab opened: " + homepage);
    }

    public void closeTab() {
        if (activeTab != null) {
            closedTabs.push(activeTab);
            System.out.println("Tab closed");
            activeTab = null;
        }
    }

    public void restoreTab() {
        if (!closedTabs.isEmpty()) {
            activeTab = closedTabs.pop();
            System.out.println("Tab restored. Current page: " +
                               activeTab.getCurrentPage());
        } else {
            System.out.println("No tabs to restore!");
        }
    }

    public BrowserTab getActiveTab() {
        return activeTab;
    }
}


