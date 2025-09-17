package edu.guia.solid.lsp.composite;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CompositeLayersTest {
  @Test
  void groupAndLeafAreInterchangeable() {
    StringBuilder sb = new StringBuilder();
    Layer leaf = new Roads();
    LayerGroup g = new LayerGroup();
    g.add(new Rivers());
    g.add(new Cities());
    leaf.render(sb);
    g.render(sb);
    assertEquals("roads;rivers;cities;", sb.toString());
  }
  @Test
  void nestedGroupsRenderAllChildren() {
    StringBuilder sb = new StringBuilder();
    LayerGroup root = new LayerGroup();
    root.add(new Roads());
    LayerGroup sub = new LayerGroup();
    sub.add(new Rivers());
    sub.add(new Cities());
    root.add(sub);
    root.render(sb);
    assertEquals("roads;rivers;cities;", sb.toString());
  }
}