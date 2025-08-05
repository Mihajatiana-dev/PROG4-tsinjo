package com.example.demo.model;

import com.example.demo.model.enums.Status;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Donation {
  private Long id;
  private String email;
  private String fullName;
  private LocalDateTime date;
  private BigDecimal amount;
  private String paymentMethod;
  private Status status; // VERIFYING, SUCCEEDED, FAILED
  private String volaId;

  public Donation(
      Long id,
      String email,
      String fullName,
      LocalDateTime date,
      BigDecimal amount,
      String paymentMethod,
      Status status,
      String volaId) {
    this.id = id;
    this.email = email;
    this.fullName = fullName;
    this.date = date;
    this.amount = amount;
    this.paymentMethod = paymentMethod;
    this.status = status;
    this.volaId = volaId;
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

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public String getVolaId() {
    return volaId;
  }

  public void setVolaId(String volaId) {
    this.volaId = volaId;
  }
}
