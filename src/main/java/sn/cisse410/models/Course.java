package sn.cisse410.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Course {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private String name;
        private String description;

        @ManyToMany
        @JoinTable(joinColumns = {
                        @JoinColumn(name = "course_id")
        }, inverseJoinColumns = {
                        @JoinColumn(name = "author_id")
        })
        private List<Author> authors;

        @OneToMany(mappedBy = "course")
        private List<Section> sections;
}
