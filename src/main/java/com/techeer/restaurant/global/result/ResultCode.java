package com.techeer.restaurant.global.result;

import lombok.AllArgsConstructor;
import lombok.Getter;

/** {행위}_{목적어}_{성공여부} message 는 동사 명사형으로 마무리 */
@Getter
@AllArgsConstructor
public enum ResultCode {

  // Restaurant
  RESTAURANT_CREATE_SUCCESS("R001", "레스토랑 등록 성공"),
  RESTAURANT_GET_SUCCESS("R002", "레스토랑 조회 성공"),
  RESTAURANT_UPDATE_SUCCESS("R003", "레스토랑 수정 성공"),
  RESTAURANT_DELETE_SUCCESS("R004", "레스토랑 soft 삭제 성공"),

  // Review
  REVIEW_CREATE_SUCCESS("V001", "리뷰 작성 성공"),
  REVIEW_GET_SUCCESS("V002", "리뷰 조회 성공"),
  RESTAURANT_REVIEW_PAGING_GET_SUCCESS("V003", "레스토랑 별 리뷰 페이징 조회 성공"),
  REVIEW_UPDATE_SUCCESS("V003", "리뷰 수정 성공"),
  REVIEW_DELETE_SUCCESS("V004", "리뷰 hard 삭제 성공"),
  ;


  private final String code;
  private final String message;
}
