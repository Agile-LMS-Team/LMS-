@Entity
@Table(name = "tasks")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Task {
    @Id @GeneratedValue Long id;
    private String title;
    @Column(length = 4000)
    private String description;
    private LocalDate dueDate;
    private boolean published;


    @ManyToOne
    private Course course;


    @ManyToOne
    private User createdBy; // docente
}