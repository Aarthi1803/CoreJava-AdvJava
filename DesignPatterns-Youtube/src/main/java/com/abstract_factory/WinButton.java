package com.abstract_factory;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Win Button");
    }
}
