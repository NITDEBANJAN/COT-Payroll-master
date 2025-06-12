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
        user.put("EmployeeName", "John Doe");
        user.put("CompanyName", "COT");
        user.put("Department", "IT");
        user.put("Designation", "Admin");
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

    @PostMapping("/uploadExcel")
    public ResponseEntity<String> handleExcelUpload(@RequestParam("file") MultipartFile file) {
        // handle file processing...
        return ResponseEntity.ok("Success");
    }

    @GetMapping("/user-profile")
    public ResponseEntity<?> getUserProfile(@RequestParam String userId){
        Map<String, String> user = new HashMap<>();
        user.put("id", "1");
        user.put("EmployeeName", "John Doe");
        user.put("CompanyName", "COT");
        user.put("Department", "IT");
        user.put("Designation", "Admin");
        user.put("UanNo", "102345678901");
        user.put("PFNo", "DL/12345/6789012");
        user.put("ESINo", "4315027890");
        user.put("TotalDays", "30");
        user.put("PayableDays", "21");
        user.put("WOff", "8");
        user.put("GrossSalary", "62,000");
        user.put("BasicSalary", "31,0000");
        user.put("BankName", "State Bank Of India");
        user.put("BankAccountNo", "23345567788644");
        user.put("IFSCCode ", "SBIN12344");
        return ResponseEntity.ok(user);
    }

}
