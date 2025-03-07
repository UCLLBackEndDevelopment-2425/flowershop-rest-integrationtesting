package be.ucll.service;

import be.ucll.model.Flower;
import be.ucll.repository.FlowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FlowerService {

    private FlowerRepository repository;

    @Autowired
    public FlowerService(FlowerRepository repository) {
        this.repository= repository;
    }

    public List<Flower> getAllFlowers() {
        return new ArrayList<>();
    }

}
