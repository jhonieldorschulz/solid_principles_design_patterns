package edu.guia.solid.lsp.bad;

import edu.guia.solid.lsp.composite.Cities;
import edu.guia.solid.lsp.composite.Layer;
import edu.guia.solid.lsp.composite.Rivers;
import edu.guia.solid.lsp.composite.Roads;

import java.util.*;

public class BadLayerGroup implements Layer {
  private final List<Object> children = new ArrayList<>();
  public void add(Object o){ children.add(o); }
  public void render(StringBuilder out){
    for(Object o: children){
      if (o instanceof Roads r) { r.render(out); }
      else if (o instanceof Rivers r) { r.render(out); }
      else if (o instanceof Cities c) { c.render(out); }
      else if (o instanceof BadLayerGroup g) { g.render(out); }
      // else: ignora silenciosamente (quebra de contrato)
    }
  }
}