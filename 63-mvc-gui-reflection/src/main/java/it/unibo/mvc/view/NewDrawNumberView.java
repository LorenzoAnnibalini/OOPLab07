package it.unibo.mvc.impl;

import it.unibo.mvc.api.DrawNumberController;
import it.unibo.mvc.api.DrawNumberView;
import it.unibo.mvc.api.DrawResult;

public class NewDrawNumberView implements DrawNumberView {

    private DrawNumberController controller;

    @Override
    public void setController(DrawNumberController observer) {
        this.controller=observer;
    }

    @Override
    public void start() {
     //   this.controller.
        
    }

    @Override
    public void result(DrawResult res) {
        // TODO Auto-generated method stub
        
    }
    
}
