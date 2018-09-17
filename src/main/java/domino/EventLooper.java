package domino;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;
import org.jnativehook.mouse.NativeMouseEvent;
import org.jnativehook.mouse.NativeMouseListener;
import org.jnativehook.mouse.NativeMouseMotionListener;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EventLooper implements NativeKeyListener, NativeMouseListener, NativeMouseMotionListener {

    Logger eventLogger;
    public ArrayList<NativeMouseEvent> events;

    public EventLooper() {
        Logger globalLogger = Logger.getLogger(GlobalScreen.class.getPackage().getName());
        globalLogger.setLevel(Level.OFF);

        eventLogger = Logger.getLogger(EventLooper.class.getPackage().getName());
    }

    public static void main() throws NativeHookException {
        GlobalScreen.registerNativeHook();
        GlobalScreen.addNativeKeyListener(new EventLooper());
    }

    @Override
    public void nativeKeyPressed(NativeKeyEvent nativeKeyEvent) {}
    @Override
    public void nativeMouseClicked(NativeMouseEvent nativeMouseEvent) {}
    @Override
    public void nativeKeyReleased(NativeKeyEvent nativeKeyEvent) {}
    @Override
    public void nativeKeyTyped(NativeKeyEvent nativeKeyEvent) {}
    @Override
    public void nativeMousePressed(NativeMouseEvent nativeMouseEvent) {}
    @Override
    public void nativeMouseReleased(NativeMouseEvent nativeMouseEvent) {}
    @Override
    public void nativeMouseMoved(NativeMouseEvent nativeMouseEvent) {
        events.add(nativeMouseEvent);
        String x = Integer.toString(nativeMouseEvent.getX());
        String y = Integer.toString(nativeMouseEvent.getX());
        eventLogger.info(x+","+y);
    }
    @Override
    public void nativeMouseDragged(NativeMouseEvent nativeMouseEvent) {}
}