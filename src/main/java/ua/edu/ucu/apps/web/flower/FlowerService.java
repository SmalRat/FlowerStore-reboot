package ua.edu.ucu.apps.web.flower;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlowerService {
    @Autowired
    private FlowerRepository flowerRepository;

    public FlowerService(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    public Flower getFlowerExample(){
        return new Flower(1, 50, "blue", 100);
    }

    public List<Flower> getFlowers(){
        return flowerRepository.findAll();
        // return List.of(new Flower(1, "blue", 50, 100), new Flower(2, "orange", 40, 80), new Flower(3, "red", 60, 120));
    }

    public void addFlower(Flower flower) {
        flowerRepository.save(flower);
    }
}
