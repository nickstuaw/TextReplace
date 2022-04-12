package com.nsgwick.textreplace;

public class ReplacementPlaceholder {
    private String string;
    private RandomPotentialBool matchCase, replaceAll;

    public ReplacementPlaceholder(String s, RandomPotentialBool mCase) {
        string = s;
        matchCase = mCase;
    }

    public boolean validate(String in) {
        return matchCase.get() ? string.equals(in) : string.equalsIgnoreCase(in);
    }

    public boolean isMatchCase() {
        return matchCase.get();
    }

    public boolean isReplaceAll() {
        return replaceAll.get();
    }

    public String getString() {
        return string;
    }

    public void setMatchCase(RandomPotentialBool matchCase) {
        this.matchCase = matchCase;
    }

    public void setReplaceAll(RandomPotentialBool replaceAll) {
        this.replaceAll = replaceAll;
    }

    public void setString(String string) {
        this.string = string;
    }
}
