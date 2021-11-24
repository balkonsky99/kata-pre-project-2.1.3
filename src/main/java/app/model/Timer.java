package app.model;

import org.springframework.stereotype.Component;

@Component
public class Timer {
    private Timer timer;

    private Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }

}

