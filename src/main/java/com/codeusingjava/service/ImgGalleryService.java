package com.codeusingjava.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.codeusingjava.model.ImgGallery;
import com.codeusingjava.repo.ImgGalleryRepo;

@Service
public class ImgGalleryService {
	@Autowired
	private ImgGalleryRepo imageGalleryRepository;

	//save method
	public void saveImage(ImgGallery imgGallery) {
		imageGalleryRepository.save(imgGallery);	
	}

	public List<ImgGallery> getAllActiveImages() {
		return imageGalleryRepository.findAll();
	}

	public Optional<ImgGallery> getImageById(Long id) {
		return imageGalleryRepository.findById(id);
	}
}

