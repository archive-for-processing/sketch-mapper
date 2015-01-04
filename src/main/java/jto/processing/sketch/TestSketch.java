package jto.processing.sketch;


import processing.core.PGraphics;

public class TestSketch extends AbstractSketch {

    public TestSketch(final PGraphics graphics) {
        super(graphics);
    }

    @Override
    public void destroy() {

    }

    @Override
    public void draw() {
        graphics.beginDraw();
        graphics.background(255);
        graphics.fill(0);
        graphics.ellipse(graphics.width / 2, graphics.height / 2, random(10, 100) , random(10, 100));
        graphics.endDraw();
    }

    @Override
    public String getName() {
        return "TestSketch";
    }

    @Override
    public void setup() {

    }

    @Override
    public void update() {

    }
}
