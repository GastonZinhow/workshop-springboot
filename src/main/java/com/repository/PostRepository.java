package com.repository;

import com.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.domain.User;

import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{
    List<Post> findByTitleContainingIgnoreCase(String text);

}
