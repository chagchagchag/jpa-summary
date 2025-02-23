package io.summary.jpa.jpa_summary.repository.fixtures;

import javax.sql.DataSource;
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Profile({"mysql-test"})
@Component
public class BookPublisherDataset {
  private final DataSource dataSource;
  public BookPublisherDataset(DataSource dataSource){
    this.dataSource = dataSource;
  }

  @Transactional
  public void fetchDataSql(){
    ClassPathResource resource = new ClassPathResource("dataset/1_book_publisher/data.sql");
    ResourceDatabasePopulator populator = new ResourceDatabasePopulator(resource);
    populator.execute(dataSource);
  }
}
