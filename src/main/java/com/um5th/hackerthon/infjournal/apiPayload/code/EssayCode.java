package com.um5th.hackerthon.infjournal.apiPayload.code;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@RequiredArgsConstructor
@Getter
public enum EssayCode implements BaseCode {
    TOPIC_NOT_EXISTS(HttpStatus.CONFLICT, "ESS_001", "존재하지 않는 토픽입니다.");

    private final HttpStatus httpStatus;
    private final String code;
    private final String message;
}