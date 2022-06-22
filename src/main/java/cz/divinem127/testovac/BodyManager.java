package cz.divinem127.testovac;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BodyManager {
    private final Logger log = LoggerFactory.getLogger(BodyManager.class);

    public KokotManager getKokotManager() {
        return kokotManager;
    }

    public LegManager getLegManager() {
        return legManager;
    }

    private KokotManager kokotManager;
    private LegManager legManager;

    @Autowired
    public BodyManager(KokotManager kokotManager, LegManager legManager) {
        this.kokotManager = kokotManager;
        this.legManager = legManager;

        log.info("Su tady ty kokod!");

        kokotManager.addKokot(new Kokot("pepicek", 15));
    }
}
