package LMS.domain.entity;


@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String fullName;


    @Column(unique = true, nullable = false)
    private String email; // usado como username


    private String password; // en la BD va en hash


    @Enumerated(EnumType.STRING)
    private RoleName role;
}