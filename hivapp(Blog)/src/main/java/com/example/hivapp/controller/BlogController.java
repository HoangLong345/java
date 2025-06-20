package com.example.hivapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/blog")
public class BlogController {

    @GetMapping
    public String showBlogList() {
        return "blog"; // Danh sách bài viết
    }

    @GetMapping("/{id}")
    public String showBlogDetail(@PathVariable("id") Long id, Model model) {

        if (id == 1) {
            model.addAttribute("title", "Tầm quan trọng của việc điều trị ARV đúng cách");
            model.addAttribute("content", "Việc uống ARV đúng giờ giúp duy trì tải lượng virus ở mức thấp...");
        } else if (id == 2) {
            model.addAttribute("title", "Hiểu về tải lượng virus (Viral Load)");
            model.addAttribute("content", "Tải lượng virus là thước đo mức độ HIV trong máu...");
        } else if (id == 3) {
            model.addAttribute("title", "Phòng tránh lây nhiễm HIV cho người thân");
            model.addAttribute("content", "Để bảo vệ người thân, bạn cần nắm các biện pháp phòng tránh đúng cách...");
        } else {
            model.addAttribute("title", "Không tìm thấy bài viết");
            model.addAttribute("content", "Bài viết bạn yêu cầu không tồn tại.");
        }

        return "blog-detail";
    }
}


