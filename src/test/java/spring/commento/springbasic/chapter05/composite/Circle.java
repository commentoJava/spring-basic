package spring.commento.springbasic.chapter05.composite;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ToString
public class Circle implements Shape{
    private final Point point;
    private String color;
    public Circle() {
        this.point = new Point();
        this.color = getDefaultColor();
    }
    @Override
    public void draw(String color) {
        this.color = color;
    }
    @Override
    public void move(int x, int y) {
        point.move(x,y);
    }
    @Override
    public void print() {
        log.info("\n circle info = {}",this);
    }
}
