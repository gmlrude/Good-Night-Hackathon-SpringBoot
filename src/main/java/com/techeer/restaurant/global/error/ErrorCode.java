package com.techeer.restaurant.global.error;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
  // Global
  INTERNAL_SERVER_ERROR(500, "G001", "서버 오류"),
  INPUT_INVALID_VALUE(409, "G002", "잘못된 입력"),

  // Restaurant 도메인
  RESTAURANT_NOT_FOUND_ERROR(400, "R001", "레스토랑을 찾을 수 없음"),

  // Review 도메인
  REVIEW_NOT_FOUND_ERROR(400, "V001", "리뷰를 찾을 수 없음");

  private final int status;
  private final String code;
  private final String message;
}
