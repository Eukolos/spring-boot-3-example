package com.eukolos.springboot3.controller;

import com.eukolos.springboot3.dto.PostCreateRequest;
import com.eukolos.springboot3.dto.PostDto;
import com.eukolos.springboot3.service.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/post")
public class PostController {
    private final PostService service;

    public PostController(PostService service) {
        this.service = service;
    }

    @PostMapping
    public PostDto createPost(@RequestBody PostCreateRequest request){
        return service.createPost(request);
    }
    @GetMapping
    public List<PostDto> getAllPost(){
        return service.getAllPost();
    }
    @GetMapping("/{id}")
    public PostDto getPostById(@PathVariable String id){
        return service.getPostById(id);
    }
}
