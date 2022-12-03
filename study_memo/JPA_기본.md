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

### JPA 에서 데이터 변경하는 작업은 Transaction 안에서 작업
1. EntityManagerFactory 는 하나만 생성해서 애플리케이션 전체에서 공유
2. EntityManager 는 쓰레드 간에 공유 X(사용하고 버려야 한다.)
3. JPA 의 모든 데이터 변경은 Transaction 안에서 실행

### JPQL
* 원하는 데이터를 최적화하도록 도와줌
* 객체 그래프 탐색
* JPA 를 사용하면 엔티티 객체를 중심으로 개발, (테이블이 아닌) 객체를 대상으로 검색
* 모든 DB 데이터를 객체로 변환해서 검색하는 것은 불가능
* 애플리케이션이 필요한 데이터만 DB 에서 불러오려면결국 검색 조건이 포함된 SQL 이 필요