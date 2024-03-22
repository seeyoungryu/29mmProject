package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Column(nullable = false, unique = true, length = 50)
    private final String email;
    @Column(nullable = false, length = 100)
    private final String password;
    @Column(nullable = false, length = 50)
    private final String name;
    @Column(nullable = false, length = 50)
    private final String phonenumber; // 수정된 부분: static 키워드 제거
    @Column(nullable = false, length = 50)
    private final String address;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // JPA를 위한 protected 기본 생성자
    protected User() {
        // 기본 생성자는 JPA 스펙을 만족하기 위해 필요하며, 여기서 final 필드를 초기화할 수 없습니다.
        this.email = null; // 실제로 이렇게 할당하지 않음, 예시를 위한 표현
        this.password = null; // 실제 사용 시에는 Builder를 통해 객체가 생성됩니다.
        this.name = null;
        this.phonenumber = null;
        this.address = null;
    }

    // Builder를 통한 객체 생성을 위한 private 생성자
    private User(String email, String password, String name, String phonenumber, String address) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.phonenumber = phonenumber; // 초기화 추가
        this.address = address;
    }

    // Getter 메소드들
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

    public String getPhonenumber() { // Getter 추가
        return phonenumber;
    }

    public String getAddress() {
        return address;
    }

    // Builder 정적 클래스와 관련 메소드 생략
}
