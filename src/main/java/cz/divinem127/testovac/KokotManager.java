package cz.divinem127.testovac;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class KokotManager {
    private final Map<String, Kokot> kokoti = new HashMap<>();

    public void addKokot(Kokot kokot) {
        kokoti.put(kokot.getName(), kokot);
    }

    public List<Kokot> allKokoti() {
        return List.copyOf(kokoti.values());
    }
}
