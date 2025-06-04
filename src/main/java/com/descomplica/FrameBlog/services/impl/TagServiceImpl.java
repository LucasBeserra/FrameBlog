package com.descomplica.FrameBlog.services.impl;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.descomplica.FrameBlog.models.Tag;
import com.descomplica.FrameBlog.repositories.TagRepository;
import com.descomplica.FrameBlog.services.TagService;

@Service
public class TagServiceImpl {
    @Autowired
    private TagRepository tagRepository;

    @Override
    public Tag saveTag(Tag tag) {
        Tag existingTag = tagRepository.findByName(tag.getName());

        if(Objects.isNull(existingTag)) {
            throw new RuntimeException("Tag already exists");
        }

        Tag entity = new Tag(tag.getTagId(), tag.getName(), tag.getPostId());

        Tag newTag = tagRepository.save(entity);

        return new Tag(newTag.getTagId(), newTag.getName(), newTag.getPostId());
    }
}
