package com.descomplica.FrameBlog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.descomplica.FrameBlog.models.Tag;
import com.descomplica.FrameBlog.services.TagService;

@RestController
@RequestMapping("/tags")
public class TagController {
    @Autowired
    private TagService tagService;

    @PostMapping("/save")
    public @ResponseBody Tag saveTag(@RequestBody Tag tag) {
        return tagService.saveTag(tag);
    }

    @GetMapping(path = "/getAll")
    public @ResponseBody List<Tag> getAllTags() {
        return tagService.getAllTags();
    }

    @GetMapping(path = "/getById/{id}")
    public @ResponseBody Tag getTagById(@RequestBody Long id) {
        return tagService.getTagById(id);
    }

    @PostMapping(path = "/update")
    public @ResponseBody Tag update(@RequestParam final Long id, @RequestBody final Tag tag) {
        return tagService.updateTag(id, tag);
    }

    @DeleteMapping(path = "/delete/{id}")
    public ResponseEntity<?> delete(@RequestParam final Long id) {
        tagService.deleteTag(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping(path = "/")
    public @ResponseBody String authentication() {
        return "Autenticação efetuada com sucesso";
    }
}
