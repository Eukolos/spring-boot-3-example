package com.eukolos.springboot3.service;

import com.eukolos.springboot3.dto.PostCreateRequest;
import com.eukolos.springboot3.dto.PostDto;
import com.eukolos.springboot3.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    private final PostRepository repository;

    public PostService(PostRepository repository) {
        this.repository = repository;
    }

    public PostDto createPost(PostCreateRequest request){
        return PostDto.convertToPostDto(repository.save(PostCreateRequest.convertToPost(request)));
    }
    public List<PostDto> getAllPost() {
        return PostDto.convertAllToBookDto(repository.findAll());
    }
    public PostDto getPostById(String id){
        return PostDto.convertToPostDto(repository.getById(id));
    }
}
