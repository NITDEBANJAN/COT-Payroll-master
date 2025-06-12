package org.cot.backend.cotbackend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/users")
    public List<Map<String, String>> getUsers() {
        // Dummy data
        List<Map<String, String>> users = new ArrayList<>();
        Map<String, String> user = new HashMap<>();
        user.put("id", "1");
        user.put("name", "John Doe");
        user.put("email", "john@example.com");
        user.put("role", "Admin");
        user.put("status", "Active");
        users.add(user);
        return users;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(HttpServletRequest request){
        request.getSession();
        Map<String, String> msg = new HashMap<>();
        msg.put("message", "Logged in successfully");
        return ResponseEntity.ok(msg);
    }

    @PostMapping("/api/uploadExcel")
    public ResponseEntity<String> handleExcelUpload(@RequestParam("file") MultipartFile file) {
        // handle file processing...
        return ResponseEntity.ok("Success");
    }


}
