package edu.guia.solid.lsp.composite;

import static org.junit.jupiter.api.Assertions.*;

import edu.guia.solid.lsp.bad.BadLayerGroup;
import org.junit.jupiter.api.Test;

public class LspComparisonTest {
  @Test
  void outputsMatchButBadBreaksContract(){
    StringBuilder good = new StringBuilder();
    LayerGroup g = new LayerGroup();
    g.add(new Roads());
    g.add(new Rivers());
    g.add(new Cities());
    g.render(good);

    StringBuilder bad = new StringBuilder();
    BadLayerGroup bg = new BadLayerGroup();
    bg.add(new Roads());
    bg.add(new Rivers());
    bg.add(new Cities());
    bg.render(bad);

    assertEquals(good.toString(), bad.toString());
  }

  @Test
  void badAllowsInvalidObjectsSilently(){
    StringBuilder bad = new StringBuilder();
    BadLayerGroup bg = new BadLayerGroup();
    bg.add("oops"); // objeto inválido aceito
    bg.render(bad); // não quebra, mas também não faz nada => violação de LSP/contrato
    assertEquals("", bad.toString());
  }
}