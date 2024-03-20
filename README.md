

<img alt="img.png" height="100" src="img.png" width="100"/>

# **29mm**

---

### **프로젝트 개요**

### 29mm 는 e-commerce 서비스로, 29cm 를 벤치마킹한 웹 사이트 입니다.

**사용 기술 스택**

- Java17
- Spring Boot 3.2
- Spring Data JPA
- (QueryDSL)
- (Redis)
- MySQL
- (Docker)
- (Github Actions)

**프로젝트목표**


### **✔️기능**

**✅ 회원가입, 로그인**

- 회원가입 기능을 제공합니다.
- 로그인
- 로그아웃 기능을 제공합니다.

**✅ 상품**

**✅ 주문**

**✅ 포인트**

**✅ 알림**

**프로젝트 주요 이슈해결사항**

- 

### **ERD**

(페이지)

### **API (Swagger)**

(페이지)

## Git & Code Convention

- **Git Convention**
    - Feat: 새로운 기능을 추가할 경우
    - Update: 기능을 수정한 경우
    - Fix: 버그를 고친 경우
    - Refactor: 코드 리팩토링
    - Rename: 파일 혹은 폴더명을 수정하거나, 옮기는 작업을 한 경우
    - Remove: 파일을 삭제하는 작업을 수행힌 경우

---

- **Code Convention**
    - class 기능별 lombok annotation 통일
    - entity @Setter 지양
    - 중복되는 로직은 하나의 함수로 만들어서 사용
    - @Transactional annotation - 코드 수정/추가 시에 실수 방지 ,단순히 조회 메소드의 경우 (readOnly = true) 적용
    - @RequestDto - @NoArgsConstructor(access = AccessLevel.PROTECTED) 적용- 무분별한 객체 생성 제한
