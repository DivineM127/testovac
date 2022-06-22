package cz.divinem127.testovac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestManager {
    private final BodyManager bodyManager;

    @Autowired
    public RestManager(BodyManager bodyManager) {
        this.bodyManager = bodyManager;
    }

    @GetMapping("/kokot")
    public Kokot getKokot(@RequestParam("name") String name) {
        return bodyManager.getKokotManager().allKokoti()
                .stream()
                .filter(next -> next.getName().equals(name))
                .findFirst()
                .orElseThrow();
    }
}
