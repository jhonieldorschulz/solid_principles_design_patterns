package edu.guia.solid.isp.adapter;

// Legado incompatível
class OldAllInOne {
    void hardcopy(String payload) { /* imprime */ }

    byte[] optical() {
        return "LEGACY".getBytes();
    }
}
