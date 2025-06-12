package org.cot.backend.cotbackend.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@org.springframework.stereotype.Controller
@RequestMapping("/api")
public class PageController {
    @GetMapping("/portal")
    public String  showLoginPage(Model model) {
        System.out.println("/api/portal =>Page ");
        return "login";
    }
    @GetMapping("/userDashboard")
    public String  showUserPage(Model model) {
        System.out.println("/api/userDashboard =>Page");
        return "user";
    }
    @GetMapping("/adminDashboard")
    public String  showAdminPage(Model model) {
        System.out.println("/api/adminDashboard =>Page");
        return "admin";
    }
}
