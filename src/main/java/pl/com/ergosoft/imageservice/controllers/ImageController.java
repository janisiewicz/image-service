package pl.com.ergosoft.imageservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.com.ergosoft.imageservice.model.Image;
import pl.com.ergosoft.imageservice.repository.ImageRepository;

import java.util.List;

@RestController
@RequestMapping("/")
public class ImageController {

    @Autowired
    private Environment env;

    @Autowired
    private ImageRepository repository;

    @RequestMapping(value = {"/", "images"})
    public List<Image> getImages() {
        return repository.findAll();
    }
}
