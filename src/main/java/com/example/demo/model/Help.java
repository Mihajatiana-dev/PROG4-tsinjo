package com.example.demo.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Help {
  private Long id;
  private String email;
  private String fullName;
  private LocalDateTime date;
  private BigDecimal amount;
  private String paymentMethod;
  private String accidentDescription;

  public Help(
      Long id,
      String email,
      String fullName,
      LocalDateTime date,
      BigDecimal amount,
      String paymentMethod,
      String accidentDescription) {
    this.id = id;
    this.email = email;
    this.fullName = fullName;
    this.date = date;
    this.amount = amount;
    this.paymentMethod = paymentMethod;
    this.accidentDescription = accidentDescription;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public LocalDateTime getDate() {
    return date;
  }

  public void setDate(LocalDateTime date) {
    this.date = date;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public String getAccidentDescription() {
    return accidentDescription;
  }

  public void setAccidentDescription(String accidentDescription) {
    this.accidentDescription = accidentDescription;
  }
}
