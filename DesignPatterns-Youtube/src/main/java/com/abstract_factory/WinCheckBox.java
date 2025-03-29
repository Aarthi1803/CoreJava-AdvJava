package com.abstract_factory;

public class WinCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Win Checkbox");
    }
}
