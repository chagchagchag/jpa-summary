package io.summary.jpa.jpa_summary.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "review")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(staticName = "ofAll")
public class Review {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", columnDefinition = "BIGINT")
  private Long id;

  @ManyToOne
  @JoinColumn(name = "book_id", columnDefinition = "BIGINT")
  private Book book;

  @OneToOne(mappedBy = "review", cascade = {CascadeType.MERGE, CascadeType.PERSIST})
  private ReviewUser reviewUser;

  @Column(name = "title", columnDefinition = "VARCHAR(100)")
  private String title;

  @Column(name = "contents", columnDefinition = "VARCHAR(3000)")
  private String contents;
}
