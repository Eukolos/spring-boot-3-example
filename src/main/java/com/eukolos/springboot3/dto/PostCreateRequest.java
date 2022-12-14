package com.eukolos.springboot3.dto;

import com.eukolos.springboot3.model.Post;

public record PostCreateRequest (
        String title,
        String body
) {
    public static Post convertToPost(PostCreateRequest request){
        return new Post(
                request.title,
                request.body
        );
    }
}
