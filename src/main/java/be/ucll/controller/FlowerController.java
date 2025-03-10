package be.ucll.controller;

import be.ucll.service.FlowerService;
import be.ucll.model.Flower;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/flower")
public class FlowerController {

    private FlowerService service;

    @Autowired
    public FlowerController(FlowerService service) {
        this.service = service;
    }

    @GetMapping
    public List<Flower> getFlowers() {
        return new ArrayList<>();
    }
}
