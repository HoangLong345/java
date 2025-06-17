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
        return "register"; // Trả về register.html
    }

    @PostMapping("/register")
    public String processRegister(@ModelAttribute("userDTO") UserDTO userDTO, Model model) {
        if (userRepository.existsByEmail(userDTO.getEmail())) {
            model.addAttribute("error", "Email đã tồn tại!");
            return "register"; // Trả lại form kèm lỗi
        }

        User user = new User();
        user.setUsername(userDTO.getUsername());
        user.setFullName(userDTO.getFullName());
        user.setEmail(userDTO.getEmail());
        user.setPhone(userDTO.getPhone());
        user.setPassword(passwordEncoder.encode(userDTO.getPassword()));
        user.setRole(Role.CUSTOMER); // Default role
        user.setAnonymous(userDTO.isAnonymous());

        userRepository.save(user);
        model.addAttribute("success", "Đăng ký thành công!");

        return "redirect:/auth/login"; // Hoặc redirect về trang login
    }

    @GetMapping("/login")
    public String showLoginPage() {
        return "login"; // Nếu có trang login.html
    }
}
