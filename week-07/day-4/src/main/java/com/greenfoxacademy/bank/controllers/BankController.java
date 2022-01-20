package com.greenfoxacademy.bank.controllers;

import com.greenfoxacademy.bank.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/bank")
public class BankController {

    private List<BankAccount> getBankAccounts() {
        List<BankAccount> bankAccountList = new ArrayList<>();
        bankAccountList.add(new BankAccount("Simba", 2000, "lion"));

        return bankAccountList;
    }

    @GetMapping("/show")
    public String show(Model model){
        model.addAttribute("account", getBankAccounts());

        return "index";
    }

    @GetMapping("/string")
    public String showString(){
        return "string";
    }
}
