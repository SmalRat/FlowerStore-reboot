package ua.edu.ucu.apps.web.flower;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class FlowerController {
    private final FlowerService flowerService;

    @Autowired
    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    @GetMapping(path = "/flower")
    public Flower getFlower(){
        return flowerService.getFlowerExample();
    }

    @GetMapping("/flowers")
    public List<Flower> getFlowers(){
        return flowerService.getFlowers();
    }

    @PostMapping("/flowers")
    public void addFlower(@RequestBody Flower flower){
        flowerService.addFlower(flower);
    }
}
