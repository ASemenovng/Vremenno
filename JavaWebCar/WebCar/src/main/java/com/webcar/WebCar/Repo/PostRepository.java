package com.webcar.WebCar.Repo;

import com.webcar.WebCar.Models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
