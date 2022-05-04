package com.codeusingjava.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.codeusingjava.model.ImgGallery;

@Repository
public interface ImgGalleryRepo extends JpaRepository<ImgGallery, Long>{
}

