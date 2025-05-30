package com.descomplica.FrameBlog.services;

import java.util.List;

import com.descomplica.FrameBlog.models.Tag;


public interface TagService {

    Tag saveTag(Tag tag);

    List<Tag> getAllTags();

    Tag getTagById(Long id);

    Tag updateTag(Long id, Tag tag);

    void deleteTag(Long id);


}
