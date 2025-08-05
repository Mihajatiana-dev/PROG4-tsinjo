package com.example.demo.dao;

import com.example.demo.model.Donation;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class DonationDao {
  private final JdbcTemplate jdbcTemplate;

  public DonationDao(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  public List<Donation> findAll() {
    String sql = "SELECT * FROM donation ORDER BY date DESC";
    return jdbcTemplate.query(
        sql,
        (rs, rowNum) -> {
          Donation donation = new Donation();
          donation.setId(rs.getLong("id"));
          donation.setEmail(rs.getString("email"));
          donation.setFullName(rs.getString("full_name"));
          donation.setDate(rs.getTimestamp("date").toLocalDateTime());
          donation.setAmount(rs.getBigDecimal("amount"));
          donation.setPaymentMethod(rs.getString("payment_method"));
          donation.setStatus(rs.getString("status"));
          donation.setVolaId(rs.getString("vola_id"));
          return donation;
        });
  }

  public void save(Donation donation) {
    String sql =
        "INSERT INTO donation (email, full_name, date, amount, payment_method, status, vola_id) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
    jdbcTemplate.update(
        sql,
        donation.getEmail(),
        donation.getFullName(),
        donation.getDate(),
        donation.getAmount(),
        donation.getPaymentMethod(),
        donation.getStatus(),
        donation.getVolaId());
  }

  public void updateStatus(Long id, String status) {
    String sql = "UPDATE donation SET status = ? WHERE id = ?";
    jdbcTemplate.update(sql, status, id);
  }
}
