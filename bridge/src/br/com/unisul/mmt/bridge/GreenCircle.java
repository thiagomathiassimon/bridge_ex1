package br.com.unisul.mmt.bridge;

public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: ".concat(String.valueOf(radius))
                .concat(", x: ").concat(String.valueOf(x))
                .concat(",  ").concat(String.valueOf(y))
                .concat("]"));
    }
}
