package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Post;
import com.example.demo.repository.PostRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;


	@RestController
	public class PostController{
		
		@Autowired
		PostRepository postrepo;
		
		@RequestMapping("/posts")
		public List<Post> getPosts(){
			List<Post> posts = (List<Post>) postrepo.findAll();
		
			return posts;
		}
	}
