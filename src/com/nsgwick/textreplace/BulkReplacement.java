package com.nsgwick.textreplace;

import java.util.HashMap;

public class BulkReplacement {

    private HashMap<ReplacementPlaceholder,String> replacements = new HashMap<>();

    public BulkReplacement() {}

    public BulkReplacement(HashMap<ReplacementPlaceholder,String> repl) {
        replacements = repl;
    }

    public void setReplacements(HashMap<ReplacementPlaceholder, String> replacements) {
        this.replacements = replacements;
    }

    public void addReplacement(ReplacementPlaceholder placeholder, String string) {
        this.replacements.put(placeholder, string);
    }

    public void delReplacement(ReplacementPlaceholder placeholder) {
        this.replacements.remove(placeholder);
    }

    public String calculate(String in) {
        for(ReplacementPlaceholder pl : replacements.keySet()) {
            if(pl.validate(in)) {
                if(pl.isReplaceAll()) {
                    return replacements.get(pl);
                }
                return in.replace(pl.getString(), replacements.get(pl));
            }
        }
        return in;
    }

    public HashMap<ReplacementPlaceholder, String> getReplacements() {
        return replacements;
    }



}
