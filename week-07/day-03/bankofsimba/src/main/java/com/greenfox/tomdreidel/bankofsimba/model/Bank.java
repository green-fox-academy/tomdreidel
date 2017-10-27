package com.greenfox.tomdreidel.bankofsimba.model;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

public class Bank extends ArrayList<BankAccount> {
  private AtomicLong id;

  public Bank() {
    this.id = new AtomicLong();

    addAcount(new BankAccount("Scar", 1000, "lion", false, false));
    addAcount(new BankAccount("Timon", 10, "meerkat", false, true));
    addAcount(new BankAccount("Pumbaa", 100, "warthog", false, true));
    addAcount(new BankAccount("Simba", 2000, "lion", true, true));
    addAcount(new BankAccount("Sarabi", 10000, "lion", false, true));
    addAcount(new BankAccount("Mufasa", 1, "lion", false, true));
  }

  public void increaseBalance(int accIndex) {
    if (this.get(accIndex).getIsKing()) {
      this.get(accIndex).setBalance((double) 100);
    }
    else {
      this.get(accIndex).setBalance((double) 10);
    }
  }

  public void addAcount(BankAccount account) {
    account.setId(id.getAndIncrement());
    this.add(account);
  }

}
