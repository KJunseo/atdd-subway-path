package wooteco.subway.member.dto;

import wooteco.subway.member.domain.Member;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class MemberRequest {
    @Email
    private String email;
    @NotBlank
    private String password;
    @NotNull
    private Integer age;

    public MemberRequest() {
    }

    public MemberRequest(String email, String password, int age) {
        this.email = email;
        this.password = password;
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    public Member toMember() {
        return new Member(email, password, age);
    }
}
