package com.greenfoxacademy.bank.controllers;

import com.greenfoxacademy.bank.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Controller
@RequestMapping("/bank")
public class BankController {

    private List<BankAccount> getBankAccounts() {
        List<BankAccount> bankAccountList = new ArrayList<>();
        bankAccountList.add(new BankAccount("Simba", 2000, "lion", true));
        bankAccountList.add(new BankAccount("Nala", 1500, "lion", true));
        bankAccountList.add(new BankAccount("Scar", 200, "lion", false));
        bankAccountList.add(new BankAccount("Mufasa", 400, "lion", false));
        bankAccountList.add(new BankAccount("Rafiki", 3100, "mandrill", true));

        setNewKing(bankAccountList);

        return bankAccountList;
    }

    @GetMapping("/show")
    public String show(Model model){
        model.addAttribute("accounts", getBankAccounts());
        return "index";
    }

    @GetMapping("/string")
    public String showString(){
        return "string";
    }

    @PostMapping("/show")
    public String put(Model model) {
        model.addAttribute("accounts", getBankAccounts());
        return "index";
    }


    public void setNewKing(List<BankAccount> accountList) {
        BankAccount max = accountList.stream()
                .max(Comparator.comparingDouble(BankAccount::getBalance)).get();
        max.setKing(true);
    }

}
