package com.repository;

import com.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.domain.User;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}
