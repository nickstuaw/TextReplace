package com.nsgwick.textreplace;

import java.util.Locale;
import java.util.Random;
import java.util.UnknownFormatConversionException;

public class RandomPotentialBool {

    private boolean random = false, value = true;

    public RandomPotentialBool(boolean bool) {
        value = bool;
    }

    public RandomPotentialBool(String val) {
        val = val.toLowerCase(Locale.ROOT);
        if(val.startsWith("rand"))
            random = true;
        else if(val.startsWith("off") || val.startsWith("false") ||  val.startsWith("n"))
            value = false;
        else if(!val.startsWith("on") && !val.startsWith("true") && !val.startsWith("y"))
            throw new UnknownFormatConversionException("Tried to convert " + val + " to boolean. Enter valid value.");
    }

    public boolean get() {
        if(!random) return value;
        Random random = new Random();
        return random.nextBoolean();
    }

}
