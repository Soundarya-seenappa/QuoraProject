package com.project.collegequora.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
@Data
public class Response {
    private int code;
    private String message;
    private Object data;
}
