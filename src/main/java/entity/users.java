package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class users {                                    //private으로 선언 필요한지 확인해야 함

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 50)
    private String email;

    @Column(nullable = false, length = 100)
    private String password;

    @Column(nullable = false, length = 50)
    private String name;




    // 빌더 패턴을 위한 Builder 정적 클래스 선언
    public static class Builder {
        // User 객체의 필드와 동일
        private String email;
        private String password;
        private String name;

        public Builder setEmail(String email) {
            this.email = email;
            return this; // 체이닝을 위해 자기 자신을 반환
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this; // 체이닝을 위해 자기 자신을 반환
        }

        public Builder setName(String name) {
            this.name = name;
            return this; // 체이닝을 위해 자기 자신을 반환
        }

        public users build() {
            // users 객체 생성 후, 필드 값 설정을 통해 객체 초기화
            users user = new users();
            user.email = this.email;
            user.password = this.password;
            user.name = this.name;
            return user;
        }
    }


    // Getter Method
    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }
}
