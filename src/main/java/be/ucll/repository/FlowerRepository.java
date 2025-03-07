package be.ucll.repository;

import be.ucll.model.Flower;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class FlowerRepository {
    private List<Flower> flowers = new ArrayList<>();

    public FlowerRepository() {
    }

    public List<Flower> getAll() {
        return flowers;
    }


}
