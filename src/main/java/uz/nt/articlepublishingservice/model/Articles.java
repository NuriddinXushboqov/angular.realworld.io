package uz.nt.articlepublishingservice.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Articles {
    @Id
    @GeneratedValue(generator = "article_id")
    @SequenceGenerator(name = "article_id", sequenceName = "article_id_seq", allocationSize = 1)
    private Integer id;
    @NotEmpty
    @Column(name = "title", nullable = false)
    private String title;
    @NotEmpty
    @Column(name = "about", nullable = false)
    private String about;
    @NotEmpty
    @Column(name = "body", nullable = false)
    private String body;
    @CreationTimestamp
    @CreatedDate
    private LocalDateTime publishDate;
    @ManyToOne
    private Users author;
    @ManyToMany(mappedBy = "likes")
    private List<Users> likes = new ArrayList<>();
    @ManyToMany
    private Set<Tag> tags;
//    @OneToMany
//    private List<Comment> commentDtoList;

}
