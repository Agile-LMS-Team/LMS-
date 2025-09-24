@Entity
@Table(name = "courses")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Course {
    @Id @GeneratedValue Long id;
    private String code;
    private String title;
    private String description;
}