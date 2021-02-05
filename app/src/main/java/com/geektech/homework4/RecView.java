package com.geektech.homework4;

import android.content.Intent;

public class RecView extends MainActivity {

    public int recyclerEdits;
    public String text;
    public int REQUEST_CODE = 800;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int title (){

        text = et1.getText().toString();
        text = et2.getText().toString();

        Intent intent = new Intent(RecView.this,MainActivity.class);
        setResult(RESULT_OK);
        finish();


        return 0;
    }

}
