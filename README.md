# spring-boot-mybatis

### Environment
- Java 11
- MyBatis
- MySQL
- Intellij


### DB Table
```sql
+---------+--------------+------+-----+---------+-------+
| Field   | Type         | Null | Key | Default | Extra |
+---------+--------------+------+-----+---------+-------+
| id      | varchar(64)  | NO   | PRI | NULL    |       |
| name    | varchar(64)  | YES  |     | NULL    |       |
| phone   | varchar(64)  | YES  |     | NULL    |       |
| address | varchar(256) | YES  |     | NULL    |       |
+---------+--------------+------+-----+---------+-------+
```


### What?
- 기존 Spring Legacy Project 로 실습을 하다가
- 최신 트렌드에 맞게 Spring-Boot로 만들어보고자 하여서 실습을 해봄
- REST API로 간단한 CRUD를 테스트 해보았음
