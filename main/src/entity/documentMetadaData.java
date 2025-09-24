@Entity
@Table(name = "documents")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DocumentMetadata {
    @Id @GeneratedValue Long id;
    private String originalFilename;
    private String storageFilename; // nombre en disco
    private String contentType;
    private Long size;
    private String path; // ruta relativa dentro del storage
    private LocalDateTime uploadedAt;


    @ManyToOne
    private User uploadedBy;
}