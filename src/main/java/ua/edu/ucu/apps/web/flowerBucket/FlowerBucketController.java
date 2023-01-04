package ua.edu.ucu.apps.web.flowerBucket;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ucu.apps.web.flowerBucket.groups.FlowerBucket;

@RestController
@RequestMapping(path = "/test-bucket")
public class FlowerBucketController {
    @GetMapping(path = "/flower-bucket")
    public String testBucket(){
        return (new FlowerBucket()).toString();
    }
}
