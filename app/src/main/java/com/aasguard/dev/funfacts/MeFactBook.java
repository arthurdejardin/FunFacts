package com.aasguard.dev.funfacts;

import java.util.Random;

/**
 * Created by Arthur on 06/05/2015.
 */
public class MeFactBook {
    public String[] mMeFacts = {
            "The creator of this app is awesome",
            "Hum, didn't feel like showing a fact this time.",
            "The creator of this app is french. Omelette du fromage.",
    };

    public String getMeFact() {

        String meFact = "";

        //randmly select fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mMeFacts.length);
        meFact = mMeFacts[randomNumber];
        return meFact;
    };
}
