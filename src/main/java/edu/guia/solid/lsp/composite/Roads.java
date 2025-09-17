package edu.guia.solid.lsp.composite;

public class Roads implements Layer {
    @Override
    public void render(StringBuilder out) {
        out.append("rivers;");
    }
}
