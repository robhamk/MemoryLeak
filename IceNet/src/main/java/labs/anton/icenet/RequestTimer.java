package labs.anton.icenet;

import android.os.Handler;
import android.util.Log;

/**
 * Created by anton on 12/17/14.
 */
public class RequestTimer {
    private static final String TAG = RequestTimer.class.getSimpleName();
    private final RequestCallback callback;
    private final Handler timerHandler = new Handler();
    private final Runnable timerRunnable = new Runnable() {

        @Override
        public void run() {
            long millis = System.currentTimeMillis() - startTime;
            int seconds = (int) (millis / 1000);
            seconds = seconds % 60;
            if (seconds >= 15) {
                stop();
                notifyRequestTimeout();
                return;
            }

            timerHandler.postDelayed(this, 500);
        }
    };

    private long startTime = 0;

    public RequestTimer(RequestCallback callback) {
        this.callback = callback;
    }

    public void run() {
        startTime = System.currentTimeMillis();
        timerHandler.postDelayed(timerRunnable, 0);
    }

    public void stop() {
        timerHandler.removeCallbacks(timerRunnable);
    }

    public void notifyRequestTimeout() {
        callback.onRequestTimeout();
    }
}
