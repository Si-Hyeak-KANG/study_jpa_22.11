# 학습 MEMO

### 특정 DB에 종속되지 않는 JPA

-> 각각의 DB는 SQL 문법과 함수가 조금씩 다름

1. 가변 문자 : MySQL -> VARCHAR, Oracle -> VARCHAR2
2. 문자열 자르는 함수 : MySQL -> SUBSTRING(), Oracle -> SUBSTR()
3. 페이징 : MySQL -> LIMIT, Oracle -> ROWNUM

### JPA 구동 방식

1. Persistence 클래스로 시작
2. META_INF/persistence.xml 설정 정보 조회
3. EntityManagerFactory 클래스 생성
4. EntityManager 생성
