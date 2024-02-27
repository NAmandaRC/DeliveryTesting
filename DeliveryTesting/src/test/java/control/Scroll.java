package control;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import session.Session;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Scroll {

    public Scroll(By locator) {
        super();
    }

    public void swipe() {
        Dimension size = Session.getSessionInstance().getDevice().manage().window().getSize();

        int startX = size.width / 2;
        int startY = (int) (size.height * 0.8);
        int endY = (int) (size.height * 0.2);

        performSwipe(startX, startY, startX, endY);
    }
    public void Longswipe() {
        Dimension size = Session.getSessionInstance().getDevice().manage().window().getSize();

        int startX = size.width/2;
        int startY = (int) (size.height * 0.9);
        int endY = (int) (size.height * 0.1);

        performSwipe(startX, startY, startX, endY);
    }
    private void performSwipe(int startX, int startY, int endX, int endY) {
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Point startPoint = new Point(startX, startY);
        Point endPoint = new Point(endX, endY);

        List<Sequence> sequences = new ArrayList<>();
        sequences.add(new Sequence(finger, 0)
                .addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), startPoint.x, startPoint.y))
                .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(finger.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), endPoint.x, endPoint.y))
                .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg())));

        Session.getSessionInstance().getDevice().perform(sequences);
    }

    public void clickCenter() {
        Dimension size = Session.getSessionInstance().getDevice().manage().window().getSize();
        int centerX = size.width / 2;
        int centerY = size.height / 2;

        performTap(centerX, centerY);
    }

    public void clickInit() {
        int centerX = 973;
        int centerY = 1305;
        performTap(centerX, centerY);
    }

    public void performTap(int x, int y) {
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Point tapPoint = new Point(x, y);

        List<Sequence> sequences = new ArrayList<>();
        sequences.add(new Sequence(finger, 0)
                .addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), tapPoint.x, tapPoint.y))
                .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg())));

        Session.getSessionInstance().getDevice().perform(sequences);
    }
}
