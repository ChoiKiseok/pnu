package edu.pusan.example.user.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name = "tb_user")
public class UserVO {
  @Id
  private String userId;
  private String userPwd;
  private String userNm;
  private String tel;
}
