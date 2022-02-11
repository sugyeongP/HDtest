ORM(Object-relational mapping) 이란 (P521)
Object-relational mapping (객체 관계 매핑)
- Mybatis : DTO, Map 을 사용해서 데이터 베이스의 해당 테이블에 매핑을 시켜주는 개념
- ORM 프레임워크가 중간에서 매핑을 시켲는 개념

- Hibernate : EJB2 Entity Bean의 복잡도를 효율적으로 쉽게 구현한 ORM 프레임 워크 중에 하나

* JPA (Java Persistence API) 

 - ORM 기술 표준으로, 인터페이스의 모듬, 방향성을 제시
 
 - JPA 인터페이스를 구현한 대표적인 오픈소스가 Hibernate 이다.
 
 	[ Application ] ================> [ JPA 인터페이스 ]
 											|
 											|
 						Hibernate		TopLink			CocoBase
 						ㅡㅡㅡㅡㅡㅡㅡ		ㅡㅡㅡㅡㅡㅡ		ㅡㅡㅡㅡㅡㅡ
 						
* JPA 동작 방식 
  ※ cafe 828
* SQL을 직접 작성하는 방법이 아닌 객체 중심으로 개발
  
* application.properties ( Hibernate )
	#create  JPA Config 
	spring.jpa.hibernate.ddl-auto=create 
	spring.jpa.generate-ddl=false 
	spring.jpa.show-sql=true 
	spring.jpa.database=oracle 
	logging.level.org.hibernate=info
	
	spring.jpa.database-platform=org.hibernate.dialect.Oracle10gDialect

=====================================================================

* @Entity (P546)
	JPA를 사용해서 테이블과 매핑할 클래스는 @Entity 어노테이션을 필수로 붙여야 한다.
	@Entity가 붙은 클래스는 JPA가 관리한다.
	(이 어노테이션을 붙인 클래스를 JPA가 엔티티 클래스로 인식해서 관련 테이블과 자동으로 매핑한다.)
	
	- 기본 생성자는 필수. (파라미터가 없는 public 또는 protected 생성자)
	- final 클래스, enum, interface, inner 클래스에는 사용할 수 없다.
	- 저장할 필드에 final을 사용하면 안된다.
	
** @id : primary key
	[ Oracle ]
	- Oracle일 경우에는 sequence 테이블을 사용해서 PK로 등록하기 때문에
	- GeneratedValue annotaion의 generator와 SequenceGenerator annotation의 name 항목이 일치해야 한다.

	- @GeneratiedValue | @Id로 지정된 식별자 필드에 Primary Key 값을 생성하여 지정할 때 사용
		: 속성중에 strategy => 자동 생성 유형을 지정한다.
		: generator => 이미 생성된 Generator 이름을 지정한다.
		@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tboard2_seq")

** @Table : 엔티티와 매핑할 테이블을 지정한다.

<샘플 코드>
@Entity
@Table(name="tboard2")
public class Tboard {
   @Id 
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tboard2_seq") 
   @SequenceGenerator(sequenceName = "tboard2_seq", name = "tboard2_seq", allocationSize = 1)
   private int no;
   // 548페이지 : 문자열 길이값에 컬럼을 지정안하면 255, nullable 기본값 허용true)
   @Column(length = 100, nullable = true)
   private String title; 
   @Column(length = 45, nullable = true)
   private String writer; 
   private String content;
   @CreationTimestamp
   private Timestamp bdate;		


=====================================================================
