package au.com.example.QuizApp.models.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "questions")
public class Question extends AuditModel {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(generator = "question_generator")
  @SequenceGenerator(name = "question_generator", sequenceName = "question_sequence", initialValue = 1000)
  private Long id;

  @NotBlank
  @Size(min = 3, max = 100)
  private String title;

  @Column(columnDefinition = "text")
  private String description;

  // Getters and Setters
  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String desc) {
    this.description = desc;
  }
}