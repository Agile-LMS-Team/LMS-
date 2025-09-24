@Entity
@Table(name = "submissions")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Submission {
@Id @GeneratedValue Long id;


@ManyToOne
private Task task;


@ManyToOne
private User student;


@OneToOne(cascade = CascadeType.ALL)
private DocumentMetadata document;


private LocalDateTime submittedAt;
}