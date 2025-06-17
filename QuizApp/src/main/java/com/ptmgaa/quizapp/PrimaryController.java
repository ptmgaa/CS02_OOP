package com.ptmgaa.quizapp;

import javafx.event.ActionEvent;
import my.ptmgaa.utils.MyAlert;

public class PrimaryController {
    public void handleQuestionManagement(ActionEvent event){
        MyAlert.getInstance().showMsg("Question Management: comming soon!");
    }
    
    public void handlePractice(ActionEvent event){
        MyAlert.getInstance().showMsg("Practice: comming soon!");
    }
}
