//package com.example.database.config;
//
//
//import com.example.database.model.StudentM;
//import jakarta.persistence.EntityManagerFactory;
//
//import org.springframework.boot.jpa.EntityManagerFactoryBuilder;
//import org.springframework.beans.factory.annotation.Qualifier;
//
//import org.springframework.boot.context.properties.ConfigurationProperties;
//
//import org.springframework.boot.jdbc.autoconfigure.DataSourceProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import javax.sql.DataSource;
//
//@Configuration
//@EnableJpaRepositories(
//        basePackages = "com.example.database.postgresql",
//        entityManagerFactoryRef = "postgresEntityManagerFactory",
//        transactionManagerRef = "postgresTransactionManager"
//)
//public class PostgreSqlConfig {
//
//    @Bean
//    @ConfigurationProperties("postgres.datasource")
//    public DataSourceProperties postgresDataSourceProperties() {
//        return new DataSourceProperties();
//    }
//    @Bean
//    public DataSource postgresDataSource() {
//
//        return postgresDataSourceProperties()
//                .initializeDataSourceBuilder()
//                .build();
//    }
//    @Bean
//    public LocalContainerEntityManagerFactoryBean postgresEntityManagerFactory(
//            EntityManagerFactoryBuilder builder) {
//        return builder
//                .dataSource(postgresDataSource())
//                .packages(StudentM.class)
//                .persistenceUnit("postgres")
//                .build();
//    }
//    @Bean
//    public JpaTransactionManager postgresTransactionManager(
//            @Qualifier("postgresEntityManagerFactory")
//            EntityManagerFactory entityManagerFactory) {
//        return new JpaTransactionManager(entityManagerFactory);
//    }
//}