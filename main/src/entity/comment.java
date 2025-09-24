@Entity
@Table(name = "comments")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Comment {
    @Id @GeneratedValue Long id;


    @ManyToOne
    private Session session;


    @ManyToOne
    private User author;


    @Column(length = 2000)
    private String content;


    private LocalDateTime createdAt;
}