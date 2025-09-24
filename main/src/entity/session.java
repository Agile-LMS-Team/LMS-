@Entity
@Table(name = "sessions")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Session {
    @Id @GeneratedValue Long id;
    private String title;
    @Column(length = 4000)
    private String description;
    private LocalDate date;
    private LocalTime startTime;
    private boolean published;


    @ManyToOne
    private Course course;


    @ManyToOne
    private User createdBy; // normalmente un docente
}