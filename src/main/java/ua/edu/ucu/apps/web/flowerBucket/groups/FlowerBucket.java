package ua.edu.ucu.apps.web.flowerBucket.groups;

import ua.edu.ucu.apps.web.flower.Flower;
import ua.edu.ucu.apps.web.flowerBucket.specs.FlowerBucketSpecs;
import ua.edu.ucu.apps.web.items.Item;

import java.util.ArrayList;
import java.util.List;

public final class FlowerBucket extends Item {
    /**
     * Specifications of this bucket.
     * Linter... just be quiet..
     *
     */
    private final FlowerBucketSpecs specs = new FlowerBucketSpecs();

    /**
     * List of the packs inside bucket.
     */
    private final List<FlowerPack> flowerPacks = new ArrayList<>();


    /**
     * Adds a pack of flowers to this bucket.
     * @param flowerPack flowerPacks to add.
     */
    public void addFlowers(final FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
        specs.add(flowerPack);
    }


    /**
     * Returns the copy of flower packs inside this bucket.
     * @return returns an array
     */
    public ArrayList<FlowerPack> getFlowerPacks() {
        return new ArrayList<FlowerPack>(flowerPacks);
    }


    /**
     * Returns true/false - whether this bucket matches pattern.
     * @param otherSpecs other specification.
     * @return returns boolean.
     */
    public boolean matches(final FlowerBucketSpecs otherSpecs) {
        return (this.specs.equal(otherSpecs));
    }

    public boolean searchFlower(Flower flowerType){
        return specs.searchFlower(flowerType);
    }


    /**
     * Returns the price of the bucket.
     * @return just something.
     */
    public double getPrice() {
        return specs.getPrice();
    }

    public double price(){
        return getPrice();
    }

    public String toString(){
        StringBuilder toStr = new StringBuilder("FlowerBucket{");
        for (FlowerPack flowerPack: flowerPacks){
            toStr.append(flowerPack.toString()).append(", ");
        }
        return toStr + "}";
    }

}
