package com.greenfox.tomdreidel.bankofsimba.controller;

import com.greenfox.tomdreidel.bankofsimba.model.Bank;
import com.greenfox.tomdreidel.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {
  public static Bank bank = new Bank();

  @RequestMapping("/first")
  public String first(Model model) {
    model.addAttribute("account", new BankAccount("Simba", 2000, "lion", true, true));
    return "first";
  }

  @RequestMapping("/htmlception")
  public String htmlception(Model model) {
    model.addAttribute("text", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "htmlception";
  }

  @GetMapping("/richbeasts")
  public String richbeasts(Model model) {
    model.addAttribute("bank", bank);
    model.addAttribute("addaccount", new BankAccount());
    return "richbeasts";
  }

  @PostMapping("/richbeasts")
  public String richbeastsIncrease(@RequestParam(value = "name") int id) {
    bank.increaseBalance(id);
    return "redirect:/richbeasts";
  }

  @PostMapping("/addaccount")
  public String addAccount(@ModelAttribute BankAccount account) {
    bank.addAcount(account);
    return "redirect:/richbeasts";
  }
}