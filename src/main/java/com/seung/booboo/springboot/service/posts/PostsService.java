package com.seung.booboo.springboot.service.posts;import com.seung.booboo.springboot.domain.posts.PostsRepository;import com.seung.booboo.springboot.web.dto.PostsSaveRequestDto;import lombok.RequiredArgsConstructor;import org.springframework.stereotype.Service;import org.springframework.transaction.annotation.Transactional;@RequiredArgsConstructor@Servicepublic class PostsService {    private final PostsRepository repository;    @Transactional    public Long save(PostsSaveRequestDto requestDto) {        return repository.save(requestDto.toEntity()).getId();    }}