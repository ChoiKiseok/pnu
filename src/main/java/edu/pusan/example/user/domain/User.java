package edu.pusan.example.user.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name = "tb_user")
public class User {
  @Id
  private String userId;
  private String pwd;
  private String name;
  private String deptCd;
  private String job;
  private String email;
  private String phone;
}
