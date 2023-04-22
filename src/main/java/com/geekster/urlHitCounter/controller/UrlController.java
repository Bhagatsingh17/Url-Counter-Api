package com.geekster.urlHitCounter.controller;

import com.geekster.urlHitCounter.model.UrlData;
import com.geekster.urlHitCounter.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/visitor-count-app")
public class UrlController {
    @Autowired
    private UrlService urlService;

    @GetMapping("username/{username}/count")
    public UrlData getHitCount(@PathVariable String username){
        return urlService.getHit(username);
    }
}
