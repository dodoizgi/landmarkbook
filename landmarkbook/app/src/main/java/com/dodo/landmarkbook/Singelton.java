package com.dodo.landmarkbook;

import android.graphics.Bitmap;

public class Singelton {

    private Bitmap choosenImage;
    private static Singelton singelton;

    private Singelton(){


    }
    public Bitmap getChoosenImage() {
        return choosenImage;
    }

    public void setChoosenImage(Bitmap choosenImage) {
        this.choosenImage = choosenImage;
    }

    public static Singelton getInstance() {

        if(singelton ==null){
            singelton = new Singelton();
        }

        return singelton;
    }


}
