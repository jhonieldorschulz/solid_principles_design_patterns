package edu.guia.solid.isp.adapter;

public class OldAllInOneAdapter implements Printer, Scanner {
    private final OldAllInOne legacy;

    public OldAllInOneAdapter(OldAllInOne l) {
        this.legacy = l;
    }

    public void print(String d) {
        legacy.hardcopy(d);
    }

    public String scan() {
        return new String(legacy.optical());
    }
}
