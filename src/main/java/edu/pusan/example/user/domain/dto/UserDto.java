package edu.pusan.example.user.domain.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserDto {
  private String userId;
  private String pwd;
  private String name;
  private String deptCd;
  private String deptNm;
  private String job;
  private String email;
  private String phone;
}
