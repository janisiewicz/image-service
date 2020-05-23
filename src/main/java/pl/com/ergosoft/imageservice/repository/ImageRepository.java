package pl.com.ergosoft.imageservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.com.ergosoft.imageservice.model.Image;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long> {
}
