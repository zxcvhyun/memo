package com.memo.dto;

import com.memo.domain.entity.MemberEntity;
import lombok.*;

@NoArgsConstructor
public class MemberDto {
    private String userid;
    private String password;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
