package cz.divinem127.testovac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LegManager {
    private ToeManager toeManager;

    @Autowired
    public LegManager(ToeManager toeManager) {
        this.toeManager = toeManager;
    }
}
