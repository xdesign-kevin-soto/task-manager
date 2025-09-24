package com.createfuture.training.taskmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/add-funds")
public class AddFundsController {

    @GetMapping
    public String addFundsCore(Model model) {
        model.addAttribute("pageTitle", "Add Funds");
        model.addAttribute("pageType", "core");
        return "add-funds";
    }

    @GetMapping("/ftd")
    public String addFundsFtd(Model model) {
        model.addAttribute("pageTitle", "Add Funds - FTD");
        model.addAttribute("pageType", "ftd");
        return "add-funds";
    }

    @GetMapping("/saved-methods")
    public String savedMethods(Model model) {
        model.addAttribute("pageTitle", "Saved Payment Methods");
        model.addAttribute("pageType", "saved");
        return "saved-methods";
    }

    @GetMapping("/online-banking")
    public String onlineBanking(Model model) {
        model.addAttribute("pageTitle", "Online Banking Deposit");
        return "online-banking-deposit";
    }
}