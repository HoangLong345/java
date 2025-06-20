package com.example.hivapp.controller;

import com.example.hivapp.dto.UserDTO;
import com.example.hivapp.enums.Role;
import com.example.hivapp.model.User;
import com.example.hivapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/register")
    public String showRegisterForm(Model model) {
        model.addAttribute("userDTO", new UserDTO());
        return "register";
    }

    @PostMapping("/register")
    public String processRegister(@ModelAttribute("userDTO") UserDTO userDTO, Model model) {

        if (userRepository.existsByUsername(userDTO.getUsername())) {
            model.addAttribute("error", "Username đã tồn tại!");
            return "register";
        }
        if (userRepository.existsByEmail(userDTO.getEmail())) {
            model.addAttribute("error", "Email đã tồn tại!");
            return "register";
        }
        if (userRepository.existsByPhone(userDTO.getPhone())) {
            model.addAttribute("error", "Số điện thoại đã được sử dụng!");
            return "register";
        }
        if (!userDTO.getPhone().matches("\\d{10}")) {
            model.addAttribute("error", "Số điện thoại phải đúng 10 chữ số!");
            return "register";
        }

        User user = new User();
        user.setUsername(userDTO.getUsername());
        user.setFullName(userDTO.getFullName());
        user.setEmail(userDTO.getEmail());
        user.setPhone(userDTO.getPhone());
        user.setPassword(passwordEncoder.encode(userDTO.getPassword()));
        user.setRole(Role.CUSTOMER);
        user.setAnonymous(userDTO.isAnonymous());

        userRepository.save(user);
        model.addAttribute("success", "Đăng ký thành công!");

        return "redirect:/auth/login";
    }

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }
}
