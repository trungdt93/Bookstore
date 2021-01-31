package com.example.BookStore.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {
	@GetMapping("/index")
	public String BookList (Model model) {
		model.addAttribute(model);
		return "booklist";
	}
}
