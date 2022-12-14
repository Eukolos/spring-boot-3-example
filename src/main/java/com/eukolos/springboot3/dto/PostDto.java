package com.eukolos.springboot3.dto;

import com.eukolos.springboot3.model.Post;

import java.time.LocalDateTime;
import java.util.List;

public record PostDto (
        String id,
        String title,
        String body,
        String createDate,
        String updateDate
) {
    public static PostDto convertToPostDto(Post post){
        return new PostDto(
                post.getId(),
                post.getTitle(),
                post.getBody(),
                String.valueOf(post.getCreateDate()),
                String.valueOf(post.getUpdateDate())
        );
    }

    public static List<PostDto> convertAllToBookDto(List<Post> books){
        return books.stream().map(PostDto::convertToPostDto).toList();
    }
}
