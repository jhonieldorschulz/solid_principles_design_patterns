package edu.guia.solid.lsp.composite;

import java.util.ArrayList;
import java.util.List;

public class LayerGroup implements Layer {
    private final List<Layer> children = new ArrayList<>();

    public void add(Layer l) {
        if (l == null) throw new IllegalArgumentException("null");
        children.add(l);
    }

    public void render(StringBuilder out) {
        for (Layer l : children) l.render(out);
    }
}
