package dto;


import lombok.*;


// 요청 데이터의 검증 및 전달을 목적 - 사용자 입력 데이터를 처리
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class UserRequestDto {


    private String email;


    private String password;

    private String name;

    private String phoneNumber;

    private String address;


}
